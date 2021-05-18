package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.Z_dingdanPojo;
import org.apache.ibatis.annotations.Select;

public interface Z_dingdanMapper extends BaseMapper<Z_dingdanPojo> {
    @Select("SELECT MAX(ddId) FROM dingdan")
    int queryById();
}
