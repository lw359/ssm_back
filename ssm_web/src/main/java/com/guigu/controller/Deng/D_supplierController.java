package com.guigu.controller.Deng;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.mapper.Deng.D_gongyingshangMapper;
import com.guigu.pojo.Deng.D_gongyingshangPojo;
import com.guigu.pojo.Goods;
import com.guigu.service.Deng.D_supplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class D_supplierController {
    @Autowired
    D_gongyingshangMapper d_gongyingshangMapper;

    @Autowired
    D_supplierService d_supplierService;

    //查询所有数据
    @RequestMapping("/showAllSupplier.action")
    @CrossOrigin
    public IPage<D_gongyingshangPojo> showAll(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                @RequestParam(value = "pagesize",defaultValue = "5")int pagesize){
        //组装查询条件对象
        QueryWrapper<D_gongyingshangPojo> queryWrapper =new QueryWrapper<D_gongyingshangPojo>();
        queryWrapper.orderByAsc("gysId");  //根据id列进行排序
        IPage<D_gongyingshangPojo>  iPage= d_supplierService.page(new Page<D_gongyingshangPojo>(pageno,pagesize),queryWrapper);
        return iPage;
    }

    //模糊查询
    @RequestMapping("/showByIdSupp.action")
    @CrossOrigin
    public IPage<D_gongyingshangPojo> showByIdSupp(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                              @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                                   String name){
        //组装查询条件对象
        QueryWrapper<D_gongyingshangPojo> queryWrapper =new QueryWrapper<D_gongyingshangPojo>();
        if(!StringUtils.isEmpty(name)){
            queryWrapper.like("gysName",name);  // where  name like '%val%'
        }
        queryWrapper.orderByAsc("gysId");  //根据id列进行排序
        IPage<D_gongyingshangPojo>  iPage= d_supplierService.page(new Page<D_gongyingshangPojo>(pageno,pagesize),queryWrapper);
        return iPage;
    }

    //根据id查询供应商
    @RequestMapping("/queryByidSupplier.action")
    @CrossOrigin
    public D_gongyingshangPojo queryByidSupplier(Integer id){
        return d_gongyingshangMapper.selectById(id);
    }

    //修改供应商状态
    @RequestMapping("/updateSupplier.action")
    @CrossOrigin
    public int updateSupplier(D_gongyingshangPojo d_gongyingshangPojo){
        //组装查询条件对象
        QueryWrapper<D_gongyingshangPojo> queryWrapper =new QueryWrapper<D_gongyingshangPojo>();
        queryWrapper.eq("gysId",d_gongyingshangPojo.getGysId());
        return  d_gongyingshangMapper.update(d_gongyingshangPojo,queryWrapper);
    }
}
