package com.wufuqiang.spring.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @ author wufuqiang
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car {
    private String brand;
    private String corp;
    private int price;
    private double maxSpeed;

    public void init(){
        System.out.println("init car.");
    }

    public void destroy(){
        System.out.println("destroy car");
    }
}
