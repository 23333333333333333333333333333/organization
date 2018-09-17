'use strict';

describe('Service: login/login', function () {

  // load the service's module
  beforeEach(module('organizationAppApp'));

  // instantiate service
  var login/login;
  beforeEach(inject(function (_login/login_) {
    login/login = _login/login_;
  }));

  it('should do something', function () {
    expect(!!login/login).toBe(true);
  });

});
