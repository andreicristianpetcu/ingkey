'use strict';

angular.module('iNGKeyApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


