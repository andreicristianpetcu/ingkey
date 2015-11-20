'use strict';

angular.module('iNGKeyApp')
    .controller('ActivationController', function ($scope, $stateParams, Auth, yubiChallangeData) {

        u2f.register(yubiChallangeData.data.registerRequests, yubiChallangeData.data.authenticateRequests, function (data) {

            if (data.errorCode) {
                alert("U2F failed with error: " + data.errorCode);
                return;
            }

            Auth.activateAccount({key: $stateParams.key}).then(function () {
                $scope.error = null;
                $scope.success = 'OK';
            }).catch(function () {
                $scope.success = null;
                $scope.error = 'ERROR';
            });
        });
    });

