package com.paweljarosz.trac.web.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.paweljarosz.trac.data.entities.car.Car;
import com.paweljarosz.trac.data.entities.driver.Driver;
import com.paweljarosz.trac.data.entities.rental.Rental;
import com.paweljarosz.trac.web.services.CarService;
import com.paweljarosz.trac.web.services.DriverService;
import com.paweljarosz.trac.web.services.RentalService;
import com.paweljarosz.trac.web.services.validators.RentalValidator;

@Controller
@RequestMapping("/rentals")
public class RentalController {

	@Autowired
	private RentalService rentalService;
	@Autowired
	private DriverService driverService;
	@Autowired
	private CarService carService;

	@RequestMapping(value="/add",method=RequestMethod.GET)
	private String addRental(@ModelAttribute("rental")Rental rental,Model model){

		initComponents(model);

		return "rental\\addRental";
	}


	private void initComponents(Model model) {
		List<Driver>drivers = driverService.getDrivers();
		List<String>driverNames = new ArrayList<String>();
		for(Driver d:drivers){
			driverNames.add(d.getName()+" "+d.getSurname()+" "+d.getPersonalIdentificationNumber());
		}
		model.addAttribute("driverNames",driverNames);

		List<Car>cars = carService.getCars();
		List<String>carRegistrations = new ArrayList<String>();
		for(Car c:cars){
			carRegistrations.add(c.getRegistration()+" "+c.getMake()+" "+c.getModel());
		}
		model.addAttribute("carRegistrations",carRegistrations);
	}


	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveRental(@Valid @ModelAttribute Rental rental,Errors errors,Model model){
		initComponents(model);
		if(!errors.hasErrors()){
			rentalService.saveRental(rental);
			return "redirect:/rentals/rentals";
		}else{
			//return "redirect:/rentals/add";
			return "rental\\addRental";
		}
	}
	
	//find all drivers
	@RequestMapping(value="/rentals")
	public String find(Model model){
		model.addAttribute("rentals", this.rentalService.getRentals());
		return "rental\\rentals";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.addValidators(new RentalValidator());
	}

}
