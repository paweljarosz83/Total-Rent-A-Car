package com.paweljarosz.trac.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.paweljarosz.trac.data.entities.driver.Driver;
import com.paweljarosz.trac.web.services.DriverService;

@Controller
@RequestMapping("/drivers")
public class DriverController {
	
	@Autowired
	DriverService driverService;

	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addDriver(@ModelAttribute("driver")Driver driver,Model model,BindingResult result){
		return "driver\\addDriver";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveDriver(@ModelAttribute Driver driver,Model model){
		driverService.saveDriver(driver);
		//return "redirect:/drivers/drivers";
		return "driver\\addDriver";
	}
	//find all drivers
	@RequestMapping(value="/drivers")
	public String find(Model model){
		model.addAttribute("drivers", this.driverService.getDrivers());
		return "driver\\drivers";
	}
	//find single driver
	@RequestMapping(value="/driver/{Id}")
	public String findOne(Model model, @PathVariable Long Id){
		model.addAttribute("driver",this.driverService.findOne(Id));
		return "driver";
	}
}