package com.org.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlightBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightId;
	private String fromCity;
	private String toCity;
	private String arrivalTime;
	private String departureTime;
	private String totalSeats;
	private int price;
	
	
	public FlightBean() {
		super();
	}


	


	public int getPrice() {
		return price;
	}





	public void setPrice(int price) {
		this.price = price;
	}





	public FlightBean(int flightId, String fromCity, String toCity, String arrivalTime, String departureTime,
			String totalSeats, int price) {
		super();
		this.flightId = flightId;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.totalSeats = totalSeats;
		this.price = price;
	}





	public int getFlightId() {
		return flightId;
	}


	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}


	public String getFromCity() {
		return fromCity;
	}


	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}


	public String getToCity() {
		return toCity;
	}


	public void setToCity(String toCity) {
		this.toCity = toCity;
	}


	public String getArrivalTime() {
		return arrivalTime;
	}


	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}


	public String getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}


	public String getTotalSeats() {
		return totalSeats;
	}


	public void setTotalSeats(String totalSeats) {
		this.totalSeats = totalSeats;
	}


	@Override
	public String toString() {
		return "FlightBean [flightId=" + flightId + ", fromCity=" + fromCity + ", toCity=" + toCity + ", arrivalTime="
				+ arrivalTime + ", departureTime=" + departureTime + ",totalSeats="
				+ totalSeats + "]";
	}


	

}
