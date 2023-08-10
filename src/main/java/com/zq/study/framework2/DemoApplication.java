package com.zq.study.framework2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Application class
@SpringBootApplication
// Main class
public class DemoApplication {
    // Main driver method

//    // Using ApplicationContext tom implement Spring IoC
//    ApplicationContext applicationContext.xml = new ClassPathXmlApplicationContext("beans.xml");
//    // Get the bean
//    Sim sim = applicationContext.xml.getBean("sim", Sim.class);
//    // Calling the methods
//        sim.calling();
//        sim.data();


    public static void main(String[] args) {
        // Creating object in a spring container (Beans)
        BeanFactory factory = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
        Student student = (Student) factory.getBean("student");
        System.out.println(student);
    }
}
