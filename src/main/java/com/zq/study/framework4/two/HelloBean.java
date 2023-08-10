package com.zq.study.framework4.two;


public class HelloBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String helloMsg() {
        return "Hello " + name;
    }

    public void initializeBean() {
        System.out.println("Hello Bean is initialized!!");
    }

    public void destroyBean() {
        System.out.println("Hello Bean is destroyed!!");
    }

}
