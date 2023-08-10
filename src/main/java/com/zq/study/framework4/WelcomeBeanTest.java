package com.zq.study.framework4;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

//org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type
public class WelcomeBeanTest {
    public static void main(String[] args) {
        //没有初始化
        ClassPathResource res = new ClassPathResource("bean4.xml");
        XmlBeanFactory factory = new XmlBeanFactory(res);
        System.out.println("Before getBean() method");

        //初始化
        WelcomeBean welcome = (WelcomeBean) factory.getBean("welcomeBean");
        System.out.println(welcome.welcomeMsg());
        ((XmlBeanFactory)factory).destroySingletons();

    }

}
