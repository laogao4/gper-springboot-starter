package com.laogao.study.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.laogao.study.selector.MySelector;
import com.laogao.study.selector.User01;

@SpringBootApplication
@Import(MySelector.class)
public class App01 {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App01.class, args);
		System.out.println(context.getBean(User01.class));
	}

}
