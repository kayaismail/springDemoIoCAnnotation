package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

//import org.springframework.stereotype.Component;

//@Component("database") // config
public class MsSqlCustomerDal implements ICustomerDal {
	@Value("${database.ConnectionString}")
	String connectionString; // metin degeri enjecsiyon
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	public void add() {
	System.out.println("connection strint :"+this.connectionString);
	System.out.println("MS SQL veritabanina ekle MsSql kodlari calistigini farzedelim");
	}
	
}
