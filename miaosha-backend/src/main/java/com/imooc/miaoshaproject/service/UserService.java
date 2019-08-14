package com.imooc.miaoshaproject.service;

import com.imooc.miaoshaproject.error.BusinessException;
import com.imooc.miaoshaproject.service.model.UserModel;

/**
 * @program: miaosha
 * @description
 * @author: 杨光彩
 * @create: 2019-07-26 08:57
 **/
public interface UserService {
    //    通过id获取user对象的方法
    UserModel getUserById(Integer id);

    //    通过缓存获取用户对象
    UserModel getUserByIdInCache(Integer id);

    void register(UserModel userModel) throws BusinessException;

    /*
    telphone:用户注册手机
    encrptPassword:用户加密后的密码
     */
    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;
}
