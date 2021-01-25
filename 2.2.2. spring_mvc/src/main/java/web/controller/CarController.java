package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.UserService;
import web.service.UserServiceImp;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private UserService userService;
    @GetMapping(value = "/cars")
    public String printCar(ModelMap model, HttpServletRequest request) {
        userService = new UserServiceImp();
        List<Car> carList = userService.createCarList();
        model.addAttribute("cars", carList);
        try {
            int count = Integer.parseInt(request.getParameter("count"));
            if (count < 5) {
                model.addAttribute("cars", carList.subList(0, count));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "cars";
    }
}
