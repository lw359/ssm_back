package com.guigu.service.gys;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.DdXq;
import com.guigu.pojo.DingDan;

public interface DdXqService extends IService<DdXq> {
    int updateddXxZt(DdXq ddXq);

    int xiugaizt(DdXq ddXq);
}
