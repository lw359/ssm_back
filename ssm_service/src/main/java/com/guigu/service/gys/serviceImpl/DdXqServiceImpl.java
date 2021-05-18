package com.guigu.service.gys.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.DingdanXqMapper;
import com.guigu.pojo.DdXq;
import com.guigu.pojo.DingDan;
import com.guigu.service.gys.DdXqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DdXqServiceImpl extends ServiceImpl<DingdanXqMapper, DdXq>
     implements DdXqService {
        @Autowired
        DingdanXqMapper dingdanXqMapper;
    @Override
    public int updateddXxZt(DdXq ddXq) {
        //组装查询条件对象
        QueryWrapper<DdXq> queryWrapper =new QueryWrapper<DdXq>();
        queryWrapper.eq("ddId",ddXq.getDdId());  // where  name like '%val%'
        int update = dingdanXqMapper.update(ddXq, queryWrapper);
//        int update = this.baseMapper.updateById(dingDan);
        return update;
    }

    @Override
    public int xiugaizt(DdXq ddXq) {
        int updatezt = dingdanXqMapper.updatezt(ddXq.getOid());
        return updatezt;
    }


}
