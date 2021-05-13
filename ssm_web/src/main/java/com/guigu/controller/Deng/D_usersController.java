package com.guigu.controller.Deng;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.mapper.Deng.D_usersMapper;
import com.guigu.pojo.Deng.D_usersPojo;
import com.guigu.service.Deng.D_usersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class D_usersController {
    @Autowired
    D_usersService d_usersService;

    @Autowired
    D_usersMapper d_usersMapper;

    //查询所有数据
    @RequestMapping("/showTenanUsers.action")
    @CrossOrigin
    public IPage<D_usersPojo> showAll(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                @RequestParam(value = "pagesize",defaultValue = "5")int pagesize
                                ){
        //组装查询条件对象
        QueryWrapper<D_usersPojo> queryWrapper =new QueryWrapper<D_usersPojo>();
        queryWrapper.orderByAsc("ID");  //根据id列进行排序
        IPage<D_usersPojo>  iPage= d_usersService.page(new Page<D_usersPojo>(pageno,pagesize),queryWrapper);
        return iPage;
    }

    //模糊查询
    @RequestMapping("/showTenanUsersMh.action")
    @CrossOrigin
    public IPage<D_usersPojo> showAll(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                      @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                      String name
    ){
        //组装查询条件对象
        QueryWrapper<D_usersPojo> queryWrapper =new QueryWrapper<D_usersPojo>();
        if(!StringUtils.isEmpty(name)){
            queryWrapper.like("username",name);  // where  name like '%val%'
        }
        queryWrapper.orderByAsc("ID");  //根据id列进行排序
        IPage<D_usersPojo>  iPage= d_usersService.page(new Page<D_usersPojo>(pageno,pagesize),queryWrapper);
        return iPage;
    }

    //增加用户
    @RequestMapping("/addTenanUsers.action")
    @CrossOrigin
    public int addTenanUsers(D_usersPojo d_usersPojo){
        //默认添加用户时状态为U-001：可用
        return d_usersMapper.insert(d_usersPojo);
    }

    //删除商品
    @RequestMapping("/deleteTenanceUser.action")
    @CrossOrigin
    public int deleteTenance(Integer id){
        return d_usersMapper.deleteById(id);
    }

    //根据id查询用户
    @RequestMapping("/queryByidUser.action")
    @CrossOrigin
    public D_usersPojo queryByidUser(Integer id){
        return d_usersMapper.selectById(id);
    }

    //修改商品
    @RequestMapping("/updateUser.action")
    @CrossOrigin
    public int updateTenance(D_usersPojo goods){
        //组装查询条件对象
        QueryWrapper<D_usersPojo> queryWrapper =new QueryWrapper<D_usersPojo>();
        queryWrapper.eq("ID",goods.getID());
        return  d_usersMapper.update(goods,queryWrapper);
    }
}
