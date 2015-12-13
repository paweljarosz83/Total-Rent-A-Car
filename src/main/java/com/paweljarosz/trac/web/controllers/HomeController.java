package com.paweljarosz.trac.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.paweljarosz.trac.data.entities.car.Car;
import com.paweljarosz.trac.web.services.CarService;

@Controller
public class HomeController {

	@Autowired
	private CarService carService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home1(Model model) {
		//List<Car>cars = carService.getCars();
		//model.addAttribute("cars",cars);
		return "forward:/cars/find/available";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home2(Model model) {
		
		//List<Car>cars = carService.getCars();
		//model.addAttribute("cars",cars);
		return "forward:/cars/find/available";
	}
}
