package com.guigu.service.Deng.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.mapper.Deng.D_merchantMapper;
import com.guigu.mapper.Deng.D_warehouseMapper;
import com.guigu.mapper.GoodsMapper;
import com.guigu.pojo.Deng.D_merchantPojo;
import com.guigu.pojo.Deng.D_warehousePojo;
import com.guigu.service.Deng.D_merchantService;
import com.guigu.service.Deng.D_warehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class D_warehouseServiceImpl extends
        ServiceImpl<D_warehouseMapper, D_warehousePojo>
        implements D_warehouseService {

}
