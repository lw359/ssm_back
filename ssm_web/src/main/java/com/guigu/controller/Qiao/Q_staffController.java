package com.guigu.controller.Qiao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.mapper.Qiao.Q_staffMapper;
import com.guigu.pojo.Qiao.Q_staffPojo;
import com.guigu.service.Qiao.Q_staffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@CrossOrigin
public class Q_staffController {
    @Autowired
    Q_staffService q_staffsService;

    @Autowired
    Q_staffMapper q_staffMapper;

    //查询所有数据
    @RequestMapping("/showStaff.action")
    @CrossOrigin
    public IPage<Q_staffPojo> showAll(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                      @RequestParam(value = "pagesize",defaultValue = "5")int pagesize
                                ){
        //组装查询条件对象
        QueryWrapper<Q_staffPojo> queryWrapper =new QueryWrapper<Q_staffPojo>();
        queryWrapper.orderByAsc("uid");  //根据id列进行排序
        IPage<Q_staffPojo>  iPage= q_staffsService.page(new Page<Q_staffPojo>(pageno,pagesize),queryWrapper);
        return iPage;
    }
    //模糊查询
    @RequestMapping("/showStaffMh.action")
    @CrossOrigin
    public IPage<Q_staffPojo> showAll(@RequestParam(value = "pageno",defaultValue = "1") int pageno,
                                      @RequestParam(value = "pagesize",defaultValue = "5")int pagesize,
                                      String name
    ){
        //组装查询条件对象
        QueryWrapper<Q_staffPojo> queryWrapper =new QueryWrapper<Q_staffPojo>();
        if(!StringUtils.isEmpty(name)){
            queryWrapper.like("emp_name",name);
        }
        queryWrapper.orderByAsc("uid");  //根据id列进行排序
        IPage<Q_staffPojo>  iPage= q_staffsService.page(new Page<Q_staffPojo>(pageno,pagesize),queryWrapper);
        return iPage;
    }

    //增加员工
    @RequestMapping("/addStaff.action")
    @CrossOrigin
    public int addRolse(Q_staffPojo q_rolesPojo){
        //默认添加用户时状态为U-001：可用

        q_rolesPojo.setEmpworktime(new Date());
        return q_staffMapper.insert(q_rolesPojo);
    }

    //删除角色
    @RequestMapping("/deleteStaff.action")
    @CrossOrigin
    public int deleteRoles(Integer uid){
        return q_staffMapper.deleteById(uid);
    }
    //
    //根据id查询用户
    @RequestMapping("/queryByidStaff.action")
    @CrossOrigin
    public Q_staffPojo queryByidStaff(Integer uid){
        return q_staffMapper.selectById(uid);
    }

    //修改商品
    @RequestMapping("/updateStaff.action")
    @CrossOrigin
    public int updateRoles(Q_staffPojo q_staffPojo){
        //组装查询条件对象
        QueryWrapper<Q_staffPojo> queryWrapper =new QueryWrapper<Q_staffPojo>();
        queryWrapper.eq("uid",q_staffPojo.getUid());
        return  q_staffMapper.update(q_staffPojo,queryWrapper);
    }
}
