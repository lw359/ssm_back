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
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
            queryWrapper.orderByDesc("spId");  //根据id列进行排序
            IPage<Goods>  iPage= goodsService.page(new Page<Goods>(pageno,pagesize),queryWrapper);
                return iPage;
        }
}
