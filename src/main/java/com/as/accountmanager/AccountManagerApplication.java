package com.as.accountmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.as.accountmanager")
public class AccountManagerApplication {
	public static void main(String[] args) {
		SpringApplication.run(AccountManagerApplication.class, args);
	}
}
