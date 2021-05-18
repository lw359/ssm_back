package com.guigu.controller.Zou;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guigu.mapper.UsersMapper;
import com.guigu.mapper.Z_shoppingMapper;
import com.guigu.pojo.Users;
import com.guigu.pojo.Z_allOrderrPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class Z_dingdanAllController {
    @Autowired
    Z_shoppingMapper z_shoppingMapper;
    @Autowired
    UsersMapper usersMapper;


    @RequestMapping("/queryAllDing.action")
    public Z_allOrderrPojo queryAllDing(String name){
        QueryWrapper<Users> user = new QueryWrapper<Users>();
        user.eq("username", name);
        List<Users> listUser = usersMapper.selectList(user);
        return  z_shoppingMapper.chaxunSuo(listUser.get(0).getID());
    }
}
