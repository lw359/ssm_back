package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.Goodsgys;

public interface GoodsgysMapper extends BaseMapper<Goodsgys> {

    //查询全部商品
    //List<goodsgys> logngoods();
    //商品单个详情查询
    Goodsgys dangegoods(int id);

}
