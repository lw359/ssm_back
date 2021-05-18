package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.Goodssp;

import java.util.List;

public interface ShoppingMapper extends BaseMapper<Goodssp> {

    //购物车商品询
    List<Goodssp> gowuche();
    //购物车商品删除
    int deleteGoodsspByid(Integer spId);

}
