'use strict';

angular.module('iNGKeyApp')
    .controller('NavbarMainController', function ($scope, $location, $state, Auth, Principal) {
        Principal.identity().then(function (account) {
            $scope.account = account;
        });

        $scope.isAuthenticated = Principal.isAuthenticated;
        $scope.$state = $state;

    });
