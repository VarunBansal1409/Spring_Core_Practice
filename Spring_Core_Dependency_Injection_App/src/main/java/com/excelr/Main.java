package com.excelr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

//		Start IOC
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		
//		use getbean
		Son s1 = con.getBean("son", Son.class);
		s1.m2();
	}
}
