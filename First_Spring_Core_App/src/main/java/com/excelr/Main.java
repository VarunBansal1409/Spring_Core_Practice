package com.excelr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Car c1 = new Car();

        // IOC container and use getBean()

        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");

        //use getBean()
        Car c1 = con.getBean("car" , Car.class);
    }

}