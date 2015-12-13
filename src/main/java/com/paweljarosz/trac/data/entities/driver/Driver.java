
package com.paweljarosz.trac.data.entities.driver;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.paweljarosz.trac.data.entities.rental.Rental;

@Entity
@Table(name="DRIVER")
public class Driver {
	
	@Id
	@Column(name="DRIVER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long driverId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="SURNAME")
	private String surname;

	@OneToOne
	@JoinColumn(name="LICENCE_ID")
	private Licence licence;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ADDRESS_ID")
	private Address address;
	
//	@OneToMany(mappedBy="driver")
//	private List<Rental> rentals = new ArrayList<Rental>(); 
//	public List<Rental> getRentals() {
//		return rentals;
//	}
//	public void setRentals(List<Rental> rentals) {
//		this.rentals = rentals;
//	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Long getDriverId() {
		return driverId;
	}

	public Licence getLicence() {
		return licence;
	}
	public void setLicence(Licence licence) {
		this.licence = licence;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
