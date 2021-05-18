package com.guigu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guigu.pojo.Z_AddressPojo;
import org.apache.ibatis.annotations.Select;

public interface Z_AddressMapper extends BaseMapper<Z_AddressPojo> {
    int update(Z_AddressPojo z_addressPojo);

    @Select("SELECT * FROM shippingAddress WHERE sh_id=#{id}")
    Z_AddressPojo queryShouHuoId(Integer id);
}
