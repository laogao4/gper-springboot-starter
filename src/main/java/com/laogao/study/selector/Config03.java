package com.laogao.study.selector;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@ConditionalOnClass(name="com.laogao.study.selector.User04")
@Configuration
public class Config03 {

	@Bean
	public User03 getUser03() {
		return new User03();
	}
}
