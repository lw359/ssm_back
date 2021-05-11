package com.guigu.pojo.Deng;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("yuangong")
public class D_yuangongPojo {
    @TableId(value = "uid",type = IdType.AUTO)
   private int  uid ;
    @TableField("emp_no")
   private String  empNo;
    @TableField("emp_name")
   private String  empName ;
    @TableField("emp_sex")
   private String  empSex;
    @TableField("dep_id")
   private String  depId ;
    @TableField("emp_birth")
   private Data  empBirth;
    @TableField("emp_worktime")
   private Data  empWorktime ;
    @TableField("emp_work")
   private String  empWork;
    @TableField("department")
   private String  department ;
    @TableField("portrait")
   private String  portrait;
    @TableField("password")
   private String  password;
    @TableField("pwdyan")
   private String  pwdyan;
    @TableField("Usertype")
   private String  Usertype;

}
