package com.guigu.controller.Qiao;

import com.github.pagehelper.PageInfo;
import com.guigu.pojo.Qiao.Q_rolesMenusPojo;
import com.guigu.service.Qiao.Q_rolesMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("qx")
public class Q_rolesMenusController {
    @Autowired

    Q_rolesMenusService q_rolesMenusService;

    @RequestMapping("qxAll.action")
    @ResponseBody
    public List<Q_rolesMenusPojo> qxAll(Integer uid){
        List<Q_rolesMenusPojo> permissions = q_rolesMenusService.queryPermission(uid);
        return permissions;
    }

    @RequestMapping("cdAll.action")
    @ResponseBody
    public PageInfo<Q_rolesMenusPojo> cdAll(String parentid, Integer pageNo,
                                            Integer pageSize){
        PageInfo<Q_rolesMenusPojo> pageInfo = q_rolesMenusService.PermissionFYAll(parentid,pageNo, pageSize);
        return pageInfo;
    }
}
