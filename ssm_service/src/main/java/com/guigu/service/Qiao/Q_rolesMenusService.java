package com.guigu.service.Qiao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.guigu.pojo.Qiao.Q_menusPojo;
import com.guigu.pojo.Qiao.Q_rolesMenusPojo;

import java.util.List;

public interface Q_rolesMenusService extends IService<Q_rolesMenusPojo> {
    List<Q_rolesMenusPojo> queryPermission(Integer uid);

    PageInfo<Q_rolesMenusPojo> PermissionFYAll(String parentid, Integer pageNo, Integer pageSize);


    //授权
//    List<Q_rolesMenusPojo> qxlist();

//    List<Q_rolesMenusPojo> qxjsAll(Integer rid);

}
