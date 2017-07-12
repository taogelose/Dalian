package com.neusoft.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1522:orcl123";
	private static String username = "scott";
	private static String password = "tiger";
	
	
	//���Ӷ���Ļ�ȡ
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	
	
	//���ݿ����Ĺر�
	public static void close(ResultSet rs , Statement ps , Connection conn){
		if(rs !=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ps !=null){
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn !=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
}
