package com.guigu.controller.Deng;

import com.guigu.mapper.Deng.D_yuangongMapper;
import com.guigu.pojo.Deng.D_yuangongPojo;
import com.guigu.service.Deng.D_permissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class D_permissionsController {
    @Autowired
    D_yuangongMapper d_yuangongMapper;

    @Autowired
    D_permissionsService d_permissionsService;

    //登录界面
    @RequestMapping("/longin.action")
    @CrossOrigin(origins="*")
    public int login(String username,String password){
        Map<String,Object> columnMap = new HashMap<>();
        columnMap.put("emp_no", username);
        columnMap.put("password", password);

        List<D_yuangongPojo> d_yuangongPojos = d_yuangongMapper.selectByMap(columnMap);
        System.out.println(d_yuangongPojos);
       if (d_yuangongPojos.size()>0){
           return 1;
       }else return 0;

    }


}
