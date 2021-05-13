package com.guigu.service.Deng.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.Deng.D_merchantMapper;
import com.guigu.pojo.Deng.D_merchantPojo;
import com.guigu.service.Deng.D_merchantService;
import org.springframework.stereotype.Service;

@Service
public class D_merchantServiceImpl extends
        ServiceImpl<D_merchantMapper, D_merchantPojo>
        implements D_merchantService {
}
