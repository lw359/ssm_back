package com.guigu.service.Zou;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.Goodssp;
import java.util.List;

public interface ShoppingService extends IService<Goodssp> {
    //根据id查询商品购物车
    List<Goodssp> gowuche();
    //购物车商品删除
    int deleteGoodsspByid(Integer spId);

}
