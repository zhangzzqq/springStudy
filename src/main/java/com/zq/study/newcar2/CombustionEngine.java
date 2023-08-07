package com.zq.study.newcar2;

//凸轮轴
 class Camshaft {}
//机轴
 class Crankshaft {}

public class CombustionEngine implements Engine {

    //凸轮轴
    private Camshaft camshaft;

    //机轴
    private Crankshaft crankshaft;

    public CombustionEngine(Camshaft camshaft, Crankshaft crankshaft) {

        this.camshaft = camshaft;

        this.crankshaft = crankshaft;
    }

    @Override

    public void turnOn() {

        System.out.println("燃油引擎启动1");

    }

}


