package com.guigu.controller.Deng;


import org.springframework.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.mapper.Deng.D_merchantMapper;
import com.guigu.pojo.Deng.D_gongyingshangPojo;
import com.guigu.pojo.Deng.D_merchantPojo;
import com.guigu.service.Deng.D_merchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class D_merchantController {
    @Autowired
    D_merchantMapper d_merchantMapper;

    @Autowired
    D_merchantService d_merchantService;

    @RequestMapping("/showAllSh")
    @CrossOrigin
    public List<D_merchantPojo> showAllSh(){
        return d_merchantMapper.selectList(null);
    }
    //模糊查询
    @RequestMapping("/showByIdmerchant.action")
    @CrossOrigin
    public IPage<D_merchantPojo> showByIdmerchant(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                                  @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                                  String name){
        //组装查询条件对象
        QueryWrapper<D_merchantPojo> queryWrapper =new QueryWrapper<D_merchantPojo>();
        if(!StringUtils.isEmpty(name)){
            queryWrapper.like("shangHuName",name);  // where  name like '%val%'
        }
        queryWrapper.orderByAsc("sHId");  //根据id列进行排序
        IPage<D_merchantPojo>  iPage= d_merchantService.page(new Page<D_merchantPojo>(pageno,pagesize),queryWrapper);
        return iPage;
    }
    //查询所有数据
    @RequestMapping("/showAllmer.action")
    @CrossOrigin
    public IPage<D_merchantPojo> showAllMer(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                            @RequestParam(value = "pagesize",defaultValue = "5")int pagesize
    ){
        //组装查询条件对象
        QueryWrapper<D_merchantPojo> queryWrapper =new QueryWrapper<D_merchantPojo>();
        queryWrapper.orderByAsc("sHId");  //根据id列进行排序
        IPage<D_merchantPojo>  iPage= d_merchantService.page(new Page<D_merchantPojo>(pageno,pagesize),queryWrapper);
        return iPage;
    }

    //根据id查询商户
    @RequestMapping("/queryByidMerchant.action")
    @CrossOrigin
    public D_merchantPojo queryByidMerchant(Integer id){
        return d_merchantMapper.selectById(id);
    }

    //修改商户状态
    @RequestMapping("/updateMerchant.action")
    @CrossOrigin
    public int updateMerchant(D_merchantPojo d_merchantPojo){
        //组装查询条件对象
        QueryWrapper<D_merchantPojo> queryWrapper =new QueryWrapper<D_merchantPojo>();
        queryWrapper.eq("sHId",d_merchantPojo.getSHId());
        return  d_merchantMapper.update(d_merchantPojo,queryWrapper);
    }
    //根据id查询商户
    @RequestMapping("/queryByidMerch.action")
    @CrossOrigin
    public D_merchantPojo queryByidMerch(Integer id){
        return d_merchantMapper.selectById(id);
    }

    //模糊查询
    @RequestMapping("/showByIdMerch.action")
    @CrossOrigin
    public IPage<D_merchantPojo> showByIdMerch(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                                   @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                                   String name){
        //组装查询条件对象
        QueryWrapper<D_merchantPojo> queryWrapper =new QueryWrapper<D_merchantPojo>();
        if(!StringUtils.isEmpty(name)){
            queryWrapper.like("shangHuName",name);  // where  name like '%val%'
        }
        queryWrapper.orderByAsc("shid");  //根据id列进行排序
        IPage<D_merchantPojo>  iPage= d_merchantService.page(new Page<D_merchantPojo>(pageno,pagesize),queryWrapper);
        return iPage;
    }
    //查询所有数据
    @RequestMapping("/showAllMerch.action")
    @CrossOrigin
    public IPage<D_merchantPojo> showAllMerch(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                              @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                              String mer_state){
        //组装查询条件对象
        QueryWrapper<D_merchantPojo> queryWrapper =new QueryWrapper<D_merchantPojo>();
        queryWrapper.orderByAsc("sHId").like("mer_state",mer_state);  //根据id列进行排序
        IPage<D_merchantPojo>  iPage= d_merchantService.page(new Page<D_merchantPojo>(pageno,pagesize),queryWrapper);
        return iPage;
    }
    //添加商户
    @RequestMapping("/addMerch.action")
    @CrossOrigin
    public int addMerch(D_merchantPojo d_merchantPojo){
        d_merchantPojo.setMerstate("M-001");
        return d_merchantMapper.insert(d_merchantPojo);
    }
    //删除商户
    @RequestMapping("/deleteMerch.action")
    @CrossOrigin
    public int deleteMerch(Integer shid){
        return d_merchantMapper.deleteById(shid);
    }
    //修改商户
    @RequestMapping("/updateMerch.action")
    @CrossOrigin
    public int updateTenance(D_merchantPojo d_merchantPojo){
        //组装查询条件对象
        QueryWrapper<D_merchantPojo> queryWrapper =new QueryWrapper<D_merchantPojo>();
        queryWrapper.eq("sHId",d_merchantPojo.getSHId());
        return  d_merchantMapper.update(d_merchantPojo,queryWrapper);
    }
}
