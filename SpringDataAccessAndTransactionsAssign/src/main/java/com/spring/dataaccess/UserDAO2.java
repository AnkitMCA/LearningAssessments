package com.spring.dataaccess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
class UserDAO2 {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserDAO3 userDAO3;

    @Transactional(propagation = Propagation.MANDATORY, timeout = 1, rollbackFor = RuntimeException.class)
    public void insert(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        String sql = "INSERT INTO Person VALUES (?,?)";
        jdbcTemplate.update(sql, new Object[]{11, "sanju"});
        userDAO3.insert();
    }
}
