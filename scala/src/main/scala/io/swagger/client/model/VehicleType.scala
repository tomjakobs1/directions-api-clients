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

package io.swagger.client.model


case class VehicleType (
  // Unique identifier for the vehicle type
  typeId: Option[String] = None,
  // Profile of vehicle type
  profile: Option[String] = None,
  // array of capacity dimensions
  capacity: Option[List[Integer]] = None,
  // speed_factor of vehicle type
  speedFactor: Option[Double] = None,
  // service time factor of vehicle type
  serviceTimeFactor: Option[Double] = None,
  // cost parameter per distance unit, here meter is used
  costPerMeter: Option[Double] = None,
  // cost parameter per time unit, here second is used
  costPerSecond: Option[Double] = None,
  // cost parameter vehicle activation, i.e. fixed costs per vehicle
  costPerActivation: Option[Double] = None
)

