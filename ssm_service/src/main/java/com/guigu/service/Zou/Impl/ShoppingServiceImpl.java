package com.guigu.service.Zou.Impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.ShoppingMapper;
import com.guigu.pojo.Goodssp;
import com.guigu.service.Zou.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingServiceImpl extends ServiceImpl<ShoppingMapper, Goodssp>
        implements ShoppingService {

    @Autowired
    ShoppingMapper shoppingMapper;


    @Override
    public List<Goodssp> gowuche() {
        return shoppingMapper.gowuche();
    }

    @Override
    public int deleteGoodsspByid(Integer spId) {
        return shoppingMapper.deleteGoodsspByid(spId);
    }
}
