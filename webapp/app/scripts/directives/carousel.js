'use strict';

/**
 * @ngdoc directive
 * @name organizationAppApp.directive:carousel
 * @description
 * # carousel
 */
angular.module('organizationAppApp')
	.directive('carousel', function() {
		return {
			scope: {
				pictures: '='
			},
			templateUrl: 'views/directive/carousel.html',
			restrict: 'E',
			link: function postLink(scope, element, attrs) {
				var carousel = element.find('#carousel');
				scope.carouselBynumber = function(number) {
					carousel.carousel(number);
				};
				carousel.carousel({
					interval: 2000
				});
			}
		};
	});