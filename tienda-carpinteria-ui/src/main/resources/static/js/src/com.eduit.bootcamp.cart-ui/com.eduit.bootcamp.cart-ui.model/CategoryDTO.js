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
 * The CategoryDTO model module.
 * @module com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/CategoryDTO
 * @version 1.0.0
 */
class CategoryDTO {
    /**
     * Constructs a new <code>CategoryDTO</code>.
     * @alias module:com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/CategoryDTO
     * @param name {String} 
     * @param dateCreated {Date} 
     */
    constructor(name, dateCreated) { 
        
        CategoryDTO.initialize(this, name, dateCreated);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, dateCreated) { 
        obj['name'] = name;
        obj['dateCreated'] = dateCreated;
    }

    /**
     * Constructs a <code>CategoryDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/CategoryDTO} obj Optional instance to populate.
     * @return {module:com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/CategoryDTO} The populated <code>CategoryDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CategoryDTO();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('parentCategoryId')) {
                obj['parentCategoryId'] = ApiClient.convertToType(data['parentCategoryId'], 'Number');
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
 * @member {Number} id
 */
CategoryDTO.prototype['id'] = undefined;

/**
 * @member {String} name
 */
CategoryDTO.prototype['name'] = undefined;

/**
 * @member {Number} parentCategoryId
 */
CategoryDTO.prototype['parentCategoryId'] = undefined;

/**
 * @member {Date} dateCreated
 */
CategoryDTO.prototype['dateCreated'] = undefined;

/**
 * @member {Date} dateDeleted
 */
CategoryDTO.prototype['dateDeleted'] = undefined;






export default CategoryDTO;

