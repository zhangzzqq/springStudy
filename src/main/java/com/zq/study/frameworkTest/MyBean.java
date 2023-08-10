package com.zq.study.frameworkTest;

public class MyBean {

    private String name ;

    public MyBean(String name) {
        this.name = name;
    }

    protected void printName(){

        System.out.println("the name is from MyBean="+name);
    }
}
