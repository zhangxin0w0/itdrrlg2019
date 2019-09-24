package com.itdr.services;

import com.itdr.common.ServerResponse;

/**
 * ClassName: OrderService
 * 日期: 2019/9/24 9:48
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface OrderService {
    //创建订单
    ServerResponse createOrder(Integer uid, Integer shippingId);
}
