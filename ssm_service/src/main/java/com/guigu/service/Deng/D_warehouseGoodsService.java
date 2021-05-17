package com.guigu.service.Deng;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.pojo.Deng.D_warehouseGoodsPojo;
import com.guigu.pojo.Deng.D_warehousePojo;

public interface D_warehouseGoodsService extends IService<D_warehouseGoodsPojo> {

    //查询仓库所有信息
    PageInfo<D_warehouseGoodsPojo> warehouseAll(Integer pageno,Integer pagesize);


    //查询仓库所有信息
    PageInfo<D_warehouseGoodsPojo> warehouseName(Integer pageno,Integer pagesize,String kcName);


    //根据id查询仓库信息
//    D_warehouseGoodsPojo warehouseById(int id);


}
