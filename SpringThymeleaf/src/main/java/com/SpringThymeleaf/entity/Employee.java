package com.SpringThymeleaf.entity;

import com.SpringThymeleaf.enm.EmpType;
import javafx.beans.binding.BooleanBinding;

public class Employee {

    private String username;
    private String password;
    private boolean isAdmin;
    private EmpType emptype;

    public EmpType getEmptype() {
        return emptype;
    }

    public void setEmptype(EmpType emptype) {
        this.emptype = emptype;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
