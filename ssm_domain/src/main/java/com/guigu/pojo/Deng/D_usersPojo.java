package com.guigu.pojo.Deng;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("users")
public class D_usersPojo {
    @TableId(value = "ID",type = IdType.AUTO)
    private int ID;
    @TableField("username")
    private String username;
    @TableField("password")
    private String password;
    @TableField("iPhone")
    private String iPhone;
    @TableField("email")
    private String email;
    @TableField("status")
    private String status;
    @TableField("photo")
    private String photo;
}
