package com.service;

import com.pojo.Goods;

import java.util.List;

/**
 * @author wangdaye996
 * @createtime 2021/1/9 - 0:08
 */
public interface GoodsService {
    //查询
    public List<Goods> Query();
    //新增
    public int insert(Goods goods);
    //修改
    public int UpdateByName(Goods goods);
    //删除
    public int DeleteByName(Goods goods);
}
