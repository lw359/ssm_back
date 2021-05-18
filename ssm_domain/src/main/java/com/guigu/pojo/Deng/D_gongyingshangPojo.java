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
    @TableField("sup_id")
    private String supId;
    @TableField("gysname")
    private String gysName;
    @TableField("phone")
    private String phone;
    @TableField("sup_name")
    private String supName;
    @TableField("sup_phone")
    private String supPhone;
    @TableField("sup_address")
    private String supAddress;
    @TableField("audit_state")
    private String auditState;
    @TableField("tar_state")
    private String tarState;
}
