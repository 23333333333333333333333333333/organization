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
    'ngTouch'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'main'
      })
      .when('/about', {
        templateUrl: 'views/index.html',
        controller: 'AboutCtrl',
        controllerAs: 'about'
      })
      .when('/contact',{
        templateUrl:'views/organizationMessage.html'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
