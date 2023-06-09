package com.as.accountmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(basePackages="com.as.accountmanager")
public class AccountManagerApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(AccountManagerApplication.class, args);
	}
}
