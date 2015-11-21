'use strict';

angular.module('iNGKeyApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('finish', {
                parent: 'site',
                url: '/finish',
                data: {
                    authorities: []
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/finish/finish.html',
                        controller: 'FinishController'
                    }
                }
            });
    });
