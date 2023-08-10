package com.zq.study.framework5.thirteen.service;


import com.zq.study.framework5.thirteen.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zq.study.framework5.thirteen.dao.UserDao;
/**
 * @Author: qlq
 * @Description
 * @Date: 22:52 2018/9/28
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void saveUser() {
        userDao.saveUser();
    }
}
