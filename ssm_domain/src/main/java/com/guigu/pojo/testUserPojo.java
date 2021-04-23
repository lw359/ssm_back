package com.guigu.pojo;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName(value = "testUser")
public class testUserPojo {
            private int id;
            private String userName;
            private int age;
}
