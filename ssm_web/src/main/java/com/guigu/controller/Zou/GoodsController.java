package com.guigu.controller.Zou;

import com.guigu.mapper.GoodsMapper;
import com.guigu.pojo.Z_Goods;
import com.guigu.pojo.Goodssp;
import com.guigu.service.Zou.GoodsService;
import com.guigu.service.Zou.GoodsgysService;
import com.guigu.service.Zou.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class GoodsController {
    @Autowired(required = false)
    GoodsService goodsService;
    @Autowired(required = false)
    GoodsgysService goodsgysService;
    @Autowired(required = false)
    ShoppingService shoppingService;

    @Autowired
    GoodsMapper goodsMapper;

    @RequestMapping("goodsByid.action")
    @ResponseBody
    public Z_Goods showByid(int spId){
        return goodsMapper.selectById(spId);
    }

    //所有商品
    @RequestMapping(value = "/goodsAll.action",produces = {"application/json;charset=utf-8"})
    @CrossOrigin
    public List<Z_Goods> showAll(String name){
        //组装查询条件对象
        List<Z_Goods> goods = goodsService.showAll(name);
        return goods;
    }
    //查询购物车的商品
    @RequestMapping("goodsspAll.action")
    @ResponseBody
    public List<Goodssp> goodsspslist(){
        List<Goodssp> goodssp = shoppingService.gowuche();
        return goodssp;
    }
    //根据id删除购物车的商品
    @RequestMapping("goodsspDelete.action")
    @ResponseBody
    public int goodsspDelete(int spId){
        int deleteGoodsspByid = shoppingService.deleteGoodsspByid(spId);
        return  deleteGoodsspByid;
    }
}
