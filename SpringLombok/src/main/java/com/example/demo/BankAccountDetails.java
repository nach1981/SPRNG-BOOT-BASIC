package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="data")
public class BankAccountDetails {
	public int accountNumber;
	public String customerName;
	public long cardNumber;

}
