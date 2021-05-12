package com.guigu.controller.Deng;


import com.guigu.mapper.Deng.D_gongyingshangMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class D_supplierController {
    @Autowired
    D_gongyingshangMapper d_gongyingshangMapper;
}
