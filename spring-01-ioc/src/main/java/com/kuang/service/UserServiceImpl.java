package com.kuang.service;

import com.kuang.dao.UserDao;
import com.kuang.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    //private UserDao userDao = new UserDaoImpl();

    /**
     * IOC本质：
     * 控制反转(IOC)是一种设计思想，DI(依赖注入)是实现ioc的一种方法，没有IOC的程序中，我们使用
     * 面向对象编程，对象的创建与对象件的依赖关系完全硬编码在程序中，对象的创建由程序自己控制，控
     * 制反转后将对象的创建转移给第三方，所谓的控制反转就是:获得依赖对象的方式反转了。
     *
     * 之前程序主动创建对象，
     * private UserDao userDao = new UserDaoImpl();
     *
     * 使用了set注入之后，程序不在具有主动性，而变成了被动的接受对象
     *
     * 总结：程序员不用再去管理对象的创建了，从本质上解决了问题，系统耦合性大大降低。
     */
    private UserDao userDao;
    //利用setUserDao实现值的注入
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser(){
        userDao.getUser();
    }
}
