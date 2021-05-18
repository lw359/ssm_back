package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("gongyingshang")
public class Gongyingshang {
    @TableId(value = "gysId",type = IdType.AUTO)
    @TableField("gysId")
    private Integer gysId;

    @TableField("phone")
    private String phone;

    @TableField("gysname")
    private String gysname;
}
