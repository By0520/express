package com.express.dao;
/*作者：Go for it
开发时间：2023/3/15 20:22*/

import com.express.po.User;
import com.express.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private static Connection con = null;
    private static PreparedStatement pst = null;
    private static ResultSet res = null;
    //登录方法
    public User login(User user){
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;

        //创建user对象，用来存储数据库查询结果的
        User u=new User();
        try {
            //1.sql语句
            String sql="select * from user where loginname=? and password=?";
            //2.预编译sql语句
            //2-1:获取数据库连接对象
            conn= DBConnection.getConnection();
            //2-2：预编译对象
            ps=conn.prepareStatement(sql);
            //3.给？赋值
            ps.setString(1, user.getLoginname());
            ps.setString(2, user.getPassword());
            //4.执行并且得到查询的结果集
            rs=ps.executeQuery();

            while(rs.next()){

                u.setUid(rs.getInt(1));
                u.setLoginname(rs.getString(2));
                u.setPassword(rs.getString(3));
                u.setIdentity(rs.getString(4));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            DBConnection.closeAll(conn, ps, rs);
        }
        return u;
    }
}
