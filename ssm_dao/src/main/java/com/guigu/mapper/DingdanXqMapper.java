package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.DdXq;
import org.apache.ibatis.annotations.Update;

public interface DingdanXqMapper extends BaseMapper<DdXq> {

//    @Update("update orderr set ddType = 'W-0011' where oid = #{oid}")
    int updatezt(int oid);
}
