package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.Z_allOrderrPojo;
import com.guigu.pojo.Z_shoppingCartDetails;
import com.guigu.pojo.Z_shoppingPojo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface Z_shoppingMapper extends BaseMapper<Z_shoppingPojo> {
    @Select("SELECT s.gwId,g.`img`,g.`goodsName`,g.`spStat`,g.`price`,s.`Number`,s.`Totalprice` \n" +
            "FROM shopping s \n" +
            "INNER JOIN goods g \n" +
            "ON s.spId=g.spId\n" +
            "WHERE s.Uid=#{id}")
    List<Z_shoppingCartDetails> queryByUid(Integer id);

    @Select("SELECT s.gwId,g.`img`,g.`goodsName`,g.`spStat`,g.`price`,s.`Number`,s.`Totalprice` \n" +
            "FROM shopping s \n" +
            "INNER JOIN goods g \n" +
            "ON s.spId=g.spId\n" +
            "WHERE s.gwId=#{id}")
    List<Z_shoppingCartDetails> queryByGwId(Integer id);

    @Update("UPDATE shopping SET Number= #{num} WHERE gwId= #{gwId}")
    int updateByIdNumber(@Param("num") int num,@Param("gwId") int gwId);

    //查询所有订单信息
    @Select("SELECT * FROM dingdan  d INNER JOIN orderr o\n" +
            "ON d.`ddId`=o.`ddId`\n" +
            "WHERE uid=#{id}")
    Z_allOrderrPojo chaxunSuo(Integer id);
}
