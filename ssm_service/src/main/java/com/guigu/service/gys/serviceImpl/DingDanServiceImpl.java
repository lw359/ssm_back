package com.guigu.service.gys.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.DingDanMapper;
import com.guigu.pojo.DingDan;
import com.guigu.service.gys.DingDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DingDanServiceImpl extends ServiceImpl<DingDanMapper, DingDan>
  implements DingDanService {
        @Autowired
        DingDanMapper dingDanMapper;
    @Override
    public List<DingDan> selectAll() {
        QueryWrapper<DingDan> queryWrapper =new QueryWrapper<DingDan>();
        queryWrapper.eq("ddZt","d-001");
        List<DingDan> dingDans = dingDanMapper.selectList(queryWrapper);
        return dingDans;
    }

    @Override
    public int updateddZt(DingDan dingDan) {
//组装查询条件对象
        QueryWrapper<DingDan> queryWrapper =new QueryWrapper<DingDan>();
            queryWrapper.eq("ddId",dingDan.getDdId());  // where  name like '%val%'
        int update = dingDanMapper.update(dingDan, queryWrapper);
//        int update = this.baseMapper.updateById(dingDan);
        return update;
    }
}
