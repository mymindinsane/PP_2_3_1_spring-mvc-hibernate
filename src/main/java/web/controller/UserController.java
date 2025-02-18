package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import web.Model.User;
import web.Service.UserService;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/index")
    public String listUsers() {
        System.out.println("dwdwad");
        return "index";
    }

    @GetMapping("/adduser")
    public String addUser(@ModelAttribute User user, BindingResult result) {
        if (result.hasErrors()) {
            return "adduser";
        }

        userService.addUser(user);
        return "redirect:/index";
    }
}
