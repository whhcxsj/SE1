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
//		����MySQL����
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("�������سɹ���");
//			�������ݿ⣬������Ӷ���
			Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "123456");
			System.out.println("���ݿ����ӳɹ���");
//			����ִ�л���
			 Statement statement = conn.createStatement();
//			 ִ��sql��䣬�õ������
			 ResultSet result = statement.executeQuery("select *from info");
			 while(result.next()) {
				 System.out.print(result.getInt("id")+" ");
				 System.out.print(result.getString("uname")+" ");
				 System.out.println(result.getString("upass"));
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("��������ʧ��");
			System.out.println("���ݿ�����ʧ��");
		}
	}

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}



