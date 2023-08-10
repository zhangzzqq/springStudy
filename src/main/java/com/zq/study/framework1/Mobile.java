package com.zq.study.framework1;

// Java Program to Illustrate Mobile Class

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Class
public class Mobile {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating instance of Sim interface
        // inside main() method
        // with reference to Jio class constructor
        // invocation
//        Sim sim = new Jio();
//
//        // Sim sim = new Airtel();
//
//        sim.calling();
//        sim.data();

        // Using ApplicationContext tom implement Spring IoC
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        // Get the bean
        Sim sim = applicationContext.getBean("sim", Sim.class);

        // Calling the methods
        sim.calling();
        sim.data();


    }
}

