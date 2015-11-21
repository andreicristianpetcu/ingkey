'use strict';

angular.module('iNGKeyApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('u2f', {
                parent: 'payments',
                url: '/u2f',
                data: {
                    authorities: []
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/account/u2f/u2f.html',
                        controller: 'U2fController'
                    }
                },
                resolve: {
                    mainTranslatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate) {
                        return $translate.refresh();
                    }]
                }
            });
    });
