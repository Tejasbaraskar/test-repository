package com.org.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.model.FlightBean;
import com.org.service.FlightService2;




@RestController
@RequestMapping("/flight")
public class FlightController2 {
	
	@Autowired
	FlightService2 service;
	
	@PostMapping(value = "/flightAdded")
	public FlightBean insertFlight(@RequestBody FlightBean flight) {
		System.out.println(flight.getPrice());
		return service.insertFlight(flight);
	}

	
	@PostMapping(value = "/flightUpdated")
	public FlightBean updateFlight(@RequestParam int flightId,@ModelAttribute FlightBean flight) {
		return service.updateFlight(flightId,flight);
	}
	
	@GetMapping(value = "/flightDeleted")
	public void deleteFlight(@RequestParam int flightId,FlightBean flight) {
		service.deleteFlight(flightId);
	}
	
	@GetMapping(value = "/availableFlights1/{fromCity}/{toCity}")
	public List<FlightBean> queryByFromCityAndToCity(@PathVariable("fromCity") String fromCity,@PathVariable("toCity") String toCity){
		List<FlightBean> list = new ArrayList<>();
		System.out.println(fromCity);
		System.out.println(toCity);
		list = service.queryByFromCityAndToCity(fromCity,toCity);
		System.out.println(service.queryByFromCityAndToCity(fromCity,toCity));
		return list;
	}
	    
	    @GetMapping(value = "/getAllFlights")
	    public String getAllFlights(Model model,FlightBean flight){
	        List<FlightBean> list = new ArrayList<>();
	        list = (List<FlightBean>) service.getAllFlights();
	        int size = list.size();
	        model.addAttribute("size",size);
	        for(int i=0;i<list.size();i++)
	        {
	              List<Integer> forFlightId = list.stream().map(FlightBean ->
	              FlightBean.getFlightId()).collect(Collectors.toList()); Integer flightId =
	              forFlightId.get(0); List<String> forDepartureCity =
	              list.stream().map(FlightBean ->
	              FlightBean.getFromCity()).collect(Collectors.toList()); String departureCity
	              = forDepartureCity.get(0); List<String> forArrivalCity =
	              list.stream().map(FlightBean ->
	              FlightBean.getToCity()).collect(Collectors.toList()); String arrivalCity =
	              forArrivalCity.get(0); List<String> forTotalSeats =
	              list.stream().map(FlightBean ->
	              FlightBean.getTotalSeats()).collect(Collectors.toList()); String totalSeats =
	              forTotalSeats.get(0); List<String> forDepartureTime =
	              list.stream().map(FlightBean ->
	              FlightBean.getDepartureTime()).collect(Collectors.toList()); String
	              departureTime = forDepartureTime.get(0); List<Integer> forPrice =
	              list.stream().map(FlightBean ->
	              FlightBean.getPrice()).collect(Collectors.toList()); Integer price =
	              forPrice.get(0); model.addAttribute("flightId",flightId);
	              model.addAttribute("departureCity",departureCity);
	              model.addAttribute("arrivalCity",arrivalCity);
	              model.addAttribute("totalSeats",totalSeats);
	              model.addAttribute("departureTime",departureTime);
	              model.addAttribute("price",price);
	             
	        }
	        return "getAllFlights";
	        }
	}
	
	
	


