package com.guigu.pojo.Qiao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@Data
@TableName("menus")
public class Q_rolesMenusPojo {
    // 自增长
    @TableId(value = "mid",type = IdType.AUTO)
    private Integer mid;

    //有无子级(0,1)
    private String parentid;

    //父级id
    private Integer seq;

    // 权限名称
    private String name;

    // 路径
    private String url;

    //描述
    private String descn;

    @TableField(exist =false)
    List<Q_rolesMenusPojo> permissions;

    @TableField(exist =false)
    List<Q_rolesMenusPojo> permissionss;

    @TableField(exist = false)
    private  boolean checked;

    //员工id
    @TableField(exist = false)
    private Integer uid;

    //角色id
    @TableField(exist = false)
    private Integer rid;

    //权限状态
    private String start;


    //授权字段
    @TableField(exist =false)
    private Integer id;

    @TableField(exist =false)
    private String  label;

    @TableField(exist =false)
    List<Q_rolesMenusPojo> children;

}
