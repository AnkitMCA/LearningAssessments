package com.springboot.SpringBootDemo.controller;

import com.springboot.SpringBootDemo.entity.User;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    User user;

    @RequestMapping("/user")
    @ResponseBody
    public String getUserData(){

        // Question 6 Logging
        LoggerFactory.logger(StudentController.class).info("You are accessing the User Section.");

        return user.toString();
    }
}
