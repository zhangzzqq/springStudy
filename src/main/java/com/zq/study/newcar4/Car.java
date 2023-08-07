package com.zq.study.newcar4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {


    private Engine engine;



    public void start() {

        engine.turnOn();

    }


    public Engine getEngine() {

        return engine;

    }


    @Autowired
    public void setEngine(Engine engine) {

        this.engine = engine;

    }

}




