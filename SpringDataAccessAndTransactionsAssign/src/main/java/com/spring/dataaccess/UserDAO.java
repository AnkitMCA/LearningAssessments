package com.spring.dataaccess;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDAO {


    @Autowired
    DataSource dataSource;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    SessionFactory sessionFactory;
    @Autowired
    UserDAO2 userDao2;

    void insertData() throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into user values('a','a','a',10,'2019-03-14')");
        preparedStatement.execute();
        PreparedStatement preparedStatement1 = connection.prepareStatement("insert into user values('b','b','b',20,'2019-03-13')");
        preparedStatement1.execute();
    }

    void printUserNames() throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("username"));
        }
    }

    void countUser() {
        String sql = "SELECT COUNT(*) FROM user";
        System.out.println("Number of Users : "+jdbcTemplate.queryForObject(sql, Integer.class));
    }

    String getUsername() {
        String sql = "SELECT NAME FROM user WHERE username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{"abc"}, String.class);
    }

    void insertUser(User user) {
        String sql = "INSERT INTO user (username,password,name,age,dob)VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql, new Object[]{
                user.getUsername(), user.getPassword(), user.getName(), user.getAge(), user.getDob()
        });
    }

    void queryForMapUsers() {
        String sql = "SELECT * FROM user WHERE username = ?";
        System.out.println(jdbcTemplate.queryForMap(sql, new Object[]{"abc"}));
    }

    void queryForListUsers() {
        String sql = "SELECT * FROM user";
        System.out.println(jdbcTemplate.queryForList(sql));
    }

    User getUsers() {
        String sql = "SELECT * FROM user WHERE username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{"abc"}, new UserMapper());
    }


    void setSessionFactoryEx(){
        String sql = "select COUNT(*) from Person";
        Query query = sessionFactory.openSession().createQuery(sql);
        System.out.println("\nHibernate session factory result:" + query.uniqueResult());
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void insertPerson() {
        try{
            Thread.sleep(2000L);
        }
        catch(InterruptedException e){}
        String sql = "INSERT INTO Person VALUES(?,?)";
        jdbcTemplate.update(sql, new Object[]{3, "xyz"});
        try{
            userDao2.insert();
        }catch (RuntimeException e){
            System.out.println("Runtime exception");
        }catch (Exception e){
            System.out.println("Transaction exception");
        }
    }

}
