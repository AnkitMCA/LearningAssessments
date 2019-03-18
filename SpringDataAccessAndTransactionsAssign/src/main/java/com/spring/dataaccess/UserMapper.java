package com.spring.dataaccess;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    User user = new User();

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {

        user.setName(rs.getString("name"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setAge(rs.getInt("age"));
        user.setDob(rs.getDate("dob"));
        return user;
    }

}
