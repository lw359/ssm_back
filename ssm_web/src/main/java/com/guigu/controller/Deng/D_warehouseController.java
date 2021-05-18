package com.guigu.controller.Deng;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guigu.mapper.Deng.D_warehouseMapper;
import com.guigu.pojo.Deng.D_warehousePojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

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

