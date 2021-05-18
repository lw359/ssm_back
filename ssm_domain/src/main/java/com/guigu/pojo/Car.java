package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("car")
public class Car {
    @TableId(value = "id",type = IdType.AUTO)
    private int id;
    private  int identfication;
    @TableField("car_type")
      private String cartype;
    @TableField("car_no")
      private String carno;
    @TableField("car_color")
      private String carcolor;
    @TableField("car_value")
      private int carvalue;
    @TableField("car_state")
    private String carstate;
    @TableField("car_picture")
    private  String carpicture;
    @TableField("car_brand")
    private  String carbrand;
}
