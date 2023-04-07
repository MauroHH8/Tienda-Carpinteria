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
import CartDTO from './CartDTO';
import ProductDTO from './ProductDTO';

/**
 * The ProductCartDTO model module.
 * @module com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/ProductCartDTO
 * @version 1.0.0
 */
class ProductCartDTO {
    /**
     * Constructs a new <code>ProductCartDTO</code>.
     * @alias module:com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/ProductCartDTO
     */
    constructor() { 
        
        ProductCartDTO.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ProductCartDTO</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/ProductCartDTO} obj Optional instance to populate.
     * @return {module:com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/ProductCartDTO} The populated <code>ProductCartDTO</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ProductCartDTO();

            if (data.hasOwnProperty('cart')) {
                obj['cart'] = CartDTO.constructFromObject(data['cart']);
            }
            if (data.hasOwnProperty('product')) {
                obj['product'] = ProductDTO.constructFromObject(data['product']);
            }
            if (data.hasOwnProperty('qty')) {
                obj['qty'] = ApiClient.convertToType(data['qty'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {module:com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/CartDTO} cart
 */
ProductCartDTO.prototype['cart'] = undefined;

/**
 * @member {module:com.eduit.bootcamp.cart-ui/com.eduit.bootcamp.cart-ui.model/ProductDTO} product
 */
ProductCartDTO.prototype['product'] = undefined;

/**
 * the stock quantity.
 * @member {Number} qty
 */
ProductCartDTO.prototype['qty'] = undefined;






export default ProductCartDTO;

