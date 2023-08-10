package com.zq.study.framework5.nine;

// Java Program to Illustrate Application Class


// importing required classes
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

// Application class
// Main class
public class Test2 {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating a class path resource
        Resource resource = new ClassPathResource(
                "bean5-9.xml");

        // Creating an object of Beanfactory class
        BeanFactory factory = new XmlBeanFactory(resource);

        // Creating an object of Employee class
        Company c = (Company)factory.getBean("company");

        // Calling print() method inside main() method
        c.display();
    }
}

