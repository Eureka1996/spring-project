package com.wufuqiang.spring;

import com.wufuqiang.spring.beans.NewPerson;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ author wufuqiang
 **/
public class Demo02 {
    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans-autowire.xml");
        NewPerson person = (NewPerson) ioc.getBean("newperson");
        System.out.println(person);
    }
}
