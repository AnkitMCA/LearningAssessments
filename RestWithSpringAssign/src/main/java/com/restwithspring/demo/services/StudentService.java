package com.restwithspring.demo.services;

import com.restwithspring.demo.entities.Student;
import com.restwithspring.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    public Student getOneStudent(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteOneStudent(Long id) {
        studentRepository.findById(id).orElse(null);
        studentRepository.deleteById(id);
    }

    public void updateStudentData(Student student) {
        Student student1 = studentRepository.findById(student.getId()).orElse(null);
        student1.setName(student.getName());
        student1.setId(student.getId());
        student1.setStandard(student.getStandard());
        student1.setPercentage(student.getPercentage());
        student1.setCity(student.getCity());
        studentRepository.save(student1);
    }


}
