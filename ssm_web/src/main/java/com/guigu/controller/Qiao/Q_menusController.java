package com.guigu.controller.Qiao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.mapper.Qiao.Q_menusMapper;
import com.guigu.pojo.Qiao.Q_menusPojo;
import com.guigu.service.Qiao.Q_menusService;
import com.guigu.service.Qiao.impl.Q_menusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Q_menusController {
    @Autowired

    Q_menusService q_menusService;
    @Autowired
    Q_menusMapper q_menusMapper;

    //查询所有数据
    @RequestMapping("/MenusAll.action")
    @CrossOrigin
    public IPage<Q_menusPojo> showAll(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                      @RequestParam(value = "pagesize",defaultValue = "5")int pagesize
                                ){
        //组装查询条件对象
        QueryWrapper<Q_menusPojo> queryWrapper =new QueryWrapper<Q_menusPojo>();
        queryWrapper.orderByAsc("mid");  //根据id列进行排序
        IPage<Q_menusPojo>  iPage= q_menusService.page(new Page<Q_menusPojo>(pageno,pagesize),queryWrapper);
        return iPage;
    }

    //模糊查询
    @RequestMapping("/showMenusMh.action")
    @CrossOrigin
    public IPage<Q_menusPojo> showAll(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                      @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                      String name
    ){
        //组装查询条件对象
        QueryWrapper<Q_menusPojo> queryWrapper =new QueryWrapper<Q_menusPojo>();
        if(!StringUtils.isEmpty(name)){
            queryWrapper.like("name",name);  // where  name like '%val%'
        }
        queryWrapper.orderByAsc("mid");  //根据id列进行排序
        IPage<Q_menusPojo>  iPage= q_menusService.page(new Page<Q_menusPojo>(pageno,pagesize),queryWrapper);
        return iPage;
    }

    //增加用户
    @RequestMapping("/addMenus.action")
    @CrossOrigin
    public int addMenus(Q_menusPojo q_menusPojo){
        //默认添加用户时状态为U-001：可用
        return q_menusMapper.insert(q_menusPojo);
    }
//
    //删除角色
    @RequestMapping("/deleteMenus.action")
    @CrossOrigin
    public int deleteMenus(Integer mid){
        return q_menusMapper.deleteById(mid);
    }
//
    //根据id查询用户
    @RequestMapping("/queryByidMenus.action")
    @CrossOrigin
    public Q_menusPojo queryByidMenus(Integer mid){
        return q_menusMapper.selectById(mid);
    }
//
    //修改商品
    @RequestMapping("/updateMenus.action")
    @CrossOrigin
    public int updateMenus(Q_menusPojo q_menusPojo){
        //组装查询条件对象
        QueryWrapper<Q_menusPojo> queryWrapper =new QueryWrapper<Q_menusPojo>();
        queryWrapper.eq("mid",q_menusPojo.getMid());
        return  q_menusMapper.update(q_menusPojo,queryWrapper);
    }
}
