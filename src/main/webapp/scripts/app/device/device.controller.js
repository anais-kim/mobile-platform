'use strict';

angular.module('mobileApp')
    .controller('DeviceController', function ($scope, Device) {
            $scope.deviceList = Device.query();
    });
