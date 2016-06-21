
angular.module('mobileApp')
    .controller('SidebarController', function ($scope, $rootScope, $cookieStore) {
      /**
       * Sidebar Toggle & Cookie Control
       */
      var mobileView = 992;

      $scope.getWidth = function() {
          return window.innerWidth;
      };

      $scope.$watch($scope.getWidth, function(newValue, oldValue) {
          if (newValue >= mobileView) {
              if (angular.isDefined($cookieStore.get('toggle'))) {
                  $rootScope.toggle = ! $cookieStore.get('toggle') ? false : true;
              } else {
                  $rootScope.toggle = true;
              }
          } else {
              $rootScope.toggle = false;
          }

      });

      $scope.toggleSidebar = function() {
          $rootScope.toggle = !$rootScope.toggle;
          $cookieStore.put('toggle', $rootScope.toggle);
      };

      window.onresize = function() {
          $scope.$apply();
      };
    });
