package com.guigu.controller.Deng;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.mapper.GoodsMapper;
import com.guigu.pojo.Goods;
import com.guigu.service.gys.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class D_tenanceController {

    @Autowired
    GoodsService goodsService;

    @Autowired
    GoodsMapper goodsMapper;

    //查询所有数据
    @RequestMapping("/showTenanGoods.action")
    @CrossOrigin
    public IPage<Goods> showAll(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                String name){
        //组装查询条件对象
        QueryWrapper<Goods> queryWrapper =new QueryWrapper<Goods>();
        if(!StringUtils.isEmpty(name)){
            queryWrapper.like("goodsName",name);  // where  name like '%val%'
        }
        queryWrapper.orderByAsc("spId");  //根据id列进行排序
        IPage<Goods>  iPage= goodsService.page(new Page<Goods>(pageno,pagesize),queryWrapper);
        return iPage;
    }

    //根据id查询商品
    @RequestMapping("/queryByidTenan.action")
    @CrossOrigin
    public Goods queryByidTenan(Integer id){
        return goodsMapper.selectById(id);
    }
    //添加商品
    @RequestMapping("/addTenanGoods.action")
    @CrossOrigin
    public int addTenanGoods(Goods goods){
        return goodsMapper.insert(goods);
    }

    //删除商品
    @RequestMapping("/deleteTenance.action")
    @CrossOrigin
    public int deleteTenance(Integer id){
        return goodsMapper.deleteById(id);
    }

    //修改商品
    @RequestMapping("/updateTenance.action")
    @CrossOrigin
    public int updateTenance(Goods goods){
        //组装查询条件对象
        QueryWrapper<Goods> queryWrapper =new QueryWrapper<Goods>();
        queryWrapper.eq("spId",goods.getSpId());
        return  goodsMapper.update(goods,queryWrapper);
    }
}
