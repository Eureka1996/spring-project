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
        System.out.println(car);

        Car car2 =(Car)ioc.getBean("car2");
        System.out.println(car2);

        Person person1 = (Person) ioc.getBean("person1");
        System.out.println(person1);

        Person person2 = (Person) ioc.getBean("person2");
        System.out.println(person2);

        SuperPerson person3 = (SuperPerson)ioc.getBean("person3");
        System.out.println(person3);
        MapPerson mapperson = (MapPerson) ioc.getBean("mapperson");
        DataSource dataSource = (DataSource) ioc.getBean("dataSource");
        SuperPerson person4 = (SuperPerson) ioc.getBean("person4");

        System.out.println(mapperson);
        System.out.println(dataSource);
        System.out.println(person4);

        ((ClassPathXmlApplicationContext)ioc).close();

    }
}
