/**
 * Tienda de Carpinteria - OpenAPI 3.0
 * Tienda web de carpinteria
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: desarrolloweb@tiendaweb.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/com.eduit.bootcamp.cart-ui/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/com.eduit.bootcamp.cart-ui/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.TiendaDeCarpinteriaOpenApi30);
  }
}(this, function(expect, TiendaDeCarpinteriaOpenApi30) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new TiendaDeCarpinteriaOpenApi30.UserRoleDTO();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('UserRoleDTO', function() {
    it('should create an instance of UserRoleDTO', function() {
      // uncomment below and update the code to test UserRoleDTO
      //var instance = new TiendaDeCarpinteriaOpenApi30.UserRoleDTO();
      //expect(instance).to.be.a(TiendaDeCarpinteriaOpenApi30.UserRoleDTO);
    });

    it('should have the property email (base name: "email")', function() {
      // uncomment below and update the code to test the property email
      //var instance = new TiendaDeCarpinteriaOpenApi30.UserRoleDTO();
      //expect(instance).to.be();
    });

    it('should have the property role (base name: "role")', function() {
      // uncomment below and update the code to test the property role
      //var instance = new TiendaDeCarpinteriaOpenApi30.UserRoleDTO();
      //expect(instance).to.be();
    });

    it('should have the property level (base name: "level")', function() {
      // uncomment below and update the code to test the property level
      //var instance = new TiendaDeCarpinteriaOpenApi30.UserRoleDTO();
      //expect(instance).to.be();
    });

    it('should have the property dateCreated (base name: "dateCreated")', function() {
      // uncomment below and update the code to test the property dateCreated
      //var instance = new TiendaDeCarpinteriaOpenApi30.UserRoleDTO();
      //expect(instance).to.be();
    });

    it('should have the property dateDeleted (base name: "dateDeleted")', function() {
      // uncomment below and update the code to test the property dateDeleted
      //var instance = new TiendaDeCarpinteriaOpenApi30.UserRoleDTO();
      //expect(instance).to.be();
    });

  });

}));