package com.springboot.SpringBootDemo.service;

import com.springboot.SpringBootDemo.entity.Student;
import com.springboot.SpringBootDemo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents(){
        return Arrays.asList(new Student(1,"ankit","ankit@tothenew.com"),
                new Student(2,"sumit", "sumit@tothenew.com"));
    }


    public List<Student> getData(){
        List<Student> studentList = new ArrayList<>();
        Iterator<Student> studentIterator = studentRepository.findAll().iterator();
        studentIterator.forEachRemaining(studentList::add);
        return studentList;
    }





}
