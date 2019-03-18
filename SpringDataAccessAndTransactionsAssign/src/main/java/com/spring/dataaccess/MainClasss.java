package com.spring.dataaccess;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.Date;


public class MainClasss {
    public static void main(String args[]) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        UserDAO userDAO = (UserDAO) context.getBean(UserDAO.class);
        User user = new User();
        user.setUsername("sksksk");
        user.setPassword("sksk");
        user.setName("sumit");
        user.setAge(18);
        user.setDob(new Date());


        try {
//            userDAO.insertData();

            userDAO.printUserNames();

            userDAO.countUser();

            System.out.println("Name of User : "+userDAO.getUsername());

//            userDAO.insertUser(user);

            userDAO.queryForMapUsers();

            userDAO.queryForListUsers();

            System.out.println(userDAO.getUsers());

//            userDAO.setSessionFactoryEx();

//            userDAO.insertPerson();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
