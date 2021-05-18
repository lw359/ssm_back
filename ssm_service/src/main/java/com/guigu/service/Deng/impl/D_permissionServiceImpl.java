package com.guigu.service.Deng.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.Deng.D_yuangongMapper;
import com.guigu.pojo.Deng.D_yuangongPojo;
import com.guigu.service.Deng.D_permissionsService;
import org.springframework.stereotype.Service;

@Service
public class D_permissionServiceImpl
        extends ServiceImpl<D_yuangongMapper, D_yuangongPojo>
        implements D_permissionsService {
}
