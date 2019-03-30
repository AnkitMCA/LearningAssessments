package com.restwithspring.demo.controllers;

import com.restwithspring.demo.entities.*;
import com.restwithspring.demo.exception.UserNotFoundException;
import com.restwithspring.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Locale;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    MessageSource messageSource;

    @GetMapping("/students")
    List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    Student getOneStudent(@PathVariable Long id) {
        Student student = studentService.getOneStudent(id);
        if (student == null) {
            throw new UserNotFoundException("Student Not Found !!.");
        }
        return studentService.getOneStudent(id);
    }

    @PostMapping("/students")
    ResponseEntity<Student> saveStudent(@Valid @RequestBody Student student) {
        studentService.saveStudent(student);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}").buildAndExpand(student.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("/students/{id}")
    void deleteStudent(@PathVariable Long id) {
        Student student = studentService.getOneStudent(id);
        if (student == null) {
            throw new UserNotFoundException("Student Not Found ...");
        }
        studentService.deleteOneStudent(id);
    }

    @PutMapping("/students")
    void updateStudent(@RequestBody Student student) {
        Student student1 = studentService.getOneStudent(student.getId());
        if (student1 == null) {
            throw new UserNotFoundException("Student Not Found ...");
        }
        studentService.updateStudentData(student);
    }

    @PutMapping("/students/{id}")
    void updateStudent(@PathVariable Long id, @RequestBody Student student) {
        Student student1 = studentService.getOneStudent(student.getId());
        if (student1 == null || id == null) {
            throw new UserNotFoundException("Student Not Found ...");
        }
        studentService.updateStudentData(student);
    }

    // Question 4 Internationalization
    @GetMapping("/")
    String helloWorld(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        System.out.println("hello world");
        System.out.println(locale.getLanguage());
        return messageSource.getMessage("hello.world.message", null, locale);
    }

    // Question 7
    // URI Versioning
    @GetMapping("/name/v1")
    StudentV1 getStudentV1Name() {
        return new StudentV1("Ankit Thakur");
    }

    @GetMapping("/name/v2")
    StudentV2 getStudentV2Name() {
        return new StudentV2(new Name("Ankit", "Thakur"));
    }

    // Parameter Versioning
    @GetMapping(value = "/name/param", params = "version1")
    StudentV1 getSV1NameParam() {
        return new StudentV1("Ankit Thakur");
    }

    @GetMapping(value = "/name/param", params = "version2")
    StudentV2 getSV2NameParam() {
        return new StudentV2(new Name("Ankit", "Thakur"));
    }

    // Header Versioning
    @GetMapping(value = "/name/header", headers = "API-VERSION=1")
    StudentV1 getSV1NameHeader() {
        return new StudentV1("Ankit Thakur");
    }

    @GetMapping(value = "/name/header", headers = "API-VERSION=2")
    StudentV2 getSV2NameHeader() {
        return new StudentV2(new Name("Ankit", "Thakur"));
    }

    // Question 8

    // get Only 1 record
    @GetMapping("/postObject")
    public Post getPostObject() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        ResponseEntity<Post> response = restTemplate.getForEntity(url, Post.class);
        System.out.println(response.getStatusCode().toString());
        System.out.println(response.getHeaders().toString());
        return response.getBody();
    }

    String url = "https://jsonplaceholder.typicode.com/posts";

    // Get Data in a list.
    @GetMapping("/postdata")
    public List<Post> getPostList() {
        RestTemplate restTemplate = new RestTemplate();
//        String url="https://jsonplaceholder.typicode.com/posts";
        ResponseEntity<List<Post>> response = restTemplate
                .exchange(url, HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<Post>>() {
                        });
        return response.getBody();
    }

    // Create a single record
    @PostMapping("/postdata")
    public ResponseEntity<Post> createPost() {
//        String url="https://jsonplaceholder.typicode.com/posts";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-type", "application/json; charset=UTF-8");
        HttpEntity<Post> request = new HttpEntity<>(new Post(12L, 111L, "mytitle", "body"), httpHeaders);
        Post post = restTemplate.postForObject(url, request, Post.class);
        System.out.println(post);
        return new ResponseEntity<Post>(post, HttpStatus.CREATED);
    }

    // Update a record..
    @PutMapping("/postdata")
    public ResponseEntity<Post> updatePost() {
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-type", "application/json; charset=UTF-8");
        HttpEntity<Post> request = new HttpEntity<>(new Post(1L, 100L, "title1", "description1"), httpHeaders);
        return restTemplate.exchange(url, HttpMethod.PUT, request, Post.class);
    }

    // Delete a record..
    @DeleteMapping("/postdata")
    public void deletePost() {
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-type", "application/json; charset=UTF-8");
        HttpEntity<Post> request = new HttpEntity<>(httpHeaders);
        restTemplate.exchange(url, HttpMethod.DELETE, request, Post.class);
    }

}
