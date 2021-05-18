package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.ShoppingGoods;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ShoppingGoodsMapper extends BaseMapper<ShoppingGoods> {
    @Select(" \n" +
            "SELECT g.*,sp.number AS number, sp.gwId AS gwId FROM goods g INNER JOIN shopping sp ON g.spId=sp.spId WHERE sp.`uid`=#{uid} AND g.spStat=S-001")
    @Results(id="CommodityMap", value={
            @Result(column="spId", property="spId", id=true),
            @Result(column="spTypeId", property="spTypeId"),
            @Result(column="goodsName", property="goodsName"),
            @Result(column="price", property="price"),
            @Result(column="sl", property="sl"),
            @Result(column="img", property="img"),
            @Result(column="purchasePrice", property="purchasePrice"),
            @Result(column="color", property="color"),
            @Result(column="size", property="size"),
            @Result(column="thTime", property="thTime"),
            @Result(column="ysTime", property="ysTime"),
            @Result(column="cpAdress", property="cpAdress"),
            @Result(column="gysId", property="gysId"),
            @Result(column="guiGe", property="guiGe"),
            @Result(column="spStat", property="spStat"),
            @Result(column="sHId", property="sHId"),
            @Result(column="stock", property="stock"),
            @Result(column="img", property="img"),
            @Result(column="gwId", property="gwId"),
    })
    public List<ShoppingGoods> queryShoppingGoodsByUId(@Param("uid") Integer uid);
}

