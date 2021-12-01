package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLombokApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringLombokApplication.class, args);
		
		ApplicationContext ac = SpringApplication.run(SpringLombokApplication.class, args);
		System.out.println("SpringLombokApplication.main()");
		BankAccountDetails ob = (BankAccountDetails)ac.getBean("bankAccountDetails");
		System.out.println("SpringLombokApplication.main()"+ ob.accountNumber);
		
	}

}
