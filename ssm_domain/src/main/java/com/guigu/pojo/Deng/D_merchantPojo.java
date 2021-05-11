package com.guigu.pojo.Deng;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("merchant")
public class D_merchantPojo {
    @TableId(value = "sHId",type = IdType.AUTO)
    private int sHId;
    @TableField("phone")
    private String phone;
    @TableField("shangHuName")
    private String shangHuName;
    @TableField("menDianAdrss")
    private String menDianAdrss;
    @TableField("shStat")
    private String shStat;
    @TableField("yl")
    private int yl;
    @TableField("ddId")
    private int ddId;

}
