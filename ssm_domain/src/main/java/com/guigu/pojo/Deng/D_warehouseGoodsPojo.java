package com.guigu.pojo.Deng;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.guigu.pojo.Goods;
import lombok.Data;

import java.util.Date;

@Data
@TableName("warehouse")
public class D_warehouseGoodsPojo extends Goods {
    @TableId(value = "id",type = IdType.AUTO)
    private int id;
    @TableField("kcName")
    private String kcName;
    @TableField("maxKc")
    private int maxKc;
    @TableField("minKc")
    private int minKc;
    @TableField("amount")
    private int amount;
    @TableField("max_amount")
    private int maxamount;
    @TableField("register")
    private String register;
    @TableField("register_time")
    private Date registertime;
    @TableField("spId")
    private int spId;
}
