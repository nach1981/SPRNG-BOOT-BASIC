package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPropertiesApplication {
	AccountDetails acount;

	public static void main(String[] args) {
		int i =5;
		
		ApplicationContext ac = SpringApplication.run(SpringPropertiesApplication.class, args);
		AccountDetails ob = (AccountDetails)ac.getBean("accountDetails");
		System.out.println("SpringPropertiesApplication.main()"+ i);
		System.out.println("Name is "+ ob.getAccountName());
		System.out.println(i+ ob.getAccountId());
		
	}

}
