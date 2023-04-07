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

import ApiClient from '../ApiClient';

/**
 * The UserRequestDTO model module.
 * @module com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/UserRequestDTO
 * @version 1.0.0
 */
class UserRequestDTO {
    /**
     * Constructs a new <code>UserRequestDTO</code>.
     * @alias module:com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/UserRequestDTO
     * @param firstName {String} 
     * @param lastName {String} 
     * @param dni {Number} 
     * @param dateOfBirthday {Date} 
     * @param address {String} 
     * @param email {String} this field represent the user email
     * @param password {String} 
     */
    constructor(firstName, lastName, dni, dateOfBirthday, address, email, password) { 
        
        UserRequestDTO.initialize(this, firstName, lastName, dni, dateOfBirthday, address, email, password);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, firstName, lastName, dni, dateOfBirthday, address, email, password) { 
        obj['firstName'] = firstName;
        obj['lastName'] = lastName;
        obj['dni'] = dni;
        obj['dateOfBirthday'] = dateOfBirthday;
        obj['address'] = address;
        obj['email'] = email;
        obj['password'] = password;
    }

    /**
     * Constructs a <code>UserRequestDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/UserRequestDTO} obj Optional instance to populate.
     * @return {module:com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/UserRequestDTO} The populated <code>UserRequestDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserRequestDTO();

            if (data.hasOwnProperty('firstName')) {
                obj['firstName'] = ApiClient.convertToType(data['firstName'], 'String');
            }
            if (data.hasOwnProperty('lastName')) {
                obj['lastName'] = ApiClient.convertToType(data['lastName'], 'String');
            }
            if (data.hasOwnProperty('dni')) {
                obj['dni'] = ApiClient.convertToType(data['dni'], 'Number');
            }
            if (data.hasOwnProperty('dateOfBirthday')) {
                obj['dateOfBirthday'] = ApiClient.convertToType(data['dateOfBirthday'], 'Date');
            }
            if (data.hasOwnProperty('address')) {
                obj['address'] = ApiClient.convertToType(data['address'], 'String');
            }
            if (data.hasOwnProperty('email')) {
                obj['email'] = ApiClient.convertToType(data['email'], 'String');
            }
            if (data.hasOwnProperty('password')) {
                obj['password'] = ApiClient.convertToType(data['password'], 'String');
            }
            if (data.hasOwnProperty('dateCreated')) {
                obj['dateCreated'] = ApiClient.convertToType(data['dateCreated'], 'Date');
            }
            if (data.hasOwnProperty('dateDeleted')) {
                obj['dateDeleted'] = ApiClient.convertToType(data['dateDeleted'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * @member {String} firstName
 */
UserRequestDTO.prototype['firstName'] = undefined;

/**
 * @member {String} lastName
 */
UserRequestDTO.prototype['lastName'] = undefined;

/**
 * @member {Number} dni
 */
UserRequestDTO.prototype['dni'] = undefined;

/**
 * @member {Date} dateOfBirthday
 */
UserRequestDTO.prototype['dateOfBirthday'] = undefined;

/**
 * @member {String} address
 */
UserRequestDTO.prototype['address'] = undefined;

/**
 * this field represent the user email
 * @member {String} email
 */
UserRequestDTO.prototype['email'] = undefined;

/**
 * @member {String} password
 */
UserRequestDTO.prototype['password'] = undefined;

/**
 * @member {Date} dateCreated
 */
UserRequestDTO.prototype['dateCreated'] = undefined;

/**
 * @member {Date} dateDeleted
 */
UserRequestDTO.prototype['dateDeleted'] = undefined;






export default UserRequestDTO;

