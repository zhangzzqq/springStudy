package com.zq.study.car;

public class ElectricCar {
    private Engine engine;

    public ElectricCar() {
        this.engine = new ElectricEngine();
    }

    public void start() {
        engine.turnOn();
    }

}

