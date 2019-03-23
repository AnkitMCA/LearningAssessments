package com.hibernate.demo;

import com.hibernate.demo.entity.Address;
import com.hibernate.demo.entity.Author;
import com.hibernate.demo.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.Date;

public class MainApplication {

    public static void main(String args[]) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        Author authorData = new Author();
        authorData.setId(1);
        authorData.setFirstName("Abc");
        authorData.setLastName("Thakur");
        authorData.setAge(21);
        authorData.setDob(new Date());

        Author authorData1 = new Author();
        authorData1.setId(2);
        authorData1.setFirstName("Sumit");
        authorData1.setLastName("Singh");
        authorData1.setAge(18);
        authorData1.setDob(new Date());

        Author authorData2 = new Author();
        authorData2.setId(3);
        authorData2.setFirstName("Sanju");
        authorData2.setLastName("Rana");
        authorData2.setAge(20);
        authorData2.setDob(new Date());

        Author authorData3 = new Author();
        authorData3.setId(4);
        authorData3.setFirstName("Mahi");
        authorData3.setLastName("Singh");
        authorData3.setAge(23);
        authorData3.setDob(new Date());

        Author authorData4 = new Author();
        authorData4.setId(5);
        authorData4.setFirstName("Aman");
        authorData4.setLastName("Thakur");
        authorData4.setAge(20);
        authorData4.setDob(new Date());

//        //create operation
//        session.beginTransaction();
//        session.save(authorData);
//        session.getTransaction().commit();

//        //read operation
//        session.beginTransaction();
//        Author author1 = session.get(Author.class,3);
//        session.getTransaction().commit();
//        System.out.println(author1);

        //update operation
//        session.beginTransaction();
//        Author author2 = session.get(Author.class,2);
//        author2.setAge(22);
//        session.update(author2);
//        session.getTransaction().commit();
//        System.out.println(author2);

        //delete operation
//        session.beginTransaction();
//        Author author3 = session.get(Author.class,1);
//        session.delete(author3);
//        session.getTransaction().commit();
//        System.out.println(author3);

        // question 4 Insert Multiple data
//        session.beginTransaction();
//        session.save(authorData1);
//        session.save(authorData2);
//        session.save(authorData3);
//        session.save(authorData4);
//        session.getTransaction().commit();


//        // question 5 create-drop
//        sessionFactory.close();


        // question 11
        Address address = new Address();
        address.setLocation("Ghaziabad");
        address.setStreetNumber(12);
        address.setState("Uttar Pradesh");
        authorData.setAddress(address);

//        // question 12
//        authorData.setSubjects(Arrays.asList("Hindi","English","Science"));

        // question 15
//        Book book = new Book();
//        book.setBookName("English");
//        authorData.setBook(book);

        Book book1 = new Book("Hindi");
        Book book2 = new Book("Science");
        Book book3 = new Book("Maths");

//        authorData.getBookSet().add(book1);
//        authorData.getBookSet().add(book2);
//        authorData.getBookSet().add(book3);
//        book1.setAuthor(authorData);
//        book2.setAuthor(authorData);
//        book3.setAuthor(authorData);

        session.beginTransaction();
//    //    session.save(book);
//        session.save(book1);
//        session.save(book2);
//        session.save(book3);
        session.save(authorData);
        session.persist(authorData);
        session.getTransaction().commit();



        // Question 16 - 17
//        Author author123 = new Author();
//        author123.setFirstName("Wffffx");
//        author123.setLastName("Zzzz");
//        author123.setAge(20);
//        author123.setDob(new Date());
//
//        Address address2 = new Address();
//
//        address2.setLocation("GZB");
//        address2.setStreetNumber(123);
//        address2.setState("U.P.");
//        author123.setAddress(address2);
//
//        author123.setSubjects(Arrays.asList("Qweqe","Dbjkb","Khguy"));
//
//        Book book11 = new Book("Ghvggh");
//        Book book12 = new Book("Uhvghvh");
//        Book book13 = new Book("Tgcfgh");

//        author123.getBookSet().add(book11);
//        author123.getBookSet().add(book12);
//        author123.getBookSet().add(book13);

//        session.beginTransaction();
//        session.save(authorData);
//        session.save(author123);
//        session.save(book1);
//        session.save(book2);
//        session.save(book3);
//        session.save(book11);
//        session.save(book12);
//        session.save(book13);
//        session.getTransaction().commit();

        session.close();
    }
}
