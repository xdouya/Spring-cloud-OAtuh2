package com.dy.oauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EnableEurekaClient
@MapperScan({"com.dy.oauth.dao"})
public class OAuthServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(OAuthServiceApplication.class, args);
	}
}
