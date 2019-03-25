package com.springdatajpa;

import com.springdatajpa.config.PersistenceContext;
import com.springdatajpa.entity.Person;
import com.springdatajpa.repositories.PersonRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;

public class MainApplication {

    public static void main(String args[]) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersistenceContext.class);
        Person person = new Person();
        person.setFirstname("Sumit");
        person.setLastname("Thakur");
        person.setAge(28);
        person.setSalary(13000);

        Person person1 = new Person();
        person1.setFirstname("Dharam");
        person1.setLastname("Saini");
        person1.setAge(25);
        person1.setSalary(15000);

        Person person2 = new Person();
        person2.setFirstname("Peter");
        person2.setLastname("Saint");
        person2.setAge(23);
        person2.setSalary(14000);

        PersonRepository personRepository = applicationContext.getBean(PersonRepository.class);
        personRepository.save(person);
        personRepository.save(person1);
        personRepository.save(person2);
        System.out.println("Saved successfully");

//        // Question 3
//        System.out.println("FindOne Method"+personRepository.findOne(1));
//        System.out.println("Exists Method : "+personRepository.exists(2));
//        System.out.println("FindAll Method : ");
//        List<Person> personList = (List<Person>) personRepository.findAll();
//        for (Person per:personList) {
//            System.out.println(per);
//        }
//        System.out.println("Count Method : "+personRepository.count());
//        System.out.println("Delete Method ");
//        personRepository.delete(1);
//        personRepository.deleteAll();


        // Question 4 & 5
        List<Person> personList1 = personRepository.findByFirstname("Sumit");
        personList1.forEach(System.out::println);
        List<Person> personList2 = personRepository.findByLastname("Saini");
        personList2.forEach(System.out::println);
        System.out.println("Find By Id : "+personRepository.findById(1));

        // Question 6
        List<String> firstname = personRepository.findByAge(25);
        System.out.println(firstname);

        // Question 7
        List<Object[]> namelist = personRepository.findByAge25(25);
        namelist.forEach(objects -> System.out.println(Arrays.toString(objects)));

        // Question 8
        List<Person> personList11 = personRepository.findByAgePerson(25);
        personList11.forEach(System.out::println);

        // Question 9
        Integer count = personRepository.countByFirstName("Peter");
        System.out.println("Count By Firstname : "+ count);

        // Question 10
        personRepository.findDistinctByFirstname("Dharam").forEach(System.out::println);
        personRepository.findByFirstnameOrAge("Sumit",25).forEach(System.out::println);
        personRepository.findByFirstnameAndAge("Dharam",25).forEach(System.out::println);
        personRepository.findByAgeBetween(22,26).forEach(System.out::println);
        personRepository.findByAgeLessThan(25).forEach(System.out::println);
        personRepository.findByAgeGreaterThan(21).forEach(System.out::println);
        personRepository.findByFirstnameLike("Peter").forEach(System.out::println);
        personRepository.findByFirstnameNot("Peter").forEach(System.out::println);

        List<String> list = Arrays.asList("Sumit","Peter","Other");
        personRepository.findByFirstnameIn(list).forEach(System.out::println);
        personRepository.findByFirstnameIgnoreCase("suMiT").forEach(System.out::println);

        // Question 11
        personRepository.findByAgeGreaterThanOrderByIdDesc(25).forEach(System.out::println);

        // Question 12
        personRepository.findByAgeGreaterThan(25, new Sort(Sort.Direction.DESC,"id")).forEach(System.out::println);

        // Question 13
        Page<Person> personPage = personRepository.findAll(new PageRequest(0,2,new Sort(Sort.Direction.DESC,"id")));
        List<Person> personList3 = personPage.getContent();
        personList3.forEach(System.out::println);

    }
}
