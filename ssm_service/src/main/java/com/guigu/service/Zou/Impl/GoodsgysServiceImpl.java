package com.guigu.service.Zou.Impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.GoodsgysMapper;
import com.guigu.pojo.Goodsgys;
import com.guigu.service.Zou.GoodsgysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsgysServiceImpl extends ServiceImpl<GoodsgysMapper, Goodsgys>
        implements GoodsgysService {

    @Autowired
    GoodsgysMapper goodsgysMapper;

//    @Override
//    public List<goodsgys> logngoods() {
//        return goodsMapper.logngoods();
//    }

    @Override
    public Goodsgys selectById(int id) {
        return goodsgysMapper.dangegoods(id);
    }


}
