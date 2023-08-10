package com.zq.study.framework5.eleven;

// Java Program to Illustrate Application class

// Importing package here
// Importing required classes
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Annotation
@SpringBootApplication
public class DemoApplication {

    // Main driver method
    public static void main(String[] args)
    {

        // /Users/steven/project/javaProject/study/spring/springStudy/src/main/java/com/zq/study/framework5/eleven
        // Annotation based spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.zq.study.framework5.eleven");
        context.refresh();

        // Getting the Bean from the component class
        ComponentDemo componentDemo = context.getBean(ComponentDemo.class);
        componentDemo.demoFunction();

        // Closing the context
        // using close() method
        context.close();
    }
}

