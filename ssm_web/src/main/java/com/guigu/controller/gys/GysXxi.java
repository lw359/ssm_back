package com.guigu.controller.gys;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.pojo.Goods;
import com.guigu.service.gys.GoodsService;
import com.guigu.service.gys.serviceImpl.GoodsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@CrossOrigin
public class GysXxi {

    @Autowired
    GoodsService goodsService;

        //查询所有数据
        @RequestMapping("/showAll.action")
        @CrossOrigin
        public IPage<Goods> showAll(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                    @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                    Goods goods){
                //组装查询条件对象
            QueryWrapper<Goods> queryWrapper =new QueryWrapper<Goods>();
            if(!StringUtils.isEmpty(goods.getGoodsName())){
                queryWrapper.like("name",goods.getGoodsName());  // where  name like '%val%'
            }
            queryWrapper.orderByAsc("spId");  //根据id列进行排序
            IPage<Goods>  iPage= goodsService.page(new Page<Goods>(pageno,pagesize),queryWrapper);
                return iPage;
        }

        //根据id查询数据用于编辑
    @RequestMapping("querySpbyid.action")
        public Goods querySpbyid (int id){
        Goods goods = goodsService.getById(id);
        return goods;
    }

    //根据id删除数据用于
    @RequestMapping("deleteSpbyid.action")
    public int deleteSpbyid (int id){
        int i = goodsService.DeleteById(id);
        return i;
    }
    //修改
    @RequestMapping("xiugaiSp.action")
    public int xiugaiSp (Goods goods){
        int update = goodsService.Update(goods);
        return update;
    }

    @RequestMapping("addSp.action")
    @ResponseBody
    public int addgoods (Goods goods){
            goods.setYsTime(new Date());
        int add = goodsService.add(goods);
        return add;
    }
}
