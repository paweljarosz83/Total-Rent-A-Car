package com.paweljarosz.trac.data.entities.driver;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="LICENCE")
public class Licence {

	@Id
	@Column(name="LICENCE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long licenceId;
	
	@Column(name="LICENCE_NUMBER")
	private String number;
	
	@Column(name="CATEGORY")
	private String category;
	
	//@OneToOne(mappedBy="licence")
	//private Driver driver;

	
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
//	public Driver getDriver() {
//		return driver;
//	}
//	public void setDriver(Driver driver) {
//		this.driver = driver;
//	}
	public Long getLicenceId() {
		return licenceId;
	}
}
