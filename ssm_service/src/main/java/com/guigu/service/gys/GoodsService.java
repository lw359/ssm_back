package com.guigu.service.gys;

import com.baomidou.mybatisplus.core.injector.methods.DeleteById;
import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.Goods;

import java.io.Serializable;

public interface GoodsService extends IService<Goods> {
    //根据id查询

    @Override
    Goods getById(Serializable id);

      int DeleteById(int id);

      int Update(Goods goods);

      int add(Goods goods);
}
