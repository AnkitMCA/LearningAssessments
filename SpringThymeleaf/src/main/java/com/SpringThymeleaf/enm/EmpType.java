package com.SpringThymeleaf.enm;

import java.util.Arrays;
import java.util.List;

public enum EmpType {

    USER("This is User"),
    ADMIN("This is Admin"),
    SUPER_ADMIN("This is Super_Admin");

    String value;

    EmpType(String usertype) {
        value = usertype;
    }

    public String getValue() {
        return value;
    }

    public static List<EmpType> getValues() {
        return Arrays.asList(USER, ADMIN, SUPER_ADMIN);
    }

}
