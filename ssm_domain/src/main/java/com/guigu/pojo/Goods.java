package com.guigu.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("goods")
public class Goods {
    @TableId(value = "spId",type = IdType.AUTO)   //后续生成sql  根据id，删除，编辑，查询等操作
    private int spId;
    /**
     * 类型名字
     */
    @TableField("spTypeId")  //普通属性
    private int spTypeId;
    @TableField("goodsName")
    private String goodsName;
    @TableField("price")
    private float price;
    @TableField("sl")
    private int sl;
    @TableField("img")
    private String img;
    @TableField("purchasePrice")
    private int purchasePrice;
    @TableField("color")
    private String color;
    @TableField("size")
    private String size;
    @TableField("thTime")
    private Date thTime;
    @TableField("ysTime")
    private  Date ysTime;
    @TableField("cpAdress")
    private String cpAdress;
    @TableField("gysId")
    private int gysId;
    @TableField("guiGe")
    private String guiGe;
    @TableField("spStat")
    private String spStat;
    @TableField("sHId")
    private int sHId;
    private int stock;


}
