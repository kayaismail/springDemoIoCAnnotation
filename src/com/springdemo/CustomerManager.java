package com.springdemo;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	 // constructer injectionarg kullandik 
	public CustomerManager(ICustomerDal customerDal) { //manager icerisinde dal kullandik const. yardimi ile
		this.customerDal = customerDal;
	}

	public void add() {
	//CustomerDal customerDal=new CustomerDal(); // ioc ye gore bir class baska bir classi kullandiginda onu new lememeli
	
	customerDal.add();
	}
	
}
 