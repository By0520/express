package com.express.util;

import java.sql.*;

//用来连接数据库，可以获取数据库连接对象
public class DBConnection {
	//数据库连接参数 
	private static String user="root";
	private static String password="5713";
	private static String url="jdbc:mysql://localhost:3306/express?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	//加载驱动类
//	static{
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	//获取数据库连接对象方法
	public static Connection getConnection(){
		Connection conn=null;
		try {
			//获取数据库连接对象
			conn=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	//关闭方法
	public static void closeAll(Connection conn,PreparedStatement ps,ResultSet rs){
			try {
				if(conn!=null){
					conn.close();
				}
				if(ps!=null){
					ps.close();
				}
				if(rs!=null){
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
