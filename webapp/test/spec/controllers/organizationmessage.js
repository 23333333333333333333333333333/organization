'use strict';

describe('Controller: OrganizationmessageCtrl', function () {

  // load the controller's module
  beforeEach(module('organizationAppApp'));

  var OrganizationmessageCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    OrganizationmessageCtrl = $controller('OrganizationmessageCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(OrganizationmessageCtrl.awesomeThings.length).toBe(3);
  });
});
