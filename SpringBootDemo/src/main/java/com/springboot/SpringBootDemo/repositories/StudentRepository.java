package com.springboot.SpringBootDemo.repositories;

import com.springboot.SpringBootDemo.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
