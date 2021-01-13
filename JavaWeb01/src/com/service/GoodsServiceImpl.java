package com.service;

import com.dao.GoodsDao;
import com.dao.GoodsDaoImpl;
import com.pojo.Goods;

import java.util.List;

/**
 * @author wangdaye996
 * @createtime 2021/1/9 - 0:08
 */
public class GoodsServiceImpl implements GoodsService{
    private GoodsDao goodsDao=new GoodsDaoImpl();
    @Override
    public List<Goods> Query() {
        return goodsDao.Query();
    }

    @Override
    public Goods QueryById(int id) {
        return goodsDao.QueryById(id);
    }

    @Override
    public int insert(Goods goods) {
        return goodsDao.insert(goods);
    }

    @Override
    public int UpdateByName(Goods goods) {
        return goodsDao.UpdateByName(goods);
    }

    @Override
    public int DeleteByName(Goods goods) {
        return goodsDao.DeleteByName(goods);
    }
}
