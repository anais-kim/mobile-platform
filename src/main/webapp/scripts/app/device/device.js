'use strict';

angular.module('mobileApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('home', {
                parent: 'site',
                url: '/',
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/device/device.html',
                        controller: 'DeviceController'
                    }
                }
            });
    });
