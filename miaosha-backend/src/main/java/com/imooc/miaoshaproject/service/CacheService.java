package com.imooc.miaoshaproject.service;

/**
 * @program: miaosha
 * @description： 封装本地缓存操作类
 * @author: 杨光彩
 * @create: 2019-08-06 09:32
 **/
public interface CacheService {
//    存方法
    void  setCommonCache(String key, Object value);

//    取方法
    Object getFromCommonCache(String key);
}
