'use strict';

angular.module('iNGKeyApp')
    .controller('PaymentsController', function ($scope, Principal) {
        Principal.identity().then(function(account) {
            $scope.account = account;
            $scope.isAuthenticated = Principal.isAuthenticated;
        });
    });
