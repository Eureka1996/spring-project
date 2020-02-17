package com.wufuqiang.spring.annotation.config;

import com.wufuqiang.spring.annotation.entries.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @ author wufuqiang
 * 配置类 == 配置文件
 **/
@Configuration   //告诉Spring这是一个配置类
@ComponentScan(value="com.wufuqiang.spring.annotation",
        excludeFilters = {
            @ComponentScan.Filter(type= FilterType.ANNOTATION,classes = {Controller.class})
        })
//@ComponentScan value:指定要扫描的包
//excludeFilters = Filter[]：指定扫描的时候按照什么规则排除哪些组件
//includeFilters = Filter[]：指定扫描的时候只需要包含哪些组件
public class MainConfig {

    //给容器中注册一个Bean；类型为返回值的类型，id默认是用方法名作为id
    @Bean("person")
    public Person person01(){
        return new Person("wufuqiang",20);
    }
}
