package com.zq.study.framework5.seven;

// Java Program to Illustrate CourseFactory Class



// Class
public class CourseFactory {

    // Method
    // factory method returning instance to another class
    public static GeeksCourses getCourses()
    {
        // Returning the instance of JavaCourses class
        // One can also return the instance of DSACourses
        return new JavaCourses();
    }
}

