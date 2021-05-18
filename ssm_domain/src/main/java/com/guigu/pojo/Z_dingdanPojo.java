package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("dingdan")
public class Z_dingdanPojo {
    @TableId(value = "ddId",type = IdType.AUTO)
    private int ddId;
    @TableField("sl")
    private int sl;
    @TableField("zj")
    private String zj;
    @TableField("uid")
    private int uid;
    @TableField("ddZt")
    private String ddZt;
    @TableField("sh_id")
    private int shId;
}
