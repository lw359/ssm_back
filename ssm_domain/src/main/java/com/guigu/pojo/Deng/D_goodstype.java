package com.guigu.pojo.Deng;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("goodstype")
public class D_goodstype {
    @TableId(value = "spTypeId",type = IdType.AUTO)
    private int spTypeId;

    @TableField("spId")
    private int spId;

    @TableField("kind_id")
    private String kindid;

    @TableField("Kind_Name")
    private String kindName;

    @TableField("Kind_jibie")
    private String kindjibie;

}
