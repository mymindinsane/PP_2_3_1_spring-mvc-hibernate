package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import web.Model.User;
import web.Service.UserService;

import java.util.List;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/index")
    public ModelAndView listUsers() {
        List<User> users = userService.getAllUsers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("users", users);
        return modelAndView;
    }

    @GetMapping("/adduser")
    public String addUser(@ModelAttribute("user") User user) {
/*
        return "redirect:/index";
*/
        return "adduser";
    }

    @PostMapping("/adduser")
    public String addUserPOST(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/index";
    }
}
