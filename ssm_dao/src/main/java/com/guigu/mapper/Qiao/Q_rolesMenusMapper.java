package com.guigu.mapper.Qiao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.Qiao.Q_menusPojo;
import com.guigu.pojo.Qiao.Q_rolesMenusPojo;

import java.util.List;

public interface Q_rolesMenusMapper extends BaseMapper<Q_rolesMenusPojo> {
    List<Q_rolesMenusPojo> PermissionAll(Q_rolesMenusPojo permission);

    List<Q_rolesMenusPojo> PermissionFYAll(Q_rolesMenusPojo permission);

    void deleterolepermission(Q_rolesMenusPojo permission);

    List<Q_rolesMenusPojo> qxjsAll(Q_rolesMenusPojo permission);

    int qxdelete(Integer mid);
}
