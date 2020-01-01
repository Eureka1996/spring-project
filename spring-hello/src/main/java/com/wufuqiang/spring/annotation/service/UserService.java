package com.wufuqiang.spring.annotation.service;

import com.wufuqiang.spring.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ author wufuqiang
 **/
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void add(){
        System.out.println("UserService add ...");
        userRepository.save();
    }
}
