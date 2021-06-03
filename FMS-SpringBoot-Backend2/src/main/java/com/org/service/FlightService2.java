package com.org.service;

import java.util.List;

import com.org.model.FlightBean;

public interface FlightService2 {

	FlightBean insertFlight(FlightBean flight);
	FlightBean updateFlight(int flightId,FlightBean flight);
	void deleteFlight(int flightId);
	Iterable<FlightBean> getAllFlights();
	List<FlightBean> queryByFromCityAndToCity(String fromCity, String toCity);
}
