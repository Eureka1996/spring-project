package com.wufuqiang.spring.factory;

/**
 * @ author wufuqiang
 **/

import com.wufuqiang.spring.beans.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法：直接调用某一个类的静态方法就可以返回Bean的实例
 */
public class StaticCarFactory {
    private static Map<String,Car> cars = new HashMap<String,Car>();
    static{
        cars.put("biyadi",new Car("biyadi","guangzhou",300000,123.56));
        cars.put("ford",new Car("ford","changan",300012,178.56));
    }
    private static Car getCar(String name){
        return cars.getOrDefault(name,null);
    }
}
