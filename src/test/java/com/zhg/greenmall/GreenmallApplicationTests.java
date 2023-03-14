package com.zhg.greenmall;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhg.greenmall.controller.StoreController;
import com.zhg.greenmall.entity.Goods;
import com.zhg.greenmall.entity.Store;
import com.zhg.greenmall.entity.User;
import com.zhg.greenmall.mapper.StoreMapper;
import com.zhg.greenmall.mapper.UserMapper;
import com.zhg.greenmall.service.GoodsService;
import com.zhg.greenmall.service.OrderService;
import com.zhg.greenmall.service.StoreService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.security.cert.CertStoreSpi;
import java.util.ArrayList;

@SpringBootTest
class GreenmallApplicationTests {
    @Resource
    StoreService storeService;
    @Resource
    GoodsService goodsService;
    @Resource
    UserMapper userMapper;
    @Resource
    OrderService orderService;

    @Test
    void test01(){

        /**
         * pagehelp
         */
        PageHelper.startPage(1, 4);
        ArrayList<User> pageGoods =  userMapper.findAllUser();
        System.out.println(pageGoods);
        PageInfo page = new PageInfo(pageGoods);
        System.out.println("pageinfo"+page.getEndRow());
    }
    @Test
    void test02(){
        System.out.println(orderService.findTodaysOrder(123));
    }



}
