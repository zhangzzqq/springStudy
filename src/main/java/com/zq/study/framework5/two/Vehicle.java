package com.zq.study.framework5.two;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {

    IEngine engine1;
    Tyres tyre;

    public Tyres getTyre()
    {
        return tyre;
    }

    public void setTyre(Tyres tyre)
    {
        System.out.println("tyre instantiated via setter");
        this.tyre = tyre;
    }

    public Vehicle(IEngine engine, Tyres tyre)
    {
        System.out.println("instantiated via constructor");
        this.engine1 = engine;
        this.tyre = tyre;
    }

    public Vehicle() {}
    public IEngine getEngine()
    {

        return engine1;
    }
    public void setEngine(IEngine engine)
    {
        System.out.println("instantiated via setter");
        this.engine1 = engine;
    }

    @Override
    public String toString()
    {
        return engine1 + " " + tyre;
    }

    public static void main(String a[])
    {
        ApplicationContext rootctx
                = new ClassPathXmlApplicationContext(
                "bean5-2.xml");

        // Instantiating the obj1 via Constructor DI
        Vehicle obj1
                = (Vehicle)rootctx
                .getBean("InjectwithConstructor");

        // Instantiating the obj1 via Setter DI
        Vehicle obj2
                = (Vehicle)rootctx
                .getBean("InjectwithSetter");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1 == obj2);
    }
}
