package com.zq.study.framework5.four;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class InfoBeanTest {

    public static void main(String[] args) {

//        ApplicationContext con = new ClassPathXmlApplicationContext("com/geeks/resources/applicationContext.xml");
        ApplicationContext con = new ClassPathXmlApplicationContext("bean5-4.xml");
        InfoBean infoBean = (InfoBean) con.getBean("info");
        infoBean.display();
    }

}

