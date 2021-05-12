package com.guigu.service.Deng.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.Deng.D_gongyingshangMapper;
import com.guigu.pojo.Deng.D_gongyingshangPojo;
import com.guigu.service.Deng.D_supplierService;
import org.springframework.stereotype.Service;

@Service
public class D_supllierServiceImpl extends
        ServiceImpl<D_gongyingshangMapper, D_gongyingshangPojo>
        implements D_supplierService
{
}
