'use strict';

angular.module('iNGKeyApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('code', {
                parent: 'account',
                url: '/code',
                data: {
                    authorities: ['ROLE_PRE_AUTH_USER']
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/account/code/code.html',
                        controller: 'CodeController'
                    }
                },
                resolve: {
                    mainTranslatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate) {
                        return $translate.refresh();
                    }]
                }
            });
    });
