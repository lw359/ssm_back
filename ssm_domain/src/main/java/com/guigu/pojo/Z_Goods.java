package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("goods")
public class Z_Goods {
    @TableId(value = "spId",type = IdType.AUTO)
    private Integer spId;

    @TableField("spTypeId")
    private Integer spTypeId;

    @TableField("goodsName")
    private String goodsName;

    @TableField("price")
    private String price;
    @TableField("sl")
    private Integer sl;

    @TableField("purchasePrice")
    private String purchasePrice;
    @TableField("color")
    private String color;
    @TableField("size")
    private String size;

    @TableField("thTime")
    private Date thTime;

    @TableField("ysTime")
    private Date ysTime;

    @TableField("cpAdress")
    private String cpAdress;

    @TableField("gysId")
    private String gysId;

    @TableField("guiGe")
    private String guiGe;

    @TableField("spStat")
    private String spStat;

    @TableField("sHId")
    private Integer sHId;
    @TableField("img")
    private String img;

}