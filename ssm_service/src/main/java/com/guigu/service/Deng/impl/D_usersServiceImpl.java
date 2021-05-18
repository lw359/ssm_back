package com.guigu.service.Deng.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.Deng.D_usersMapper;
import com.guigu.pojo.Deng.D_usersPojo;
import com.guigu.service.Deng.D_usersService;
import org.springframework.stereotype.Service;

@Service
public class D_usersServiceImpl
        extends ServiceImpl<D_usersMapper, D_usersPojo>
        implements D_usersService {
}
