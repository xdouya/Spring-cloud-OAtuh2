package com.dy.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan({"com.dy.order.dao"})
public class ServiceOrderApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceOrderApplication.class, args);
	}
}
