package com.restwithspring.demo.events;

import com.restwithspring.demo.entities.Student;
import com.restwithspring.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
public class StudentBootstrap {

    @Autowired

    StudentRepository studentRepository;

    @EventListener(ContextRefreshedEvent.class)
    void setUp() {

        if(studentRepository.count()==0) {
            IntStream.range(0, 5).forEach(e -> {
                Student student = new Student();
                student.setName("Abc" + e);
                student.setAge(18 + e);
                student.setCity("Delhi");
                student.setStandard("MCA");
                student.setPercentage(70.0 + e);
                studentRepository.save(student);
            });
        }

       /* if (!studentRepository.findAll().iterator().hasNext()) {
            IntStream.range(0, 5).forEach(e -> {
                Student student = new Student();
                student.setName("Abc" + e);
                student.setAge(18 + e);
                student.setCity("Delhi");
                student.setStandard("MCA");
                student.setPercentage(70.0 + e);
                studentRepository.save(student);
            });
        }*/
    }
}
