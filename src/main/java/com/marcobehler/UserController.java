package com.marcobehler;


import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class UserController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld(@RequestParam(defaultValue = "Anonymous")  String name) {
        return "Hi " + name + ", it works!";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public User registration(@RequestBody  User user) {
        user.registrationDate = new Date();
        return user;
    }

}
