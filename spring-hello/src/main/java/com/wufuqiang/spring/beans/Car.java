package com.wufuqiang.spring.beans;

/**
 * @ author wufuqiang
 **/
public class Car {
    private String brand;
    private String corp;
    private int price;
    private double maxSpeed;

    public Car(String brand, String corp, int price,double maxSpeed) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
