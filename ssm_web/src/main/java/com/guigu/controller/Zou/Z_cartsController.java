package com.guigu.controller.Zou;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guigu.mapper.*;
import com.guigu.pojo.*;
import com.guigu.service.Zou.Z_shoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class Z_cartsController {
    @Autowired
    Z_shoppingMapper z_shoppingMapper;

    @Autowired
    Z_shoppingService z_shoppingService;

    @Autowired
    UsersMapper usersMapper;

    @Autowired
    Z_dingdanMapper z_dingdanMapper;

    @RequestMapping("/selectAllCarts.action")
    @CrossOrigin
    public List<Z_shoppingCartDetails> selectAllCarts(String username){
        QueryWrapper<Users> user = new QueryWrapper<Users>();
        user.eq("username", username);
        List<Users> listUser = usersMapper.selectList(user);
        //查询购物车表展示信息
        //根据购物车的商品id连表查询商品信息，展示商品图片、商品名字、状态
        return z_shoppingMapper.queryByUid(listUser.get(0).getID());
    }

    //根据购物id删除购物车表
    @RequestMapping("/deleteCartsByid.action")
    @CrossOrigin
    public int deleteCartsByid (Integer id){
        return  z_shoppingMapper.deleteById(id);
    }

    //根据购物id，保存修改的数量
    @RequestMapping("/selectByIdShoppingUpdate.action")
    @CrossOrigin
    public int selectByIdShoppingUpdate(String gwId,String number){
        return z_shoppingMapper.updateByIdNumber(Integer.parseInt(number),Integer.parseInt(gwId));

    }

    //根据购物id，查询相对于的购物连表信息
    @RequestMapping("/selectByIdCartShopp.action")
    @CrossOrigin
    public List<Z_shoppingCartDetails> selectByIdCartShopp(Integer gwId){
        return z_shoppingMapper.queryByGwId(gwId);
    }

    int uid;

    @RequestMapping("/queryNameForId.action")
    @CrossOrigin
    public int queryNameForId(String name){
        Users query = usersMapper.query(name);
        //得到用户uid
        uid=query.getID();
        return query.getID();
    }

    int did=0;
    //获取收获地址id
    //获取商品id，数量，总价
    //拿到用户uid
    @RequestMapping("/addDingdan.action")
    @CrossOrigin
    public int addDingdan(Z_dingdanPojo z_dingdanPojo){
        z_dingdanPojo.setDdZt("d-001");
        z_dingdanPojo.setUid(uid);
        z_dingdanMapper.insert(z_dingdanPojo);

        return  z_dingdanMapper.queryById();
    }

    @Autowired
    GoodsMapper goodsMapper;
    @Autowired
    Z_AddressMapper z_addressMapper;
    @Autowired
    Z_orderrMapper z_orderrMapper;

    @RequestMapping("/addOrderr.action")
    @CrossOrigin
    public int addOrderr(String spId,String shId){
        did=z_dingdanMapper.queryById();
        Z_orderrPojo z_orderrPojo=new Z_orderrPojo();
        //添加订单id
        z_orderrPojo.setDdId(did+1);
        //添加创建订单时间
        Date time = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        z_orderrPojo.setDdTime(sdf.format(time));
        //添加订单状态为待支付
        z_orderrPojo.setDdType("W-001");
        //添加商户id
        Z_Goods goods = goodsMapper.queryShId(Integer.parseInt(spId));
        z_orderrPojo.setSHId(goods.getSHId());
        //添加商品id
        z_orderrPojo.setSpId(goods.getSpId());
        //添加收货人姓名
        Z_AddressPojo z_addressPojo = z_addressMapper.queryShouHuoId(Integer.parseInt(shId));
        z_orderrPojo.setShouhuoRen(z_addressPojo.getShUsername());
        //添加电话号码
        z_orderrPojo.setPhone(z_addressPojo.getShPhone());
        System.out.println(z_orderrPojo);
        z_orderrMapper.insert(z_orderrPojo);

        //删除购物车信息
        z_shoppingMapper.deleteById(Integer.parseInt(spId));
        return  z_orderrPojo.getDdId();
    }

    @RequestMapping("/queryDingDan.action")
    @CrossOrigin
    public Z_jiaoyiPojo queryDingDan(String id){
        System.out.println(id);
        System.out.println(z_orderrMapper.queryJiao(Integer.parseInt(id)));
        return z_orderrMapper.queryJiao(Integer.parseInt(id));
    }
}
