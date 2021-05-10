package com.guigu.controller.Deng;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.mapper.Deng.D_goddsStypeMapper;
import com.guigu.pojo.Deng.D_goodstype;
import com.guigu.service.Deng.D_goodstypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class D_GoodsController {
    @Autowired
    D_goodstypeService d_goodstypeService;

    @Autowired
    D_goddsStypeMapper d_goddsStypeMapper;

    //查询所有数据
    @RequestMapping("/show.action")
    @CrossOrigin
    public IPage<D_goodstype> showAll(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                      @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                      D_goodstype d_goodstype){
//组装查询条件对象
        QueryWrapper<D_goodstype> queryWrapper =new QueryWrapper<D_goodstype>();
        if(!StringUtils.isEmpty(d_goodstype.getKindName())){
            queryWrapper.like("Kind_Name",d_goodstype.getKindName());  // where  name like '%val%'
        }
        queryWrapper.orderByAsc("spTypeId");  //根据id列进行排序
        IPage<D_goodstype>  iPage= d_goodstypeService.page(new Page<D_goodstype>(pageno,pagesize),queryWrapper);
        return iPage;
    }

    //修改，根据id查询相对应的分类信息
    @RequestMapping("/queryById.action")
    @CrossOrigin
    public D_goodstype queryById(Integer id){
        return d_goddsStypeMapper.selectById(id);
    }

    //修改分类信息
    @RequestMapping("/updateByGoods.action")
    @CrossOrigin
    public int updateByGoods(D_goodstype d_goodstype){
        System.out.println(d_goodstype);
        return  d_goddsStypeMapper.update(d_goodstype,new QueryWrapper<D_goodstype>());
    }
}
