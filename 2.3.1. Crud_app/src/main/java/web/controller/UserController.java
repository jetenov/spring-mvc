package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;


@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService carService) {
        this.userService = carService;
    }

    @GetMapping()
    public String printUsers(ModelMap model) {
        model.addAttribute("users", userService.UserList());
        return "index";
    }

    @GetMapping("/admin")
    public String adminUsers(ModelMap model) {
        model.addAttribute("users", userService.UserList());
        return "admin";
    }


    @GetMapping("/admin/add")
    public String addUser(@ModelAttribute("user") User user) {
        return "add";
    }

    @PostMapping("/admin")
    public String newUser(@ModelAttribute("user") User user) {
        userService.add(user);
        return "redirect:/admin";
    }

    @GetMapping("/user")
    public String showUser(Model model, @RequestParam(required = false, defaultValue = "jetenov") String s) {
        model.addAttribute("user", userService.loadUserByUsername(s));
        return "user";
    }

    @GetMapping("/admin/edit")
    public String editUser(Model model, @RequestParam(required = false, defaultValue = "1") Long id) {
        model.addAttribute("user", userService.getById(id));
        return "edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user) {
        userService.update(user);
        return "redirect:/admin";
    }

    @DeleteMapping("/{id}")
    public String delete(@ModelAttribute("user") User user) {
        userService.delete(user);
        return "redirect:/admin";
    }


}
