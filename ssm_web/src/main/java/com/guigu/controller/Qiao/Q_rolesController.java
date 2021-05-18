package com.guigu.controller.Qiao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.mapper.Qiao.Q_rolesMapper;
import com.guigu.pojo.Qiao.Q_rolesPojo;
import com.guigu.service.Qiao.Q_rolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Q_rolesController {
    @Autowired
    Q_rolesService q_rolesService;

    @Autowired
    Q_rolesMapper q_rolesMapper;

    //查询所有数据
    @RequestMapping("/RolesAll.action")
    @CrossOrigin
    public IPage<Q_rolesPojo> showAll(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                      @RequestParam(value = "pagesize",defaultValue = "5")int pagesize
                                ){
        //组装查询条件对象
        QueryWrapper<Q_rolesPojo> queryWrapper =new QueryWrapper<Q_rolesPojo>();
        queryWrapper.orderByAsc("rid");  //根据id列进行排序
        IPage<Q_rolesPojo>  iPage= q_rolesService.page(new Page<Q_rolesPojo>(pageno,pagesize),queryWrapper);
        return iPage;
    }

    //模糊查询
    @RequestMapping("/showRolesMh.action")
    @CrossOrigin
    public IPage<Q_rolesPojo> showAll(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                      @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                      String name
    ){
        //组装查询条件对象
        QueryWrapper<Q_rolesPojo> queryWrapper =new QueryWrapper<Q_rolesPojo>();
        if(!StringUtils.isEmpty(name)){
            queryWrapper.like("name",name);  // where  name like '%val%'
        }
        queryWrapper.orderByAsc("rid");  //根据id列进行排序
        IPage<Q_rolesPojo>  iPage= q_rolesService.page(new Page<Q_rolesPojo>(pageno,pagesize),queryWrapper);
        return iPage;
    }

    //增加用户
    @RequestMapping("/addRolse.action")
    @CrossOrigin
    public int addRolse(Q_rolesPojo q_rolesPojo){
        //默认添加用户时状态为U-001：可用
        return q_rolesMapper.insert(q_rolesPojo);
    }
//
    //删除角色
    @RequestMapping("/deleteRoles.action")
    @CrossOrigin
    public int deleteRoles(Integer rid){
        return q_rolesMapper.deleteById(rid);
    }
//
    //根据id查询用户
    @RequestMapping("/queryByidRoles.action")
    @CrossOrigin
    public Q_rolesPojo queryByidRoles(Integer rid){
        return q_rolesMapper.selectById(rid);
    }
//
    //修改商品
    @RequestMapping("/updateRoles.action")
    @CrossOrigin
    public int updateRoles(Q_rolesPojo q_rolesPojo){
        //组装查询条件对象
        QueryWrapper<Q_rolesPojo> queryWrapper =new QueryWrapper<Q_rolesPojo>();
        queryWrapper.eq("rid",q_rolesPojo.getRid());
        return  q_rolesMapper.update(q_rolesPojo,queryWrapper);
    }
}
