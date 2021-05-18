package com.guigu.pojo.Qiao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("roles")
public class Q_rolesPojo {
    @TableId(value = "rid",type = IdType.AUTO)
    private int rid;
    @TableField("name")
    private String name;
    @TableField("code")
    private String code;
    @TableField("descn")
    private String descn;
}
