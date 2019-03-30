package com.restwithspring.demo.repositories;

import com.restwithspring.demo.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {

}
