package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import web.model.Car;
import web.service.UserService;
import web.service.UserServiceImp;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private UserService userService;

    @Autowired
    public CarController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping(value = "/cars")
//    public String show(ModelMap modelMap){
//        modelMap.addAttribute("cars",userService.createCarList());
//        return "cars";
//    }

    @GetMapping(value = "/cars")
    public String printCar(ModelMap model, HttpServletRequest request) {
        model.addAttribute("cars", userService.createCarList());
        try {
            int count = Integer.parseInt(request.getParameter("count"));
            if (count < 5) {
                model.addAttribute("cars", userService.getCarList(count));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "cars";
    }
}
