package com.org.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.org.model.FlightBean;





public interface FlightRepository2 extends CrudRepository<FlightBean, Integer> {

	  public List<FlightBean> queryByFromCityAndToCity(String fromCity,String toCity);

	  
}
