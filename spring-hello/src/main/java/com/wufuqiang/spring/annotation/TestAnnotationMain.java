package com.wufuqiang.spring.annotation;

import com.wufuqiang.spring.annotation.controller.UserController;
import com.wufuqiang.spring.annotation.repository.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ author wufuqiang
 **/
public class TestAnnotationMain {
    public static void main(String[] args) {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans-annotation.xml");
        TestObject testObject = (TestObject) ioc.getBean("testObject");
        UserController userController = (UserController) ioc.getBean("userController");
        userController.execute();

//        UserRepository userRepository = (UserRepository) ioc.getBean("userRepository");
//        userRepository.save();
    }
}
