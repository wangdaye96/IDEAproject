package com.dao;

import com.pojo.Goods;

import java.util.List;

/**
 * @author wangdaye996
 * @createtime 2021/1/8 - 23:37
 */
public interface GoodsDao {
    //查询
    public List<Goods> Query();
    //通过id查
    public Goods QueryById(int id);
    //新增
    public int insert(Goods goods);
    //修改
    public int UpdateByName(Goods goods);
    //删除
    public int DeleteByName(Goods goods);
}
