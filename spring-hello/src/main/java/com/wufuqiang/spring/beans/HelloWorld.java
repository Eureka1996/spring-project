package com.wufuqiang.spring.beans;

/**
 * @ author wufuqiang
 **/
public class HelloWorld {

    private String name;

    public void setNane(String name){
        System.out.println("set HelloWorld name");
        this.name = name;
    }

    public void hello(){
        System.out.println("hello:"+this.name);
    }

}
