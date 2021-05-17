package com.guigu.pojo.Qiao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("roles")
public class Q_rolesPojo {
    @TableId(value = "ID",type = IdType.AUTO)
    private int id;
    @TableField("NAME")
    private String name;
    @TableField("CODE")
    private String code;
    @TableField("DESCN")
    private String descn;
}
