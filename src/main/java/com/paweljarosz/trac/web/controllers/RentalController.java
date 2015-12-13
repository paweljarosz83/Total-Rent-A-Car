package com.paweljarosz.trac.web.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.paweljarosz.trac.data.entities.car.Car;
import com.paweljarosz.trac.data.entities.driver.Driver;
import com.paweljarosz.trac.data.entities.rental.Rental;
import com.paweljarosz.trac.web.services.CarService;
import com.paweljarosz.trac.web.services.DriverService;
import com.paweljarosz.trac.web.services.RentalService;

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
		
	
		List<Driver>drivers = driverService.getDrivers();
		List<String>driverNames = new ArrayList<String>();
		for(Driver d:drivers){
			driverNames.add(d.getName()+" "+d.getSurname());
		}
		
		model.addAttribute("driverNames",driverNames);
		
		List<Car>cars = carService.getCars();
		List<String>carRegistrations = new ArrayList<String>();
		for(Car c:cars){
			carRegistrations.add(c.getRegistration());
		}
		
		model.addAttribute("carRegistrations",carRegistrations);
		
		return "rental\\addRental";
	}
	
//	@RequestMapping(value="/save",method=RequestMethod.POST)
//	public ModelAndView Datepicker(HttpServletRequest req, HttpServletResponse res, @ModelAttribute("Rental")Rental rental, 
//			BindingResult bindingResult) throws Exception{
//		ModelAndView model = new ModelAndView();
//		    if(bindingResult.hasErrors()){
//		    }else{
//		        System.out.println("Date of Birth :"+rental.getPickupDate());
//		    }
//		    model.setViewName("addRental");
//		    return model;
//	}
	
	
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveRental(@ModelAttribute Rental rental,Model model){
		
		String nameAndSurname = rental.getNameAndSurname();
		String[]s = nameAndSurname.split(" ");

		Driver d = driverService.findDriverByNameAndSurname(s[0],s[1]);
		rental.setDriver(d);
		rental.setPickupDate(new Date());
	
		
		rentalService.saveRental(rental);
		return "redirect:/rentals/add";
	}
	
}
