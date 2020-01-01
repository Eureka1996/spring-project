package com.wufuqiang.spring.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ author wufuqiang
 **/
public class MyBeanPostProcessor implements BeanPostProcessor {

    //在init-method之前被调用
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization:"+bean+","+beanName);
        return bean;
    }

    /**
     * 在init-method之后被调用
     * @param bean bean实例本身
     * @param beanName IOC容器配置的bean的名字
     * @return 是实际上返回给用户的那个Bean，注意：可以在这两个方法中修改返回的Bean，甚至返回一个新的Bean
     * @throws BeansException
     */
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization:"+bean+","+beanName);
        return bean;
    }
}
