package com.connect.jdbc;
import java.beans.PropertyChangeEvent;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Statement;

import java.sql.Connection;

public class JDBCUtils {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	public static Object close;
//	静态语句块
	static {
//		JDBCUtils获得对象
//		getClassLoader()类加载器
//		getResourceAsStream("db.properties")加载资源文件放到输入流中
		InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("db.properties");
//		创建Properties类型的对象
		Properties p = new Properties();
//		加载流文件
		try {
			p.load(is);
			driver = p.getProperty("driver");
			url = p.getProperty("url");
			username = p.getProperty("username");
			password = p.getProperty("password");
//			加载MySQL驱动
			Class.forName(driver);
			System.out.println("驱动加载成功！");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
		
//	获得连接对象的方法
		public static Connection getConnection() {
			try {
				System.out.println("数据库连接成功！");
				return DriverManager.getConnection(url,username,password);
				
			}catch(SQLException e) {
				System.out.println("数据库连接失败！");
				e.printStackTrace();
			}
			return null;
		 }	
//		释放资源的方法
	    public static void close(Connection conn, Statement statement, ResultSet result) {
	        try {
	            if (result != null) {
	            	result.close();
	            	result = null;
	            }
	            if (statement != null) {
	            	statement.close();
	            	statement = null;
	            }
	            if (conn != null) {
	            	conn.close();
	            	conn = null;
	            }
	        } catch (SQLException e) {
	            // TODO 自动生成的 catch 块
	            e.printStackTrace();
	        }
	    }
	}
			
	



