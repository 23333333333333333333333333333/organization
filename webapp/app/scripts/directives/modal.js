'use strict';

/**
 * @ngdoc directive
 * @name webappApp.directive:modal
 * @description
 * # modal
 */
angular.module('organizationAppApp')
  .directive('modal', function() {
    return {
      templateUrl: 'views/directive/modal.html',
      restrict: 'E',
      transclude: true,
      scope: {
        send: '=send'
      },
      link: function postLink(scope, element) {
        
        var modal = element.find('#myModal');
        element.find('#submit').bind('click', function() {
          modal.modal('hide');
          modal.on('hidden.bs.modal', function() {
            scope.send();
            console.log("hola datevid");
            modal.unbind();
          });
        });
      }
    };
  });
