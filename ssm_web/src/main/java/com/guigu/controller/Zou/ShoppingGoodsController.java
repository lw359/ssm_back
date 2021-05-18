package com.guigu.controller.Zou;

import com.guigu.service.Zou.ShoppingGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ShoppingGoodsController {
    @Autowired(required = false)
    ShoppingGoodsService shoppingGoodsService;
//
//    @RequestMapping("/shoppingGoods")
//    @ResponseBody
//    public List<ShoppingGoods>shoppingGoods(Integer uid){
//        return shoppingGoodsService.queryShoppingGoodsByUId(uid);
//    }




}
