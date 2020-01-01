package com.wufuqiang.spring.factory;

import com.wufuqiang.spring.beans.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * @ author wufuqiang
 * 实例工厂方法：实例工厂的方法，需要创建 工厂本身，再调用工厂的实例方法来返回bean的实例
 **/
public class InstanceCarFactory {
    private static Map<String,Car> cars ;

    public InstanceCarFactory(){
        cars = new HashMap<String,Car>();
        cars.put("biyadi",new Car("biyadi","guangzhou",300000,123.56));
        cars.put("ford",new Car("ford","changan",300012,178.56));
    }
    private Car getCar(String name){
        return cars.getOrDefault(name,null);
    }
}
