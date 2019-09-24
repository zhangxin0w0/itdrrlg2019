package com.itdr.controllers.portal;

import com.itdr.common.Const;
import com.itdr.common.ServerResponse;
import com.itdr.pojo.Users;
import com.itdr.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * ClassName: AliPayController
 * 日期: 2019/9/19 23:56
 *
 * @author Air张
 * @since JDK 1.8
 */

@Controller
@ResponseBody
@RequestMapping("/order/")
public class OrderController {

    @Autowired
    OrderService orderService;

    /**
     *
     * @param session
     * @param shippingId
     * @return
     * 创建订单
     */
    @RequestMapping("create.do")
    public ServerResponse createOrder(HttpSession session,Integer shippingId ){
        Users u = (Users)session.getAttribute(Const.LOGINUSER);
        if(u == null){
            return ServerResponse.defeatedRS("用户未登录");
        }
        return orderService.createOrder(u.getId(),shippingId);
    }

}
