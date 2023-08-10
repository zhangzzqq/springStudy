package com.zq.study.framework3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Class
// @SpringBootApplication
public class DemoApplication {

    // Main driver method
    public static void main(String[] args) {
        // SpringApplication.run(DemoApplication.class, args);
        // Creating its object
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = context.getBean(Student.class);
        // Print and display
        System.out.println(student);


//        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//
//        Student student = context.getBean(Student.class);
//
//        // Print and display
//        System.out.println(student);


    }
}
