package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("dingdan")
public class DingDan {
    @TableId(value = "ddId",type = IdType.AUTO)
    private int ddId;
    private int sl;
    private int zj;
    private int uid;
    @TableField("ddZt")
    private String ddZt;
}
