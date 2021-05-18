package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("shopping")
public class Shopping {
    @TableId(value = "gwId",type = IdType.AUTO)
    @TableField("gwId")
    private Integer gwId;

    @TableField("gwStat")
    private String gwStat;

    @TableField("spId")
    private int spId;

    @TableField("Totalprice")
    private String Totalprice;

    @TableField("Number")
    private String Number;

    @TableField("sHId")
    private String sHId;

    @TableField("JoinTIME")
    private String JoinTIME;

    @TableField("uid")
    private String uid;
}
