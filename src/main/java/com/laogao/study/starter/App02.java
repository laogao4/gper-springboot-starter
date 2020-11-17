package com.laogao.study.starter;

import java.net.URL;
import java.util.Enumeration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.laogao.study.selector.User01;
import com.laogao.study.selector.User02;
import com.laogao.study.selector.User03;

@SpringBootApplication
public class App02 {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App02.class, args);
		System.out.println(context.getBean(User01.class));
		System.out.println(context.getBean(User02.class));
		System.out.println(context.getBean(User03.class));
	}

	static void getSpringFactories() {
		try {
			ClassLoader classLoader = App02.class.getClassLoader();
			Enumeration<URL> urls = classLoader.getResources("META-INF/spring.factories");
			while (urls.hasMoreElements()) {
				System.out.println(urls.nextElement());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
