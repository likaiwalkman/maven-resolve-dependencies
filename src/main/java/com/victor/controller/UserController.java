package com.victor.controller;

import com.victor.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@EnableAutoConfiguration
@RestController

@RequestMapping("/user")
public class UserController {

    @RequestMapping(path = "/{id}", method = RequestMethod.GET )
    public User view(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        user.setName("zhang");
        return user;
    }

    //public static void main(String[] args) {
    //    SpringApplication.run(UserController.class);
    //}

}

