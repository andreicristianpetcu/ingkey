'use strict';

angular.module('iNGKeyApp')
    .controller('PaymentsController', function ($scope, $state, Principal) {
        Principal.identity().then(function(account) {
            $scope.account = account;
            $scope.isAuthenticated = Principal.isAuthenticated;
        });

        $scope.redirect = function() {

            $('#promptModal').modal('show');


            var request = {
                "challenge": "bbfB9hJpZWFhafmNcxM7ZULNPEObp8Yx6T5ANSD7XBs",
                "version": "U2F_V2",
                "appId": "http://localhost:8080"
            };
            console.log("Register: ", request);

            u2f.register([request], [], function (data) {
                console.log("Register callback", data);

                console.log(JSON.stringify(data));
            })


            setTimeout(function(){
                $('#promptModal').modal('hide');
                $state.go('finish');
            }, 2000)
        }

        $scope.abort = function() {
            $('#promptModal').modal('hide');
        }


        $scope.askForYubi = function(){
            u2f.register([], [], function (data) {

                if (data.errorCode) {
                    alert("U2F failed with error: " + data.errorCode);
                    return;
                }

                //$state.go('');
            });
        }

    });
