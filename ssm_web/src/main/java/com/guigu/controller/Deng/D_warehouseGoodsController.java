package com.guigu.controller.Deng;


import com.github.pagehelper.PageInfo;
import com.guigu.mapper.Deng.D_warehouseGoodsMapper;
import com.guigu.mapper.Deng.D_warehouseMapper;
import com.guigu.pojo.Deng.D_warehouseGoodsPojo;
import com.guigu.pojo.Deng.D_warehousePojo;
import com.guigu.service.Deng.D_warehouseGoodsService;
import com.guigu.service.Deng.D_warehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class D_warehouseGoodsController {
    @Autowired
    D_warehouseGoodsMapper d_warehouseGoodsMapper;

    @Autowired
    D_warehouseGoodsService d_warehouseGoodsService;

    //查询所有数据
    @RequestMapping("/showAlwarehouse.action")
    @CrossOrigin
    public PageInfo<D_warehouseGoodsPojo> showAlwarehouse(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                                     @RequestParam(value = "pagesize",defaultValue = "5")int pagesize
    ){
        //组装查询条件对象
        return d_warehouseGoodsService.warehouseAll(pageno,pagesize);
     }


    //根据名字模糊查询所有数据
    @RequestMapping("/warehouseName.action")
    @CrossOrigin
    public PageInfo<D_warehouseGoodsPojo> warehouseName(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                                     @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                                   String kcName
    ){
        //组装查询条件对象
        return d_warehouseGoodsService.warehouseName(pageno,pagesize,kcName);
    }

}
