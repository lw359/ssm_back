package com.guigu.controller.Deng;

import com.guigu.mapper.Deng.D_merchantMapper;
import com.guigu.pojo.Deng.D_merchantPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class D_merchantController {
    @Autowired
    D_merchantMapper d_merchantMapper;

    @RequestMapping("/showAllSh")
    @CrossOrigin
    public List<D_merchantPojo> showAllSh(){
        return d_merchantMapper.selectList(null);
    }
}
