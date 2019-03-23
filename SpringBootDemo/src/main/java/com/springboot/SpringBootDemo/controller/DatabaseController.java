package com.springboot.SpringBootDemo.controller;

import com.springboot.SpringBootDemo.entity.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {

    @Autowired
    Database database;

    @RequestMapping("/database")
    @ResponseBody
    public String getDatabaseInfo(){
        return database.toString();
    }
}
