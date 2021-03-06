package com.imooc.miaoshaproject.service;

import com.imooc.miaoshaproject.error.BusinessException;
import com.imooc.miaoshaproject.service.model.OrderModel;

/**
 * @program: miaosha
 * @description
 * @author: 杨光彩
 * @create: 2019-07-27 15:46
 **/
public interface OrderService {
//   1.通过前端url上传过来秒杀活动id，然后下单接口内校验对应id是否属于对应商品且活动是否已经开始（使用）
//    2.直接在下单接口判断对应的商品是否存在秒杀活动，若存在进行中的则以秒杀价格下单
    OrderModel createOrder(Integer userId,Integer itemId,Integer promoId,Integer amount,String stockLogId) throws BusinessException;
}
