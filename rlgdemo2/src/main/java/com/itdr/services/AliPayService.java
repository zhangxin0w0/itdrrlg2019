package com.itdr.services;

import com.itdr.common.ServerResponse;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * ClassName: AliPayService
 * 日期: 2019/9/20 0:06
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface AliPayService {
    /*订单支付*/
    ServerResponse alipay(Long orderno, Integer uid);

    /*查询订单支付状态*/
    ServerResponse selectByOrderNo(Long orderno);

    /*回调成功后做的处理*/
    ServerResponse alipayCallback(Map<String, String> params);
}
