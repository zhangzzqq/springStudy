package com.zq.study.newcar1;

import com.zq.study.car.Engine;

public class ElectricEngine implements Engine {

    @Override
    public void turnOn() {
        System.out.println("电动引擎启动");
    }


}


