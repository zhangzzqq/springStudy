package com.zq.study.framework4.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloBeanTest {

    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Before getBean() method");
        HelloBean hello = (HelloBean) con.getBean("helloBean");

        System.out.println(hello.helloMsg());
        ((ClassPathXmlApplicationContext) con).close();

    }

}

