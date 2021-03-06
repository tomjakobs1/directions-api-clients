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


/**
 * 
 * @param calc_points indicates whether solution should come with route geometries
 * @param consider_traffic indicates whether historical traffic information should be considered
 * @param network_data_provider specifies the data provider
 * @param fail_fast indicates whether matrix calculation should fail fast when points cannot be connected
 */
data class Routing (
    /* indicates whether solution should come with route geometries */
    val calc_points: kotlin.Boolean? = null,
    /* indicates whether historical traffic information should be considered */
    val consider_traffic: kotlin.Boolean? = null,
    /* specifies the data provider */
    val network_data_provider: Routing.NetworkDataProvider? = null,
    /* indicates whether matrix calculation should fail fast when points cannot be connected */
    val fail_fast: kotlin.Boolean? = null
) {

    /**
    * specifies the data provider
    * Values: openstreetmap,tomtom
    */
    enum class NetworkDataProvider(val value: kotlin.Any){
    
        openstreetmap("openstreetmap"),
    
        tomtom("tomtom");
    
    }

}

