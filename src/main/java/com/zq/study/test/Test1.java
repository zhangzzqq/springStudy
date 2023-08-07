package com.zq.study.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {


    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.save();



    }


}
