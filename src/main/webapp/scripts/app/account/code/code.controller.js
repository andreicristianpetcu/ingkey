'use strict';

angular.module('iNGKeyApp')
    .controller('CodeController', function ($rootScope, $scope, $state, $timeout, Auth, Principal) {
        $scope.enterCode = function (event) {
            event.preventDefault();
            Auth.enterCode({
                code: $scope.code
            }, function() {
                Principal.identity(true);
                $state.go('home');
            });
        };
    });
