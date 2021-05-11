package com.guigu.pojo.Deng;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("gongyingshang")
public class D_gongyingshangPojo {
    @TableId(value = "gysId",type = IdType.AUTO)
    private int gysId;
    @TableField("gysName")
    private String gysName;
    @TableField("phone")
    private String phone;
}
