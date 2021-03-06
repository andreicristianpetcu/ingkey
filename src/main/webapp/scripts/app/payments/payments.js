'use strict';

angular.module('iNGKeyApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('payments', {
                parent: 'code',
                url: '/payments',
                data: {
                    authorities: []
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/payments/payments.html',
                        controller: 'PaymentsController'
                    }
                }
            });
    });
