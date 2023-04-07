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
 * The EmptyResponseDTO model module.
 * @module com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/EmptyResponseDTO
 * @version 1.0.0
 */
class EmptyResponseDTO {
    /**
     * Constructs a new <code>EmptyResponseDTO</code>.
     * @alias module:com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/EmptyResponseDTO
     */
    constructor() { 
        
        EmptyResponseDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EmptyResponseDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/EmptyResponseDTO} obj Optional instance to populate.
     * @return {module:com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/EmptyResponseDTO} The populated <code>EmptyResponseDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EmptyResponseDTO();

            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * @member {Date} date
 */
EmptyResponseDTO.prototype['date'] = undefined;






export default EmptyResponseDTO;

