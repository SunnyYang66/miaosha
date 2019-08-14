package com.imooc.miaoshaproject.error;

/**
 * @program: miaosha
 * @description
 * @author: 杨光彩
 * @create: 2019-07-26 11:07
 **/
public interface CommonError {
    public int getErrCode();

    public String getErrMsg();

    public CommonError setErrMsg(String errMsg);
}
