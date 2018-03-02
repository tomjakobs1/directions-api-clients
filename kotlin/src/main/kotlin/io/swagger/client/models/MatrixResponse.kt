/**
* GraphHopper Directions API
* You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.client.models

import io.swagger.client.models.ResponseInfo

/**
 * 
 * @param distances 
 * @param times 
 * @param weights 
 * @param info 
 */
data class MatrixResponse (
    val distances: kotlin.Array<kotlin.Array<java.math.BigDecimal>>? = null,
    val times: kotlin.Array<kotlin.Array<java.math.BigDecimal>>? = null,
    val weights: kotlin.Array<kotlin.Array<kotlin.Double>>? = null,
    val info: ResponseInfo? = null
) {

}
