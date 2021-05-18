package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.Z_jiaoyiPojo;
import com.guigu.pojo.Z_orderrPojo;
import org.apache.ibatis.annotations.Select;

public interface Z_orderrMapper extends BaseMapper<Z_orderrPojo> {
        @Select("SELECT g.goodsName AS goodsName,d.`ddId` AS ddId,d.`zj` AS zj,d.`sl` AS sl,o.`phone` AS phone ,o.`ddType` AS ddType FROM  orderr o\n" +
                "INNER JOIN dingdan d ON d.`ddId`=o.`ddId`\n" +
                "INNER JOIN goods g ON o.`spId`=g.spId" +
                " WHERE o.`ddId`=#{id}")
        Z_jiaoyiPojo queryJiao(Integer id);
}
