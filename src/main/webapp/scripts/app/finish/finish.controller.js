'use strict';

angular.module('iNGKeyApp')
    .controller('FinishController', function ($scope, Principal) {
        Principal.identity().then(function(account) {
            $scope.account = account;
            $scope.isAuthenticated = Principal.isAuthenticated;
        });


    });
