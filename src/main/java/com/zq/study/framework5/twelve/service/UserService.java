package com.zq.study.framework5.twelve.service;


import com.zq.study.framework5.twelve.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: qlq
 * @Description
 * @Date: 22:52 2018/9/28
 */
public class UserService {


    // 没有写UserDao set方法 ，没有写UserService构造方法
    // 注解
    @Autowired
    private UserDao userDao;

//    private UserDao userDao;
//
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void saveUser() {
        userDao.saveUser();
    }



}
