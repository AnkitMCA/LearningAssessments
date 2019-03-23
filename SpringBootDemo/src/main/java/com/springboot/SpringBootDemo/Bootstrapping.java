package com.springboot.SpringBootDemo;

import com.springboot.SpringBootDemo.entity.Student;
import com.springboot.SpringBootDemo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class Bootstrapping {

    @Autowired
    StudentRepository studentRepository;

    @EventListener(ApplicationStartedEvent.class)
    public void init() {
        Iterator<Student> studentIterator = studentRepository.findAll().iterator();
        if (!studentIterator.hasNext()) {
            for (int i = 1; i <= 10; i++) {
                Student student = new Student(i, "name " + i, "email " + i);
                studentRepository.save(student);
                System.out.println("Student " + i + " data created");
            }
        }
        System.out.println("Your Application is up and running");
    }
}

