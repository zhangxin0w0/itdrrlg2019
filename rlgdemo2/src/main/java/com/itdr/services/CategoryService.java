package com.itdr.services;

import com.itdr.common.ServerResponse;

/**
 * ClassName: CategoryService
 * 日期: 2019/9/12 11:18
 *
 * @author Air张
 * @since JDK 1.8
 */
public interface CategoryService {

    //根据分类ID查询所有的子类(包括本身)
    ServerResponse getDeepCategory(Integer categoryId);
}
