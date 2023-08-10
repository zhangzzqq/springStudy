package com.zq.study.framework5.twelve;


import com.zq.study.framework5.twelve.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: qlq
 * @Description
 * @Date: 22:54 2018/9/28
 */
public class TestApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean5-12.xml");


//        Sim sim = applicationContext.getBean("sim", Sim.class);

        //第一种:用beanId获取bean
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        userService.saveUser();

        //第二种:用bean的class获取bean
        UserService userService = (UserService) applicationContext.getBean(UserService.class);
        userService.saveUser();



    }


}
