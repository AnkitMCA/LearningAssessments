package com.hibernate.demo.entity;

import javax.persistence.*;
import java.util.*;

@Entity
public class Author {

    @Id
//@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//@Id @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    @Column(name = "First_Name")
    private String firstName;

//    @Transient
    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "Age")
    private int age;

//    @Temporal(value = TemporalType.DATE)
    @Column(name = "DOB")
    private Date dob;

    @Embedded
    Address address;

    @ElementCollection
    List<String> subjects = new ArrayList<>();

  //  @OneToMany @JoinTable(joinColumns = @JoinColumn(name = "Author_ID"), inverseJoinColumns = @JoinColumn(name="BookID"))
 //   @OneToMany(mappedBy = "author")
  //  @OneToMany(cascade = CascadeType.PERSIST)
//    @ManyToMany
  //  Set<Book> bookSet = new HashSet<>();

 //   @OneToOne @JoinColumn(name = "book_join")
  //  Book book;

//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }
//
//    public Set<Book> getBookSet() {
//        return bookSet;
//    }
//
//    public void setBookSet(Set<Book> bookSet) {
//        this.bookSet = bookSet;
//    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }

}
