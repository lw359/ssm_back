package com.guigu.controller.Deng;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.guigu.mapper.Deng.D_merchantMapper;
import com.guigu.mapper.Deng.D_warehouseMapper;
import com.guigu.pojo.Deng.D_gongyingshangPojo;
import com.guigu.pojo.Deng.D_merchantPojo;
import com.guigu.pojo.Deng.D_warehouseGoodsPojo;
import com.guigu.pojo.Deng.D_warehousePojo;
import com.guigu.pojo.Goods;
import com.guigu.service.Deng.D_merchantService;
import com.guigu.service.Deng.D_warehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class D_warehouseController {
    @Autowired
    D_warehouseMapper d_warehouseMapper;


    //修改仓库信息
    @RequestMapping("/updateWarehouse.action")
    @CrossOrigin
    public int updateWarehouse(D_warehousePojo d_warehousePojo){
        //组装查询条件对象
        QueryWrapper<D_warehousePojo> queryWrapper =new QueryWrapper<D_warehousePojo>();
        queryWrapper.eq("id",d_warehousePojo.getId());
        d_warehousePojo.setRegistertime(new Date());
        System.out.println(d_warehousePojo.getSpid());
        return  d_warehouseMapper.update(d_warehousePojo,queryWrapper);

    }

    //添加供应商
    @RequestMapping("/addWarehouse.action")
    @CrossOrigin
    public int addWarehouse(D_warehousePojo d_warehousePojo){
//        d_warehousePojo.setRegistertime(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
            d_warehousePojo.setRegistertime(new Date());
        return d_warehouseMapper.insert(d_warehousePojo);
    }
    //删除供应商
    @RequestMapping("/deleteWarehouse.action")
    @CrossOrigin
    public int deleteWarehouse(Integer id){
        return d_warehouseMapper.deleteById(id);
    }

    //根据id模糊查询所有数据
    @RequestMapping("/warehouseById.action")
    @CrossOrigin
    public D_warehousePojo warehouseById(Integer id){
        return d_warehouseMapper.selectById(id);
    }

}

