package com.itdr.mappers;

import com.itdr.pojo.OrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);

    //根据订单号查对应商品详情
    List<OrderItem> selectByOrderNo(Long oid);

    int insertAll(@Param("orderItems") List<OrderItem> orderItems);

    //根据订单号和用户ID查对应商品详情
    List<OrderItem> selectByOrderNoAndUid(@Param("orderNo") Long orderNo, @Param("uid") Integer uid);
}