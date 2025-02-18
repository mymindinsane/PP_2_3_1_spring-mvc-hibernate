package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.UserServiceImpl;
import web.Service.UserService;

@Controller
public class UserController {
    UserService userService = new UserServiceImpl();
    @GetMapping("/index")
    public String listUsers() {
        return "index.html";
    }
}
