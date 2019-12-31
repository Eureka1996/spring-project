package com.wufuqiang.spring;

import com.wufuqiang.spring.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ author wufuqiang
 **/
public class Main {
    public static void main(String[] args) {

        //1.创建Spring的IOC容器对象
        //ApplicationContext代表IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.从IOC容器中获取Bean实例
        HelloWorld helloWorld = (HelloWorld)ioc.getBean("helloWorld");
        helloWorld.hello();
        Car car = (Car)ioc.getBean("car");
        Person person1 = (Person) ioc.getBean("person1");
        Person person2 = (Person) ioc.getBean("person2");
        SuperPerson person3 = (SuperPerson)ioc.getBean("person3");
        MapPerson mapperson = (MapPerson) ioc.getBean("mapperson");
        System.out.println(car);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(mapperson);


//        System.out.println("name:"+helloWorld.hello());

    }
}
