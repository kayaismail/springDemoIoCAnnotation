package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//ilgili config dosyasina git 
	AnnotationConfigApplicationContext context =
			new AnnotationConfigApplicationContext(IocConfig.class);
	
	//ICustomerDal customerDal = context.getBean("database", ICustomerDal.class);
	ICustomerService customerService = context.getBean("service", ICustomerService.class);// bu service`i, service Dal`i cagiriyor
		customerService.add();
	}

}
