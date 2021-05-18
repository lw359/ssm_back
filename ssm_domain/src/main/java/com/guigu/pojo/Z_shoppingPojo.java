package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("shopping")
public class Z_shoppingPojo {
    @TableId(value = "gwId",type = IdType.AUTO)
    private int gwId;
    @TableField("gwStat")
    private int gwStat;
    @TableField("spId")
    private int spId;
    @TableField("Totalprice")
    private String Totalprice;
    @TableField("Number")
    private String Number;
    @TableField("sHId")
    private int sHId;
    @TableField("JoinTIME")
    private String JoinTIME;
    @TableField("Uid")
    private int Uid;

}
