package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.springboot.mapper")//配置mybatis包扫描,扫描dao
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
