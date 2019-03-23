package com.springboot.SpringBootDemo;

import com.springboot.SpringBootDemo.entity.Database;
import com.springboot.SpringBootDemo.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.springboot.SpringBootDemo.entity")
@EnableJpaRepositories(basePackages = {"com.springboot.SpringBootDemo.repositories"})
public class SpringBootDemoApplication {

	@Bean
	public User user() {
		return new User("ankit@tothenew.com","akak");
	}

	@Bean
	public Database database(){
		return new Database();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
