package com.as.accountmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.as.accountmanager")
public class AccountmanagerApplication {

	private Logger Logger = LoggerFactory.getLogger(getClass());
	public static void main(String[] args) {
		SpringApplication.run(AccountmanagerApplication.class, args);
	}


}
