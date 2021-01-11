package com.test;

import com.dao.GoodsDao;
import com.dao.GoodsDaoImpl;
import com.pojo.Goods;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangdaye996
 * @createtime 2021/1/8 - 23:45
 */
public class TestDao {

    public static void main(String[] args) {
        GoodsDao goodsDao = new GoodsDaoImpl();

        //新增
//        int a = goodsDao.insert(new Goods("牛奶", 2.5));
//        System.out.println(a);

        //修改
//        int b=goodsDao.UpdateByName(new Goods("牛奶",3));
//        System.out.println(b);

        //删除
       // int c=goodsDao.DeleteByName(new Goods("牛奶"));


        //查询
        List<Goods> list = new ArrayList<>();
        list = goodsDao.Query();
        for (Goods goods : list) {
            System.out.println(goods);
        }
    }
}
