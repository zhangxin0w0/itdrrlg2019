package com.itdr.pojo.vo;

import java.math.BigDecimal;
import java.util.List;

/**
 * ClassName: CartVO
 * 日期: 2019/9/19 14:53
 *
 * @author Air张
 * @since JDK 1.8
 */
public class CartVO {
    private List<CartProductVO> cartProductVoList;
    private boolean allChecked;
    private BigDecimal cartTotalPrice;
    private String imageHost;

    public List<CartProductVO> getCartProductVoList() {
        return cartProductVoList;
    }

    public void setCartProductVoList(List<CartProductVO> cartProductVoList) {
        this.cartProductVoList = cartProductVoList;
    }

    public boolean isAllChecked() {
        return allChecked;
    }

    public void setAllChecked(boolean allChecked) {
        this.allChecked = allChecked;
    }

    public BigDecimal getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(BigDecimal cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }
}
