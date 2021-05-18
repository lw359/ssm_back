package com.guigu.service.Zou.Impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.UsersMapper;
import com.guigu.pojo.Users;
import com.guigu.service.Zou.UsersService;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
        implements UsersService {
   }
