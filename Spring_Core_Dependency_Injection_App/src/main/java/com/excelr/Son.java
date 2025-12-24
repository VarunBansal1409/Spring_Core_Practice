package com.excelr;

import org.springframework.beans.factory.annotation.Autowired;

public class Son {

/* //	Setter Dependency Injection
	
//	Create a reference for Father Class
	private Father f1;
	
//	Generate a setter() method
	public void setF1(Father f1) {
		this.f1 = f1;
	}
	
//	Create a Method
	public void m2() {
		System.out.println("I am from Son Class");
		f1.m1();
	} */
	
	
	
/* //	Constructor Dependency Injection
	
//	Create a reference for Father Class
	private Father f1;
	
//	generate constructor using fields
	public Son(Father f1) {
		super();
		this.f1 = f1;
	}
	
//	Create a Method
	public void m2() {
		System.out.println("I am from Son Class");
		f1.m1();
	} */	
	
	
	
//	Filed Dependency Injection
	
//	Create a reference for Father Class and use annotation
	@Autowired
	private Father f1;
	
//	Generate a setter() method
	public void setF1(Father f1) {
		this.f1 = f1;
	}
			
//	Create a Method
	public void m2() {
		System.out.println("I am from Son Class");
		f1.m1();
	}
}
