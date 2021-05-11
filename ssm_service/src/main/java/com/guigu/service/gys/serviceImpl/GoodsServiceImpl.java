package com.guigu.service.gys.serviceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.GoodsMapper;
import com.guigu.pojo.Goods;
import com.guigu.service.gys.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods>
        implements GoodsService {

    @Autowired
    GoodsMapper goodsMapper;
    @Override
    public int DeleteById(int id) {
        int i = goodsMapper.deleteById(id);
        return i;
    }

    @Override
    public int Update(Goods goods) {
        //组装查询条件对象
        QueryWrapper<Goods> queryWrapper =new QueryWrapper<Goods>();
            queryWrapper.eq("spId",goods.getSpId());
        int update = goodsMapper.update(goods, queryWrapper);
        return update;
    }

    @Override
    public int add(Goods goods) {
        int insert = goodsMapper.insert(goods);
        return insert;
    }
}
