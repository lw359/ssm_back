package com.guigu.service.Zou.Impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.guigu.mapper.ShoppingGoodsMapper;
import com.guigu.pojo.ShoppingGoods;
import com.guigu.service.Zou.ShoppingGoodsService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingGoodsServiceImpl
        extends ServiceImpl<ShoppingGoodsMapper, ShoppingGoods>
        implements ShoppingGoodsService {
}
