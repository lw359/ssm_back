package com.guigu.mapper.Deng;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.Deng.D_yuangongPojo;
import org.apache.ibatis.annotations.Select;

public interface D_yuangongMapper extends BaseMapper<D_yuangongPojo> {
    @Select("select * from yuangong " +
            "where emp_no=#{name} and password=#{password}")
    int login(String name,String password);
}
