package com.zq.study.framework5.three;

// Java Program to Illustrate Application Class

// Importing required classes
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Application class
// GFG class
public class Main {

    // Main driver method
    public static void main(String[] args)
    {

        // Implementing Spring IoC
        // Using ApplicationContext
        ApplicationContext context
                = new ClassPathXmlApplicationContext(
                "bean5-3.xml");

        // Getting the bean student
//        Student student
//                = context.getBean("student", Student.class);

        Student student
                = (Student) context.getBean("student");


        // Calling the method inside main() method
        student.cheating();
    }
}

