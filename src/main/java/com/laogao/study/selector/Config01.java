package com.laogao.study.selector;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "config01")
public class Config01 {

	private String name = "abc";
	
	private int age = 20;
	
	@Value("${config01.user.age}")
	private int userAge;

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Bean
	public User01 getUser01() {
		System.out.println(name + ":" + age + "，" + userAge);
		return new User01();
	}
}
