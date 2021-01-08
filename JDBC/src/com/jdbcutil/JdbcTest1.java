package com.jdbcutil;

import java.sql.*;

/**
 * @author wangdaye996
 * @createtime 2021/1/8 - 21:05
 * JDBC步骤:
 *    1、加载驱动
 *    2、获得链接
 *    3、执行SQL
 *    4、处理结果
 *    5、关闭资源
 */
public class JdbcTest1 {
    public static void main(String[] args) {
        Connection conn=null;
        Statement st=null;
        ResultSet resultSet=null;
        PreparedStatement pst=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mycrmdb?useUnicode=true&characterEncoding=UTF-8", "root", "123456");
//            st = conn.createStatement();

            //预处理 增
//            pst = conn.prepareStatement("insert into customer (custid,custname) values (?,?)");
//            pst.setObject(1,30);
//            pst.setObject(2,"起飞");
//            int j = pst.executeUpdate();
//            System.out.println(j);

            //预处理 查询
            pst=conn.prepareStatement("select * from customer where custname like ?");
            pst.setObject(1,"%卫%");
            resultSet = pst.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("custid")+resultSet.getString("custname"));
            }
            //增删改
//            String sql1="insert into customer (custid,custname) values (29,'库奇')";
//            String sql1="update customer set custname='大傻子' where custid=24";
//            String sql1="delete from customer where custid in (25,26,27,28)";
//            int i = st.executeUpdate(sql1);

            //查询
//            String sql="select * from customer";
//            resultSet = st.executeQuery(sql);
//            while (resultSet.next()){
//                System.out.println(resultSet.getInt("custid")+resultSet.getString("custname"));
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (resultSet!=null){
                    resultSet.close();
                }
                if (st!=null){
                    st.close();
                }
                if (conn!=null){
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
