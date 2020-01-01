package com.wufuqiang.spring;

import com.wufuqiang.spring.beans.Address;
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
        Address address2 = (Address) ioc.getBean("address2");
        NewPerson newperson2 = (NewPerson) ioc.getBean("newperson2");
        Address address4 = (Address) ioc.getBean("address4");
        System.out.println(person);
        System.out.println(address2);
        System.out.println(newperson2);
        System.out.println(address4);
    }
}
