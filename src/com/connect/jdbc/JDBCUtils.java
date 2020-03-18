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
//	��̬����
	static {
//		JDBCUtils��ö���
//		getClassLoader()�������
//		getResourceAsStream("db.properties")������Դ�ļ��ŵ���������
		InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("db.properties");
//		����Properties���͵Ķ���
		Properties p = new Properties();
//		�������ļ�
		try {
			p.load(is);
			driver = p.getProperty("driver");
			url = p.getProperty("url");
			username = p.getProperty("username");
			password = p.getProperty("password");
//			����MySQL����
			Class.forName(driver);
			System.out.println("�������سɹ���");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
		
//	������Ӷ���ķ���
		public static Connection getConnection() {
			try {
				System.out.println("���ݿ����ӳɹ���");
				return DriverManager.getConnection(url,username,password);
				
			}catch(SQLException e) {
				System.out.println("���ݿ�����ʧ�ܣ�");
				e.printStackTrace();
			}
			return null;
		 }	
//		�ͷ���Դ�ķ���
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
	            // TODO �Զ����ɵ� catch ��
	            e.printStackTrace();
	        }
	    }
	}
			
	



