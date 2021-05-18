package com.guigu.service.Qiao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.mapper.Qiao.Q_rolesMenusMapper;
import com.guigu.pojo.Qiao.Q_rolesMenusPojo;
import com.guigu.service.Qiao.Q_rolesMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Q_rolesMenusServiceImpl
        extends ServiceImpl<Q_rolesMenusMapper, Q_rolesMenusPojo>
        implements Q_rolesMenusService {

    @Autowired
    private Q_rolesMenusMapper q_rolesMenusMapper;

    Integer id = 0;
    @Override
    public List<Q_rolesMenusPojo> queryPermission(Integer uid) {
        id = uid;
        Q_rolesMenusPojo permission = new Q_rolesMenusPojo();
        permission.setUid(uid);
        permission.setParentid("0");
        List<Q_rolesMenusPojo> permissionList = q_rolesMenusMapper.PermissionAll(permission);
        for (Q_rolesMenusPojo p:permissionList) {
            permission = new Q_rolesMenusPojo();
            permission.setUid(uid);
            permission.setMid(p.getMid());
            permission.setParentid("1");
            List<Q_rolesMenusPojo> list = q_rolesMenusMapper.PermissionAll(permission);
            p.setPermissions(list);

            List<Q_rolesMenusPojo> permissions = p.getPermissions();
            for (Q_rolesMenusPojo per:permissions) {
                permission = new Q_rolesMenusPojo();
                permission.setUid(uid);
                permission.setMid(per.getMid());
                permission.setParentid("2");
                List<Q_rolesMenusPojo> list1 = q_rolesMenusMapper.PermissionAll(permission);
                per.setPermissionss(list1);
            }
        }
        return permissionList;
    }


    @Override
    public PageInfo<Q_rolesMenusPojo> PermissionFYAll(String parentid, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        Q_rolesMenusPojo permission = new Q_rolesMenusPojo();
        permission.setUid(id);
        permission.setParentid(parentid);
        permission.setMid(0);
        List<Q_rolesMenusPojo> permissionList = q_rolesMenusMapper.PermissionFYAll(permission);
        for (Q_rolesMenusPojo p:permissionList) {
            permission = new Q_rolesMenusPojo();
            permission.setMid(p.getMid());
            permission.setUid(id);
            if(p.getParentid().equals("1")){
                permission.setParentid("2");
            }else {
                permission.setParentid("1");
            }
            List<Q_rolesMenusPojo> list = q_rolesMenusMapper.PermissionFYAll(permission);
            p.setPermissions(list);

            List<Q_rolesMenusPojo> permissions = p.getPermissions();
            for (Q_rolesMenusPojo per:permissions) {
                permission = new Q_rolesMenusPojo();
                permission.setMid(per.getMid());
                permission.setUid(id);
                permission.setParentid("2");
                List<Q_rolesMenusPojo> list1 = q_rolesMenusMapper.PermissionFYAll(permission);
                per.setPermissionss(list1);
            }
        }
        PageInfo<Q_rolesMenusPojo> pageInfo = new PageInfo<Q_rolesMenusPojo>(permissionList);
        return pageInfo;
    }



}
