package com.paweljarosz.trac.data.entities.car;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CAR")
public class Car {

	private enum Drive{
		FRONT,REAR,AWD,IWD
	}
	private enum Transmission{
		AUTOMATIC,MANUAL,SEMI_AUTOMATIIC
	}

	@Id
	@Column(name="CAR_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long carId;

	@Column(name="MODEL")
	private String model;

	@Column(name="MAKE")
	private String make;

	@Column(name="REGISTRATION_NUMBER")
	private String registration;

	@Column(name="TRUNK_SIZE")
	private Integer trunk;

	@Column(name="BODY")
	private String body;

	@Column(name="FUEL")
	private String fuel;

	@Column(name="DESCRIPTION")
	private String description;

	@Column(name="KILOMETER")
	private Integer kilometers;

	@Column(name="COLOR")
	private String color;

	@Column(name="PRICE")
	private Integer price;

	@ElementCollection
	@CollectionTable(name="CAR_EQUIPMENTS",joinColumns=@JoinColumn(name="CAR_ID"))
	@Column(name="EQUIPMENT")
	private List<String> equipments = new ArrayList<String>();

	@Enumerated(EnumType.STRING)
	@Column(name="DRIVE")
	private Drive drive;

	@Enumerated(EnumType.STRING)
	@Column(name="TRANSMISSION")
	private Transmission transmission;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ENGINE_ID")
	private Engine engine;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public Integer getTrunk() {
		return trunk;
	}

	public void setTrunk(Integer trunk) {
		this.trunk = trunk;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getKilometers() {
		return kilometers;
	}

	public void setKilometers(Integer kilometers) {
		this.kilometers = kilometers;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public List<String> getEquipments() {
		return equipments;
	}

	public void setEquipments(List<String> equipments) {
		this.equipments = equipments;
	}

	public Drive getDrive() {
		return drive;
	}

	public void setDrive(Drive drive) {
		this.drive = drive;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Long getCarId() {
		return carId;
	}

	//	@OneToMany(mappedBy="car")
	//	private List<Rental> rentals;
	//	public List<Rental> getRentals() {
	//		return rentals;
	//	}
	//	public void setRentals(List<Rental> rentals) {
	//		this.rentals = rentals;
	//	}


}
