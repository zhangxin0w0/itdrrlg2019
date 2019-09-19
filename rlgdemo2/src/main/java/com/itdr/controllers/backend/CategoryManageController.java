package com.itdr.controllers.backend;

import com.itdr.common.ServerResponse;
import com.itdr.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: CategoryManageController
 * 日期: 2019/9/12 11:11
 *
 * @author Air张
 * @since JDK 1.8
 */

@Controller
@ResponseBody
@RequestMapping("/manage/category/")
public class CategoryManageController {

    @Autowired
    CategoryService categoryService;

    //根据分类ID查询所有的子类(包括本身)
    @RequestMapping("get_deep_category.do")
    public ServerResponse getDeepCategory(Integer categoryId) {
        ServerResponse sr = categoryService.getDeepCategory(categoryId);
        return sr;
    }

}
