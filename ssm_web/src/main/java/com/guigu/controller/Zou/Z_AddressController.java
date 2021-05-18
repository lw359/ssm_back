package com.guigu.controller.Zou;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guigu.mapper.Z_AddressMapper;
import com.guigu.pojo.Z_AddressPojo;
import com.guigu.service.Zou.Z_AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class Z_AddressController {
    @Autowired
    Z_AddressMapper z_addressMapper;

    @Autowired
    Z_AddressService z_addressService;

    //查询所有的地址
    @RequestMapping("/queryAllAddress.action")
    @CrossOrigin
    public List<Z_AddressPojo> queryAllAddress( ){
        return  z_addressMapper.selectList(null);
    }

    //根据id删除地址
    @RequestMapping("/deleteAddress.action")
    @CrossOrigin
    public int deleteAddress(Integer id){
        return z_addressMapper.deleteById(id);
    }

    //根据id查询地址信息
    @RequestMapping("/updateQueryById.action")
    @CrossOrigin
    public Z_AddressPojo updateQueryById(Integer id){
        return z_addressMapper.selectById(id);
    }

    //修改地址信息
    @RequestMapping("/updateAddressB.action")
    @CrossOrigin
    public int updateAddressB(Z_AddressPojo z_addressPojo){
        QueryWrapper<Z_AddressPojo> queryWrapper=new QueryWrapper<Z_AddressPojo>();

        return z_addressMapper.update(z_addressPojo,queryWrapper);
    }
}
