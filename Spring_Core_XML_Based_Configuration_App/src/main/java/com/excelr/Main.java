package com.excelr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

//		IOC
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		
//		getBean
		Car c1 = con.getBean("car" , Car.class);
		System.out.println(c1);
	}

}
