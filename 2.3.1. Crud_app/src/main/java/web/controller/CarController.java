package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.UserService;


@Controller
public class CarController {
    private UserService userService;

    @Autowired
    public CarController(UserService carService) {
        this.userService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCar(ModelMap model, @RequestParam(required = false, defaultValue = "5") int count) {
        model.addAttribute("cars", (count >= 5) ? userService.createCarList() : userService.getCarList(count));
        return "cars";
    }
}
