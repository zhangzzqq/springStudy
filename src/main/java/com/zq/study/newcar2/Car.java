package com.zq.study.newcar2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.turnOn();
    }

    public static void main(String[] args) {
        ApplicationContext context =new
                AnnotationConfigApplicationContext(AnnotationConfig.class);
        Car car = context.getBean(Car.class);
        car.start();

    }

}

