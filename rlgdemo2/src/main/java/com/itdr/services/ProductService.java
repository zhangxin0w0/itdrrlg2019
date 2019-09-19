package com.itdr.services;

import com.itdr.common.ServerResponse;
import com.itdr.pojo.Product;
import com.itdr.pojo.Users;

/**
 * ClassName: ProductService
 * 日期: 2019/9/18 10:08
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface ProductService {
    //获取商品分类信息
    ServerResponse<Product> topCategory(Integer pid);

    //获取商品详情
    ServerResponse<Users> detail(Integer productId, Integer is_new, Integer is_hot, Integer is_banner);

    //商品搜索+动态排序
    ServerResponse<Users> listProduct(Integer productId, String keyWord, Integer pageNum, Integer pageSize, String orderBy);
}
