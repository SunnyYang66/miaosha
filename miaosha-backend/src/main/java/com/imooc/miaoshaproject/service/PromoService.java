package com.imooc.miaoshaproject.service;

import com.imooc.miaoshaproject.service.model.PromoModel;

/**
 * @program: miaosha
 * @description
 * @author: 杨光彩
 * @create: 2019-07-27 20:38
 **/
public interface PromoService {
//    根据itemid获取即将进行或者正在进行的秒杀活动
    PromoModel getPromoByItemId(Integer itemId);
//    活动发布
    void  publishPromo(Integer promoId);
}
