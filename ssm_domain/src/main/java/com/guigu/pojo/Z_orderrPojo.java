package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("orderr")
public class Z_orderrPojo {
    @TableId(value = "oid",type = IdType.AUTO)
    private int oid;
    @TableField("ddId")
    private  int ddId;
    @TableField("ddTime")
    private  String ddTime;
    @TableField("shTime")
    private  String shTime;
    @TableField("sHId")
    private  int sHId;
    @TableField("spId")
    private  int spId;
    @TableField("ddType")
    private  String ddType;
    @TableField("shouhuoRen")
    private  String shouhuoRen;
    @TableField("phone")
    private String  phone;
}
