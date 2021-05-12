package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
@TableName("orderr")
public class DdXq {
    @TableId(value = "oid",type = IdType.AUTO)
    private int oid;
    @TableField("ddId")
    private int ddId;
    @TableField("ddTime")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date ddTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField("shTime")
    private Date shTime;
    @TableField("sHId")
    private int sHId;
    @TableField("spId")
    private int spId;
    @TableField("ddType")
    private String ddType;
    @TableField("shouhuoRen")
    private  String shouhuoRen;
    private  String phone;
}
