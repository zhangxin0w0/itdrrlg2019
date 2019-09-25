package com.itdr.controllers.portal;

import com.itdr.common.Const;
import com.itdr.common.ServerResponse;
import com.itdr.pojo.Users;
import com.itdr.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
     * @param session
     * @param shippingId
     * @return 创建订单
     */
    @RequestMapping("create.do")
    public ServerResponse createOrder(HttpSession session, Integer shippingId) {
        Users u = (Users) session.getAttribute(Const.LOGINUSER);
        if (u == null) {
            return ServerResponse.defeatedRS("用户未登录");
        }
        return orderService.createOrder(u.getId(), shippingId);
    }

    /**
     * 获取订单详情信息
     *
     * @param session
     * @param orderNo
     * @return
     */
    @RequestMapping("get_orderitems.do")
    public ServerResponse getOrderItems(HttpSession session,
                                        @RequestParam(value = "orderNo", required = false) Long orderNo) {
        Users u = (Users) session.getAttribute(Const.LOGINUSER);
        if (u == null) {
            return ServerResponse.defeatedRS("用户未登录");
        }
        return orderService.getOrderItems(u.getId(), orderNo);
    }

    /**
     * 获取用户列表
     * @param session
     * @param pageSize
     * @param pageNum
     * @return
     */
    @RequestMapping("list_order.do")
    public ServerResponse getOrderList(HttpSession session,
                                       @RequestParam(value = "pageSize", required = false,defaultValue = "10") Integer pageSize,
                                       @RequestParam(value = "pageNum", required = false,defaultValue = "1") Integer pageNum) {
        Users u = (Users) session.getAttribute(Const.LOGINUSER);
        if (u == null) {
            return ServerResponse.defeatedRS("用户未登录");
        }
        return orderService.getOrderList(u.getId(),pageNum,pageSize);
    }

    /**
     * 取消订单
     * @param session
     * @param pageSize
     * @param pageNum
     * @return
     */
    @RequestMapping("countermand_order.do")
    public ServerResponse countermandOrder(HttpSession session,Long orderNo) {
        Users u = (Users) session.getAttribute(Const.LOGINUSER);
        if (u == null) {
            return ServerResponse.defeatedRS("用户未登录");
        }
        return orderService.countermandOrder(u.getId(),orderNo);
    }

}
