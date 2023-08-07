package com.zq.study.newcar1;

import com.zq.study.car.Engine;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.turnOn();
    }
}

class CombustionCar extends Car{


    public CombustionCar() {
        super(new CombustionEngine());
    }

}

 class ElectricCar extends Car {

    public ElectricCar() {
        super(new ElectricEngine());
    }


     public static void main(String[] args) {

         CombustionCar combustionCar1 = new CombustionCar();
         combustionCar1.start();
         ElectricCar electricCar1 = new ElectricCar();
         electricCar1.start();
     }


}


