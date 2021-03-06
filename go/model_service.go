/*
 * GraphHopper Directions API
 *
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * API version: 1.0.0
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package graphhopper

type Service struct {
	// Unique identifier of service
	Id string `json:"id,omitempty"`

	// type of service
	Type_ string `json:"type,omitempty"`

	// priority of service
	Priority int32 `json:"priority,omitempty"`

	// name of service
	Name string `json:"name,omitempty"`

	Address *Address `json:"address,omitempty"`

	// duration of service, i.e. time in seconds the corresponding activity takes
	Duration int64 `json:"duration,omitempty"`

	// preparation time of service, e.g. search for a parking space. it only falls due if the location of previous activity differs from this location
	PreparationTime int64 `json:"preparation_time,omitempty"`

	// array of time windows. currently, only a single time window is allowed
	TimeWindows []TimeWindow `json:"time_windows,omitempty"`

	// array of capacity dimensions
	Size []int32 `json:"size,omitempty"`

	// array of required skills
	RequiredSkills []string `json:"required_skills,omitempty"`

	// array of allowed vehicle ids
	AllowedVehicles []string `json:"allowed_vehicles,omitempty"`

	// array of disallowed vehicle ids
	DisallowedVehicles []string `json:"disallowed_vehicles,omitempty"`

	// max time service can stay in vehicle
	MaxTimeInVehicle int64 `json:"max_time_in_vehicle,omitempty"`
}
