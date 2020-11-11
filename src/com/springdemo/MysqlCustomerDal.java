package com.springdemo;

//import org.springframework.stereotype.Component;

//@Component("database")   // config ile calistirdigimizda kullanilan annotation
public class MysqlCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		
			System.out.println("Mysql veritabanina ekle Mysql kodlari calistigini farzedelim");
		
	}
	
	}
	

