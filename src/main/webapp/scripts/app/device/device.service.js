'use strict';

angular.module('mobileApp')
    .factory('Device', function ($resource) {
        return $resource('rest/device', {}, {
                'query': {method: 'GET', isArray: true},
                'get': {
                    method: 'GET',
                    transformResponse: function (data) {
                        data = angular.fromJson(data);
                        return data;
                    }
                },
                'save': { method:'POST' },
                'delete':{ method:'DELETE'}
            });
        });
