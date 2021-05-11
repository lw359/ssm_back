package com.guigu.service.gys;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.DingDan;

import java.util.List;

public interface DingDanService extends IService<DingDan> {
        List<DingDan>  selectAll();
        int updateddZt(DingDan dingDan);
}
