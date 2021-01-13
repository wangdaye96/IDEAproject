package com.dao;

import com.jdbcutil.DBUtil;
import com.pojo.Goods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wangdaye996
 * @createtime 2021/1/8 - 23:42
 */
public class GoodsDaoImpl implements GoodsDao {
    DBUtil dbUtil = new DBUtil();

    @Override
    public List<Goods> Query() {
        List<Goods> list = new ArrayList<>();
        String sql = "select * from goods";
        Object[] obj = {};
        try {
            ResultSet rs = dbUtil.executeQuery(sql, obj);
            while (rs.next()) {
                Goods goods = new Goods();
                goods.setId(rs.getInt("id"));
                goods.setName(rs.getString("name"));
                goods.setPrice(rs.getDouble("price"));
                list.add(goods);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtil.CloseAll();
        }
        return list;
    }

    @Override
    public Goods QueryById(int id) {
        String sql = "select * from goods where id=?";
        Object[] obj = {id};
        Goods goods = new Goods();
        try {
            ResultSet rs = dbUtil.executeQuery(sql, obj);
            while (rs.next()) {
                goods.setId(rs.getInt("id"));
                goods.setName(rs.getString("name"));
                goods.setPrice(rs.getDouble("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtil.CloseAll();
        }
        return goods;
    }

    @Override
    public int insert(Goods goods) {
        int j = 0;
        String sql = "insert into goods (name,price) values (?,?)";
        Object[] obj = {goods.getName(), goods.getPrice()};
        j = dbUtil.executeUpdate(sql, obj);
        dbUtil.CloseAll();
        return j;
    }

    @Override
    public int UpdateByName(Goods goods) {
        int j = 0;
        String sql = "update goods set price=? where name=?";
        Object[] obj = {goods.getPrice(), goods.getName()};
        j = dbUtil.executeUpdate(sql, obj);
        dbUtil.CloseAll();
        return j;
    }

    @Override
    public int DeleteByName(Goods goods) {
        int j = 0;
        String sql = "delete from goods where name=?";
        Object[] obj = {goods.getName()};
        j = dbUtil.executeUpdate(sql, obj);
        dbUtil.CloseAll();
        return j;
    }
}
