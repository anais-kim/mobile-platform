'use strict';

var mobileApp = angular.module('mobileApp', ['ui.router', 'ngResource', 'ngCookies']);

mobileApp.config(function ($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise('/');
    $stateProvider.state('site', {
        'abstract': true,
        views: {
            'navbar@': {
                templateUrl: 'scripts/components/navbar/navbar.html',
                controller: 'NavbarController'
            },
            'sidebar@': {
                templateUrl: 'scripts/components/sidebar/sidebar.html',
                controller: 'SidebarController'
            }
        }
    });

});
