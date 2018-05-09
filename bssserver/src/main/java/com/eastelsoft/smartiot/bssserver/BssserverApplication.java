package com.eastelsoft.smartiot.bssserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//启注解事务管理
@EnableTransactionManagement
@MapperScan("com.eastelsoft.smartiot.bssserver.dao")
public class BssserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BssserverApplication.class, args);
	}
}
