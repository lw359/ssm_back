package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("shippingAddress")
public class Z_AddressPojo {
    @TableId(value = "sh_id",type = IdType.AUTO)
    private int shId;
    @TableField("sh_username")
    private String shUsername;
    @TableField("sh_phone")
    private String shPhone ;
    @TableField("arealdPath")
    private String arealdPath;
    @TableField("userAddress")
    private String userAddress;
    @TableField("isDefault")
    private String isDefault;
    @TableField("dateFlag")
    private String dateFlag;
    @TableField("creatTime")
    private String creatTime;
    @TableField("uid")
    private int uid;

}
