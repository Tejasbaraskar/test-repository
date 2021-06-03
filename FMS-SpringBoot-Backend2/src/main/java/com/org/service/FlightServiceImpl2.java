package com.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dao.FlightRepository2;
import com.org.model.FlightBean;



@Service
public class FlightServiceImpl2 implements FlightService2{

	@Autowired
	FlightRepository2 repository;
	
	@Override
	public FlightBean insertFlight(FlightBean flight) {
		return repository.save(flight);
	}

	public FlightBean updateFlight(int flightId,FlightBean flight) {
		if(repository.existsById(flightId))
			deleteFlight(flightId);
		return repository.save(flight);	
	}

	@Override
	public void deleteFlight(int flightId) {
		repository.deleteById(flightId);
	}

	public List<FlightBean> queryByFromCityAndToCity(String fromCity,String toCity){
        return repository.queryByFromCityAndToCity(fromCity, toCity);
    }

 

    @Override
    public Iterable<FlightBean> getAllFlights() {
        return repository.findAll();
    }
	
	
}
