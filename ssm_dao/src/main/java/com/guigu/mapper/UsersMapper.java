package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.Users;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UsersMapper extends BaseMapper<Users> {
    @Select("select * from users where username=#{username} and password=#{password}")
    int login(String username,String password);

    int updateById(int id);

    @Select("SELECT * FROM users WHERE username = #{name}")
    Users query(String name);
}

