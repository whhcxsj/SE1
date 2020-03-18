package com.connect.test;

import static org.junit.Assert.*;

import org.junit.Test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import org.junit.Test;
import com.cn.data.Userdata_Imp;
import com.cn.login.login;
import com.cn.user.User;
import com.connect.jdbc.JDBCUtils;

public class JDBCUtilsTest {
	@Test
	public void jdbcConnectionTest() throws Exception{
		Connection conn = JDBCUtils.getConnection();
		Statement statement = conn.createStatement();
//		ResultSet result = statement.executeQuery("select * from info");
//		while(result.next()) {
//			 System.out.print(result.getInt("id"));
//		}
	}
//	���Ե�½
	@Test
	public void loginTest() throws Exception {
		Userdata_Imp userdata_Imp = new Userdata_Imp();
		User user = new User("����ͤ","13234");
		int type = userdata_Imp.login(user);
		System.out.println(type);
	}

//	��������û�
	@Test
	public void insertTest() throws Exception {
		Userdata_Imp userdata_Imp = new Userdata_Imp();
		User user = new User("������","12345");
		boolean flag = userdata_Imp.insert(user);
		System.out.println(flag);
		
	}
//	����ɾ���û�
	@Test
	public void deleteTest() throws Exception {
		Userdata_Imp userdata_Imp = new Userdata_Imp();
		User user = new User("������","12345");
		boolean flag = userdata_Imp.delete(user.getUname());
		System.out.println(flag);
		
	}
//	�����޸��û�
	@Test
	public void updateTest() throws Exception {
		Userdata_Imp userdata_Imp = new Userdata_Imp();
		User user = new User("���֥","43221");
		boolean flag = userdata_Imp.update(user.getUname());
		System.out.println(flag);
	}
//		���Բ�ѯ�û�
		@Test
		public void selectTest() throws Exception {
			Userdata_Imp userdata_Imp = new Userdata_Imp();
			User user = new User("���֥","43221");
			boolean flag = userdata_Imp.update(user.getUname());
			System.out.println(user);
	}
}

