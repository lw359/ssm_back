package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("users")
public class Users {
    @TableId(value = "ID",type = IdType.AUTO)
    private Integer ID;

    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    @TableField("status")
    private String status;

    @TableField("iphone")
    private String iphone;

    @TableField("email")
    private String email;

    @TableField("sex")
    private String sex;


  }