package com.guigu.service.gys.serviceImpl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.GoodsMapper;
import com.guigu.pojo.Goods;
import com.guigu.service.gys.GoodsService;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods>
        implements GoodsService {

}
