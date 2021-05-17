package com.guigu.mapper.Deng;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.Deng.D_warehouseGoodsPojo;
import com.guigu.pojo.Deng.D_warehousePojo;

import java.util.List;

public interface D_warehouseGoodsMapper extends BaseMapper<D_warehouseGoodsPojo> {

    //查询仓库所有信息
    List<D_warehouseGoodsPojo> warehouseAll();

    //根据名字查询仓库所有信息
    List<D_warehouseGoodsPojo> warehouseName(String kcName);

    //根据id查询仓库信息
//    D_warehouseGoodsPojo warehouseById(int id);
}
