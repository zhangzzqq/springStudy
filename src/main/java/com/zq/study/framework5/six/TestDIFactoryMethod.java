package com.zq.study.framework5.six;

// Java Program to Illustrate TestDIFactoryMethod Class

// Importing required classes
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Class
public class TestDIFactoryMethod {

    // Main driver method
    public static void main(String[] args)
    {

        // Reading the application-context file
        // from the class-path
        AbstractApplicationContext context
                = new ClassPathXmlApplicationContext(
                "bean5-5.xml");

        // Spring check the blueprint for Geeks bean
        // from application-context.xml file and return it
//        Geeks geeksObj = (Geeks)context.getBean("geeksId");
        Geeks geeksObj = context.getBean("geeksId",Geeks.class);

        // geeksObj contain the dependency of Geeks class
        geeksObj.geeksMessage();
    }
}

