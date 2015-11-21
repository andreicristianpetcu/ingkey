'use strict';

angular.module('iNGKeyApp')
    .controller('PaymentsController', function ($scope, $state, Principal) {
        Principal.identity().then(function(account) {
            $scope.account = account;
            $scope.isAuthenticated = Principal.isAuthenticated;
        });

        $scope.redirect = function(event) {
            $state.go('u2f');
        }

    });
