'use strict';

describe('Controller: PersonalcenterPersonalcenterCtrl', function () {

  // load the controller's module
  beforeEach(module('organizationAppApp'));

  var PersonalcenterPersonalcenterCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    PersonalcenterPersonalcenterCtrl = $controller('PersonalcenterPersonalcenterCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(PersonalcenterPersonalcenterCtrl.awesomeThings.length).toBe(3);
  });
});
