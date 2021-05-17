package com.guigu.pojo.Qiao;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@TableName("yuangong")
public class Q_staffPojo {
    @TableId(value = "uid",type = IdType.AUTO)
    private int uid;
    @TableField("emp_no")
    private String empno;
    @TableField("emp_name")
    private String empname;
    @TableField("emp_sex")
    private String empsex;
    @TableField("dep_id")
    private int depid;
    @TableField("emp_birth")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date empbirth;
    @TableField("emp_worktime")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date empworktime;
    @TableField("emp_work")
    private String empwork;
    @TableField("department")
    private String department;
    @TableField("portrait")
    private String portrait;
    @TableField("password")
    private String password;
    @TableField("pwdyan")
    private String pwdyan;
    @TableField("Usertype")
    private Char Usertype;
    @TableField("start")
    private int start;
    @TableField("phone")
    private String phone;
    @TableField("email")
    private String email;
}
