package com.laogao.study.selector;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config02 {

	@Bean
	public User02 getUser02() {
		return new User02();
	}
}
