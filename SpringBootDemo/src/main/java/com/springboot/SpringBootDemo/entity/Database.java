package com.springboot.SpringBootDemo.entity;

import org.springframework.beans.factory.annotation.Value;

public class Database {

    @Value("${database.name}")
    private String name;
    @Value("${database.port}")
    private int port;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Database{" +
                "name='" + name + '\'' +
                ", port=" + port +
                '}';
    }
}
