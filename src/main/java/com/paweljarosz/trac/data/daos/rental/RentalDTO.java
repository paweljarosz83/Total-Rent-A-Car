package com.paweljarosz.trac.data.daos.rental;

import org.springframework.stereotype.Component;

@Component
public class RentalDTO {

	private Long rentalId;
	private String from;
	private String to;
	private String returnPoint;
	private String agent;
	private Integer mileage;
	private boolean euTravel;
	private long driver;
	private String nameAndSurname;
	private String carRegistrations;
	public Long getRentalId() {
		return rentalId;
	}
	public void setRentalId(Long rentalId) {
		this.rentalId = rentalId;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getReturnPoint() {
		return returnPoint;
	}
	public void setReturnPoint(String returnPoint) {
		this.returnPoint = returnPoint;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public Integer getMileage() {
		return mileage;
	}
	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}
	public boolean isEuTravel() {
		return euTravel;
	}
	public void setEuTravel(boolean euTravel) {
		this.euTravel = euTravel;
	}
	public long getDriver() {
		return driver;
	}
	public void setDriver(long driver) {
		this.driver = driver;
	}
	public String getNameAndSurname() {
		return nameAndSurname;
	}
	public void setNameAndSurname(String nameAndSurname) {
		this.nameAndSurname = nameAndSurname;
	}
	public String getCarRegistrations() {
		return carRegistrations;
	}
	public void setCarRegistrations(String carRegistrations) {
		this.carRegistrations = carRegistrations;
	}

}
