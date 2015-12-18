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

	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private CarService carService;
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addCar(@ModelAttribute("car") Car car,Model model, BindingResult result){
		
		initFormComponents(model);
		return "addCar";
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
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveCar(@Valid @ModelAttribute Car car,Errors errors, Model model){
		initFormComponents(model);
		if(!errors.hasErrors()){
			return "redirect:/cars/cars";
		}else{
			return "addCar";
		}
	}
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.addValidators(new CarValidator(carService));
	}
	
	@RequestMapping(value="/review")
	public String review(@ModelAttribute Car car){
		return "car";
	}

	@RequestMapping(value="/cars")
	public String  find(Model model){
		//model.addAttribute("cars",this.carRepository.findAll());
		model.addAttribute("cars",this.carService.getCars());
		return "cars";
	}
	Car car;
	@RequestMapping(value="/car/{Id}")
	public String findCar(Model model, @PathVariable Long Id){
		car  = this.carRepository.findOne(Id);
		model.addAttribute("car",this.carRepository.findOne(Id));
		return "car";
	}
	
	@RequestMapping(value="/edit/{Id}")
	public String editCar(Model model,@PathVariable Long Id){
		initFormComponents(model);
		model.addAttribute("car",car);
		return "addCar";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping(value="/find/{make}")
//	public String findByMake(@PathVariable String make, Model model){
//		model.addAttribute("cars",carService.getCarsByMake(make));
//		return "cars";
//	}
	
	@RequestMapping(value="/find/available")
	public String getAvailableCars(Model model){
		List<Car>cars = carService.getCars();
		model.addAttribute("cars",cars);
		return "home";
	}
	
	

}
