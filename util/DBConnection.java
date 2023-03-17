package com.express.util;

import java.sql.*;

//�����������ݿ⣬���Ի�ȡ���ݿ����Ӷ���
public class DBConnection {
	//���ݿ����Ӳ��� 
	private static String user="root";
	private static String password="5713";
	private static String url="jdbc:mysql://localhost:3306/express?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	//����������
//	static{
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	//��ȡ���ݿ����Ӷ��󷽷�
	public static Connection getConnection(){
		Connection conn=null;
		try {
			//��ȡ���ݿ����Ӷ���
			conn=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	//�رշ���
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
