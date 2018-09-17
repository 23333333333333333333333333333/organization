'use strict';

/**
 * @ngdoc service
 * @name organizationAppApp.login/login
 * @description
 * # login/login
 * Service in the organizationAppApp.
 */
angular.module('organizationAppApp')
  .service('login', function ($http) {
    // AngularJS will instantiate a singleton by calling "new" on this function
    this.login = function(data, callBack) {
    	$http.post('http://localhost:8080/login/', data)
    	.then(function(reponse) {
    		callBack(reponse.data);
    	}, function() {
    		console.log('login fail');
    	});
    };
  });
