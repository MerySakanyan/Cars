package com.cars.controller;

import com.cars.manager.UserManager;
import com.cars.model.User;
import com.cars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class UserController {

    @Autowired
    private UserManager userManager;

    @Autowired
    private CarRepository carRepository;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcomePage(HttpServletRequest request) {
        return "index";
    }

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public String registerPage(HttpServletRequest request) {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute("email") String email, @ModelAttribute("password") String password) {
        userManager.registerUser(new User(email, password));
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("email") String email, @ModelAttribute("password") String password) {
        if (userManager.getUser(email) != null) {
            return new ModelAndView("home", "user", userManager.getUser(email));
        } else return new ModelAndView("index");

    }


}
