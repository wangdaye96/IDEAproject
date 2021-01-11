package com.jdbcutil;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author wangdaye996
 * @createtime 2021/1/8 - 23:00
 */
public class Test1 {
    public static void main(String[] args) {
        DBUtil dbUtil = new DBUtil();
        dbUtil.getConn();
        String sql = "select * from customer";
        String sql1 = "insert into customer (custid,custname) values (?,?)";
        Object[] obj = {};
        Object[] obj1 = {25, "狂四郎"};
        int i = dbUtil.executeUpdate(sql1, obj1);
        try {
            ResultSet rs = dbUtil.executeQuery(sql, obj);
            while (rs.next()) {
                System.out.println(rs.getInt("custid") + rs.getString("custname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtil.CloseAll();
        }
    }

}
