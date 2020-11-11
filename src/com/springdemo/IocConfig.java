package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springdemo")  //icindeki tum classlari tarayacak
@PropertySource("classpath:values.properties")
public class IocConfig {
	@Bean
	public ICustomerDal database() {
		
		return new MsSqlCustomerDal();
	}
	@Bean
	public ICustomerService service() {
												//new MysqlCustomerDal() yazabilirdik parametre olarak ama 
		return new CustomerManager(database()); // Tum bagimliliklari tekn noktadan yonetmis olduk yukaridaki db ile
	}


	
}
