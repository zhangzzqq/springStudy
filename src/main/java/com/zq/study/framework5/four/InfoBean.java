package com.zq.study.framework5.four;


import java.util.Map;

public class InfoBean {

    private String name;
    private String msg;

    private Map<String, String> test123;


    public Map<String, String> getFrameworks() {
        return test123;
    }
    public void setFrameworks(Map<String, String> test) {
        this.test123 = test;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void display() {
        System.out.println("Hi "+name+", "+msg);
        System.out.println("Framework Names: Description");
        for (Map.Entry<String,String> entry : test123.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }

}

