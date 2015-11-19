 'use strict';

angular.module('iNGKeyApp')
    .factory('notificationInterceptor', function ($q, AlertService) {
        return {
            response: function(response) {
                var alertKey = response.headers('X-iNGKeyApp-alert');
                if (angular.isString(alertKey)) {
                    AlertService.success(alertKey, { param : response.headers('X-iNGKeyApp-params')});
                }
                return response;
            }
        };
    });
