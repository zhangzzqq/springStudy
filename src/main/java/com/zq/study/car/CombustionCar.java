package com.zq.study.car;

public class CombustionCar {

    private Engine engine;

    public CombustionCar() {
        this.engine = new CombustionEngine();
    }

    public void start() {
        engine.turnOn();
    }



}
