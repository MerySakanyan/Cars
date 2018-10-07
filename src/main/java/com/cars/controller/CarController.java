package com.cars.controller;


import com.cars.model.Car;
import com.cars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {

    @Autowired
    private CarRepository carRepository;
    @RequestMapping(value = "",method = RequestMethod.GET)
    public ModelAndView getCar(){




         return  new ModelAndView("home","car",carRepository.getCar());



    }
}
