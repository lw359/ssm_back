package com.guigu.service.Zou.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.Z_AddressMapper;
import com.guigu.pojo.Z_AddressPojo;
import com.guigu.service.Zou.Z_AddressService;
import org.springframework.stereotype.Service;

@Service
public class Z_AddressServiceImpl extends ServiceImpl<Z_AddressMapper, Z_AddressPojo>
        implements Z_AddressService {
}
