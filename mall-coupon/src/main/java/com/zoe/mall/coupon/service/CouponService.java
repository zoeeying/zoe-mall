package com.zoe.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zoe.mall.common.utils.PageUtils;
import com.zoe.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author zoe
 * @email zoeeying@gmail.com
 * @date 2022-02-08 23:32:48
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

