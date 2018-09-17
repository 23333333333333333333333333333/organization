'use strict';

/**
 * @ngdoc function
 * @name organizationAppApp.controller:MenuctrlCtrl
 * @description
 * # MenuctrlCtrl
 * Controller of the organizationAppApp
 */
angular.module('organizationAppApp')
  .controller('MenuCtrl', function ($scope, login) {
  	var self = this;
  	self.init = function() {
  		$scope.user = {};
  	};
  	$scope.login = function() {
  		login.login($scope.user, function(data) {
  			$scope.user = data;
  			console.log($scope.user);
  		});
  	};
  	self.init();
  });
