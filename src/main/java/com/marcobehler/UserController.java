package com.marcobehler;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    private List<User> users = new ArrayList<>();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld(@RequestParam(defaultValue = "Anonymous")  String name) {
        return "Hi " + name + ", it works!";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public User registration(@RequestBody  User user) {
        user.registrationDate = new Date();
        users.add(user);
        return user;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> list() {
        return users;
    }

}
