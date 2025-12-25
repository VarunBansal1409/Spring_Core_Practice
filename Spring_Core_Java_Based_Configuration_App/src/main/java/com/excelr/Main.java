package com.excelr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	public class Main {

		public static void main(String[] args) {

//			IOC
			ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
			
//			getBean
			Car res = con.getBean("modifyCar" , Car.class);
			System.out.println(res);
		}
	}
