package com.guigu.service.Zou.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.Z_shoppingMapper;
import com.guigu.pojo.Z_shoppingPojo;
import com.guigu.service.Zou.Z_shoppingService;
import org.springframework.stereotype.Service;

@Service
public class Z_shoppingServiceImpl
        extends ServiceImpl<Z_shoppingMapper, Z_shoppingPojo>
        implements Z_shoppingService {
}
