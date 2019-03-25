package com.springdatajpa.repositories;

import com.springdatajpa.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person,Integer> {

    List<Person>  findByFirstname(String firstname);
    List<Person> findByLastname(String lastname);
    Person findById(Integer id);


    @Query("SELECT firstname from Person where age=:age")
    List<String> findByAge(@Param("age") Integer age);

    @Query("SELECT firstname,lastname from Person where age=:age")
    List<Object[]> findByAge25(@Param("age") Integer age);

    @Query("SELECT p from Person p where age=:age")
    List<Person> findByAgePerson(@Param("age") Integer age);

    @Query("SELECT Count(*) from Person p where p.firstname=:name")
    Integer countByFirstName(@Param("name") String name);

    List<Person> findDistinctByFirstname(String firstName);
    List<Person> findByFirstnameOrAge(String firstName, Integer age);
    List<Person> findByFirstnameAndAge(String firstName, Integer age);
    List<Person> findByAgeBetween(Integer min, Integer max);
    List<Person> findByAgeLessThan(Integer age);
    List<Person> findByAgeGreaterThan(Integer age);
    List<Person> findByFirstnameLike(String name);
    List<Person> findByFirstnameNot(String name);
    List<Person> findByFirstnameIn(List<String> list);
    List<Person> findByFirstnameIgnoreCase(String firstName);

    List<Person> findByAgeGreaterThanOrderByIdDesc(Integer age);

    List<Person> findByAgeGreaterThan(Integer age, Sort sort);

    Page<Person> findAll(Pageable pageable);
}