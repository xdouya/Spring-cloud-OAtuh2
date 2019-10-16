package com.dy.order.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * 
 * @author dy
 *
 */
@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter{

	/**
	 * 配置拦截什么URL、设置什么权限等安全控制。
	 */
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf()	//添加 CSRF 支持(跨站域请求伪造)，使用WebSecurityConfigurerAdapter时，默认启用
		.disable()
		.authorizeRequests()
		.antMatchers("/product/**","/registry/**", "/user/login/**")
		.permitAll()
		.antMatchers("/**").authenticated();
	}
}
