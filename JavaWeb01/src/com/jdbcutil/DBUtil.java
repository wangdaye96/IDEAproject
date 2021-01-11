package com.jdbcutil;

import java.sql.*;

/**
 * @author wangdaye996
 * @createtime 2021/1/8 - 22:45
 */
public class DBUtil {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    //获取连接
    public void getConn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycrmdb?useUnicode=true&characterEncoding=UTF-8", "root", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //关闭资源
    public void CloseAll() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //查询公共方法
    public ResultSet executeQuery(String sql, Object[] obj) {
        getConn();
        try {
            pst=conn.prepareStatement(sql);
            for (int i = 0; i < obj.length; i++) {
                pst.setObject(i + 1, obj[i]);
            }
            rs = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    //增删改公共方法
    public int executeUpdate(String sql, Object[] obj) {
        int j = 0;
        try {
            getConn();
            pst=conn.prepareStatement(sql);
            for (int i = 0; i < obj.length; i++) {
                pst.setObject(i + 1, obj[i]);
            }
            j = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return j;
    }

}