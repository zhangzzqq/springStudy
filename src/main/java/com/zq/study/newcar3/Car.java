package com.zq.study.newcar3;

import com.zq.study.newcar2.AnnotationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private Engine engine;


    @Autowired
    public Car(Engine engine) {

        this.engine = engine;
    }

    public void start() {

        engine.turnOn();

    }

    public static void main(String[] args) {
        ApplicationContext context =new
                AnnotationConfigApplicationContext(AutomatedAnnotationConfig.class);
       Car car = context.getBean(Car.class);
        car.start();

    }


}


