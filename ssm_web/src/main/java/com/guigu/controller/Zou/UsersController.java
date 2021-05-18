package com.guigu.controller.Zou;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guigu.mapper.UsersMapper;
import com.guigu.mapper.Z_AddressMapper;
import com.guigu.mapper.Z_shoppingMapper;
import com.guigu.pojo.Users;
import com.guigu.pojo.Z_AddressPojo;
import com.guigu.pojo.Z_shoppingPojo;
import com.guigu.service.Zou.UsersService;
import com.guigu.service.Zou.Z_AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class UsersController {
    @Autowired(required = false)
    UsersService usersService;
    @Autowired
    UsersMapper usersMapper;

    @Autowired
    Z_shoppingMapper z_shoppingMapper;

    @Autowired
    Z_AddressMapper z_addressMapper;

    @Autowired
    Z_AddressService z_addressService;

    //注册用户
    @RequestMapping(value = "/userAll.action", produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public int usersAdd(Users users) {
        int insert = usersMapper.insert(users);
        return insert;
    }

    String userName=null;
    //登录界面
    @RequestMapping("/longin.action")
    @CrossOrigin
    public String login(String username, String password,HttpServletRequest request) {
        Map<String, Object> columnMap = new HashMap<>();
        columnMap.put("username", username);
        columnMap.put("password", password);
        List<Users> users = usersMapper.selectByMap(columnMap);
        request.getSession(true).setAttribute("userName",username);
        request.setAttribute("userName",username);
        if (users.size() > 0) {
            userName=username;
            return username;
        } else return null;
    }

    //添加地址
    @RequestMapping("/addAddress.action")
    @CrossOrigin
    public int addAddress(Z_AddressPojo z_addressPojo,HttpServletRequest request){
        QueryWrapper<Users> user = new QueryWrapper<Users>();
        user.eq("username","admin");
        List<Users> listUser = usersMapper.selectList(user);

        z_addressPojo.setUid(listUser.get(0).getID());

        Date time = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        z_addressPojo.setCreatTime(sdf.format(time));

        return z_addressMapper.insert(z_addressPojo);
    }

    //添加商品到购物车表
    @RequestMapping("/addShoppingById.action")
    @CrossOrigin
    public int addShoppingById(Integer id,Integer sl,String price) {
        QueryWrapper<Users> user = new QueryWrapper<Users>();
        user.eq("username", userName);
        List<Users> listUser = usersMapper.selectList(user);

        //先判断商品是否在购物车
        QueryWrapper<Z_shoppingPojo> shopping = new QueryWrapper<Z_shoppingPojo>();
        shopping.eq("spId", id).eq("Uid", listUser.get(0).getID());
        List<Z_shoppingPojo> z_shopping = z_shoppingMapper.selectList(shopping);

        Z_shoppingPojo z_shoppingPojo = new Z_shoppingPojo();
        Date time = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        z_shoppingPojo.setGwStat(1);
        z_shoppingPojo.setSpId(id);
        z_shoppingPojo.setUid(listUser.get(0).getID());
        if (z_shopping.size() == 1) {
            Integer prices = Integer.parseInt(price) + Integer.parseInt(z_shopping.get(0).getTotalprice());
            z_shoppingPojo.setTotalprice(prices.toString());
            Integer sls = sl + Integer.parseInt(z_shopping.get(0).getNumber());
            z_shoppingPojo.setNumber(sls.toString());
            z_shoppingPojo.setJoinTIME(sdf.format(time));
            return z_shoppingMapper.update(z_shoppingPojo,shopping);
        } else {
        //插入数据到购物车表，并且给相对于的状态
        z_shoppingPojo.setNumber(sl.toString());
        z_shoppingPojo.setTotalprice(price);
        z_shoppingPojo.setJoinTIME(sdf.format(time));
        return z_shoppingMapper.insert(z_shoppingPojo);
        }
    }

    //修改用户信息
    @RequestMapping("/updateUser.action")
    @CrossOrigin
    public int updateUser(int ID) {
        int i = usersMapper.updateById(ID);
        return i;
    }
    //查询所有用户
    //根据id查询商品
    @RequestMapping("/queryByidUser.action")
    @CrossOrigin
    public List<Users>  queryByidUser(Integer id, HttpServletRequest request){
//        Users users = usersMapper.selectById(id);
        String userName1 = (String) request.getSession(true).getAttribute("userName");
        QueryWrapper<Users> usersQueryWrapper = new QueryWrapper<>();
        usersQueryWrapper.eq("username",userName1);
        List<Users> users = usersMapper.selectList(usersQueryWrapper);
        return users;
    }
}
