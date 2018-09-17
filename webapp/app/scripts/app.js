'use strict';

/**
 * @ngdoc overview
 * @name organizationAppApp
 * @description
 * # organizationAppApp
 *
 * Main module of the application.
 */
angular
  .module('organizationAppApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    'ui.router'
  ]).config(function($provide) {
    var callback = function(data) {
      $provide.constant('stateConfig', data);
    };
    $.ajax({
      url: "http://localhost:9000/config/config.json",
      dataType: "json",
      success: callback,
      async: false
    });

  })
  .config(function($stateProvider, $urlRouterProvider, stateConfig) {
    angular.forEach(stateConfig, function(value) {
      $stateProvider
        .state({
          name: value.name,
          url: value.url,
          templateUrl: value.templateUrl,
          controller: value.controller
        });
    });
    $urlRouterProvider.otherwise('/');
  });