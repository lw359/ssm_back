package com.guigu.service.Deng.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.mapper.Deng.D_warehouseGoodsMapper;
import com.guigu.mapper.Deng.D_warehouseMapper;
import com.guigu.pojo.Deng.D_warehouseGoodsPojo;
import com.guigu.pojo.Deng.D_warehousePojo;
import com.guigu.service.Deng.D_warehouseGoodsService;
import com.guigu.service.Deng.D_warehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class D_warehouseGoodsServiceImpl extends
        ServiceImpl<D_warehouseGoodsMapper, D_warehouseGoodsPojo>
        implements D_warehouseGoodsService {
    @Autowired
    D_warehouseGoodsMapper d_warehouseGoodsMapper;



    @Override
    public PageInfo<D_warehouseGoodsPojo> warehouseAll(Integer pageno, Integer pagesize) {
        PageHelper.startPage(pageno,pagesize);
       List<D_warehouseGoodsPojo> list= d_warehouseGoodsMapper.warehouseAll();
        return new PageInfo<D_warehouseGoodsPojo>(list);
    }

    @Override
    public PageInfo<D_warehouseGoodsPojo> warehouseName(Integer pageno, Integer pagesize,
                                                   String kcName) {
        PageHelper.startPage(pageno,pagesize);
        List<D_warehouseGoodsPojo> kcname = d_warehouseGoodsMapper.warehouseName(kcName);
        return new PageInfo<D_warehouseGoodsPojo>(kcname);
    }

//    @Override
//    public D_warehouseGoodsPojo warehouseById(int id) {
//        return d_warehouseGoodsMapper.warehouseById(id);
//    }

}
