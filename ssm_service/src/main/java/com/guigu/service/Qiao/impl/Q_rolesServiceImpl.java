package com.guigu.service.Qiao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.Qiao.Q_rolesMapper;
import com.guigu.pojo.Qiao.Q_rolesPojo;
import com.guigu.service.Qiao.Q_rolesService;
import org.springframework.stereotype.Service;

@Service
public class Q_rolesServiceImpl
        extends ServiceImpl<Q_rolesMapper, Q_rolesPojo>
        implements Q_rolesService {
}
