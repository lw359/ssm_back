package com.guigu.service.Zou;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.Goodsgys;

public interface GoodsgysService extends IService<Goodsgys> {

    //查询所有商品
//    List<goodsgys> logngoods();
    //根据id查询商品详情
    Goodsgys selectById(int id);
}
