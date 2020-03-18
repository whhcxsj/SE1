package com.connect.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import org.junit.Test;

import com.cn.data.Userdata_Imp;
import com.cn.user.User;

import java.sql.Connection;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		加载MySQL驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("驱动加载成功！");
//			连接数据库，获得连接对象
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "123456");
			System.out.println("数据库连接成功！");
//			创建执行环境
			 Statement statement = conn.createStatement();
//			 执行sql语句，得到结果集
			 ResultSet result = statement.executeQuery("select *from info");
			 while(result.next()) {
				 System.out.print(result.getInt("id")+" ");
				 System.out.print(result.getString("uname")+" ");
				 System.out.println(result.getString("upass"));
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("驱动加载失败");
			System.out.println("数据库连接失败");
		}
	}

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}



