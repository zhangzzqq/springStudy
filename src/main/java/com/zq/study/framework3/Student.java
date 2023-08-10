package com.zq.study.framework3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Class
@Component
public class Student {

    // member variables
    private int id;
    private String name;

    // Constructor 1
    public Student() {}

    // Constructor 2
    @Autowired
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method of this class
    // @Override
    public String toString() {

        return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
