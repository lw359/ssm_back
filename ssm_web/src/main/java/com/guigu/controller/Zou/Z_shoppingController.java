package com.guigu.controller.Zou;

import com.guigu.mapper.Z_shoppingMapper;
import com.guigu.service.Zou.Z_shoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Z_shoppingController {
    @Autowired
    Z_shoppingMapper z_shoppingMapper;

    @Autowired
    Z_shoppingService z_shoppingService;

}
