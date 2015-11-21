'use strict';

angular.module('iNGKeyApp')
    .controller('CodeController', function ($rootScope, $scope, $state, $timeout, Auth, Principal) {
        $scope.code = '';

        $scope.enterCode = function (event) {
            event.preventDefault();
            if ($scope.code && $scope.code.length > 20) {
                $scope.code = '';

                Auth.enterCode({
                    code: $scope.code
                }, function() {
                    Principal.identity(true);
                    $state.go('payments');
                });
            }

        };
    });
