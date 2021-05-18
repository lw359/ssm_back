package com.guigu.pojo.Qiao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("menus")
public class Q_menusPojo {
    @TableId(value = "mid",type = IdType.AUTO)
    private int mid;
    @TableField("parentid")
    private String parentid;
    @TableField("seq")
    private int seq;
    @TableField("name")
    private String name;
    @TableField("url")
    private String url;
    @TableField("descn")
    private String descn;
}
