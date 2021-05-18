package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.Z_Goods;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsMapper extends BaseMapper<Z_Goods> {
    //查询数据包括根据name模糊查询
    List<Z_Goods> showAll(String name);

    @Select("SELECT *  FROM goods WHERE spId=(\n" +
            "SELECT spId  FROM shopping WHERE gwId=#{id});")
    Z_Goods queryShId(Integer id);
}
