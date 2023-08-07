package com.zq.study.newcar1;

import com.zq.study.car.Engine;

public class CombustionEngine implements Engine {


    @Override
    public void turnOn() {
        System.out.println("燃油引擎启动");
    }


}

