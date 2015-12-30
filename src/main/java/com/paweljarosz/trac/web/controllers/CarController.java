package com.paweljarosz.trac.web.controllers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.paweljarosz.trac.data.entities.car.Car;
import com.paweljarosz.trac.data.entities.driver.Driver;
import com.paweljarosz.trac.data.repositories.CarRepository;
import com.paweljarosz.trac.web.services.CarService;
import com.paweljarosz.trac.web.services.validators.CarValidator;



@SessionAttributes()
@Controller
@RequestMapping("/cars")
public class CarController {

	private Car car;
	
	@Autowired
	private CarService carService;
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addCar(@ModelAttribute("car") Car car,Model model, BindingResult result){
		initFormComponents(model);
		return "car\\addCar";
	}

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveCar(@Valid @ModelAttribute Car car,Errors errors, Model model){
		initFormComponents(model);
		if(!errors.hasErrors()){
			return "redirect:/cars/cars";
		}else{
			return "car\\addCar";
		}
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.addValidators(new CarValidator(carService));
	}
	
	private void initFormComponents(Model model) {
		List<String> transmissionOptions = new LinkedList<>(Arrays.asList(new String[]{"MANUAL","AUTOMATIC","SEMI_AUTOMATIC"}));
		List<String> fuelOptions = new LinkedList<>(Arrays.asList(new String[]{"Gas","Diesel","LPG","Electric","Hybrid"}));
		List<String> driveOptions = new LinkedList<>(Arrays.asList(new String[]{"FRONT","REAR","AWD","IWD"}));
		List<String> radios = new LinkedList<>(Arrays.asList(new String[]{"Sedan","Combi","Hatchback","Coupe","Cabrio"}));
		List<String> equipments = new LinkedList<>(Arrays.asList(new String[]{"A/C","ABS","ESP","ASR","GPS","SRS","ITS"}));
		
		model.addAttribute("transmissionOptions",transmissionOptions);
		model.addAttribute("fuelOptions",fuelOptions);
		model.addAttribute("driveOptions", driveOptions);
		model.addAttribute("radios",radios);
		model.addAttribute("equipments",equipments);
	}
	
	@RequestMapping(value="/review")
	public String review(@ModelAttribute Car car){
		return "car\\car";
	}

	@RequestMapping(value="/cars")
	public String  find(Model model){
		model.addAttribute("cars",this.carService.getCars());
		return "car\\cars";
	}
	
	@RequestMapping(value="/car/{id}")
	public String findCar(Model model, @PathVariable Long id){
		car = carService.findCarById(id);
		model.addAttribute("car",car);
		return "car\\car";
	}
	
	@RequestMapping(value="/edit/{Id}")
	public String editCar(Model model,@PathVariable Long Id){
		initFormComponents(model);
		model.addAttribute("car",car);
		return "car\\addCar";
	}
	
	@RequestMapping(value="/find/available")
	public String getAvailableCars(Model model){
		List<Car>cars = carService.getCars();
		model.addAttribute("cars",cars);
		return "home";
	}
}
