package com.itdr.services.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdr.common.ServerResponse;
import com.itdr.mappers.CategoryMapper;
import com.itdr.mappers.ProductMapper;
import com.itdr.pojo.Category;
import com.itdr.pojo.Product;
import com.itdr.pojo.Users;
import com.itdr.pojo.vo.ProductVO;
import com.itdr.services.ProductService;
import com.itdr.utils.PoToVoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * ClassName: ProductServiceImpl
 * 日期: 2019/9/18 10:09
 *
 * @author Air张
 * @since JDK 1.8
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Autowired
    CategoryMapper catgoryMapper;

    //获取商品分类信息
    @Override
    public ServerResponse<Product> topCategory(Integer pid) {
        if (pid == null || pid < 0) {
            return ServerResponse.defeatedRS("非法的参数");
        }

        //根据商品分类ID查询子分类
        List<Category> li = catgoryMapper.selectByParentId(pid);

        if (li == null) {
            return ServerResponse.defeatedRS("查询的ID不存在");
        }
        if (li.size() == 0) {
            return ServerResponse.defeatedRS("没有子分类");
        }

        return ServerResponse.successRS(li);
    }


    //获取商品详情
    @Override
    public ServerResponse<Users> detail(Integer productId, Integer is_new, Integer is_hot, Integer is_banner) {
        if (productId == null || productId < 0) {
            return ServerResponse.defeatedRS("非法的参数");
        }

        Product p = productMapper.selectByID(productId, is_new, is_hot, is_banner);

        if (p == null) {
            return ServerResponse.defeatedRS("商品不存在");
        }

        ProductVO productVO = null;
        try {
            productVO = PoToVoUtil.ProductToProductVO(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ServerResponse.successRS(productVO);
    }

    //商品搜索+动态排序
    @Override
    public ServerResponse<Users> listProduct(Integer productId, String keyWord, Integer pageNum, Integer pageSize, String orderBy) {
        if ((productId == null || productId < 0) && (keyWord == null || keyWord.equals(""))) {
            return ServerResponse.defeatedRS("非法参数");
        }

        //分割排序参数
        String[] split = new String[2];
        if(!orderBy.equals("")){
            split = orderBy.split("_");
        }

        String keys = "%"+keyWord+"%";

        PageHelper.startPage(pageNum,pageSize,split[0]+" "+split[1]);
        List<Product> li = productMapper.selectByIdOrName(productId,keys,split[0],split[1]);
        PageInfo pf = new PageInfo(li);

        return ServerResponse.successRS(pf);
    }
}
