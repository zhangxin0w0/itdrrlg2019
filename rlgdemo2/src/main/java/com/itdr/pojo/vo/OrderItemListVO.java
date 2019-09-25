package com.itdr.pojo.vo;

import java.math.BigDecimal;
import java.util.List;

/**
 * ClassName: OrderItemListVO
 * 日期: 2019/9/25 10:13
 *
 * @author Air张
 * @since JDK 1.8
 */
public class OrderItemListVO {
    private List<OrderItemVO> orderItemVoList;
    private String imageHost;
    private BigDecimal productTotalPrice;

    public List<OrderItemVO> getOrderItemVoList() {
        return orderItemVoList;
    }

    public void setOrderItemVoList(List<OrderItemVO> orderItemVoList) {
        this.orderItemVoList = orderItemVoList;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }

    public BigDecimal getProductTotalPrice() {
        return productTotalPrice;
    }

    public void setProductTotalPrice(BigDecimal productTotalPrice) {
        this.productTotalPrice = productTotalPrice;
    }
}
