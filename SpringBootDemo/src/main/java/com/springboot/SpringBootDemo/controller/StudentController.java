package com.springboot.SpringBootDemo.controller;

import com.springboot.SpringBootDemo.entity.Student;
import com.springboot.SpringBootDemo.service.StudentService;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents(){

        // Question 6 Logging
        LoggerFactory.logger(StudentController.class).info("You are accessing the Student Section.");

        return studentService.getStudents();
    }

    // Question 7 Bootstrapping
    @GetMapping("/getData")
    public List<Student> getData(){
        return studentService.getData();
    }


}
