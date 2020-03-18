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
//	²âÊÔµÇÂ½
	@Test
	public void loginTest() throws Exception {
		Userdata_Imp userdata_Imp = new Userdata_Imp();
		User user = new User("ÕÃÄÀÍ¤","13234");
		int type = userdata_Imp.login(user);
		System.out.println(type);
	}

//	²âÊÔÌí¼ÓÓÃ»§
	@Test
	public void insertTest() throws Exception {
		Userdata_Imp userdata_Imp = new Userdata_Imp();
		User user = new User("ÑîÃ÷ÁÁ","12345");
		boolean flag = userdata_Imp.insert(user);
		System.out.println(flag);
		
	}
//	²âÊÔÉ¾³ıÓÃ»§
	@Test
	public void deleteTest() throws Exception {
		Userdata_Imp userdata_Imp = new Userdata_Imp();
		User user = new User("ÑîÃ÷ÁÁ","12345");
		boolean flag = userdata_Imp.delete(user.getUname());
		System.out.println(flag);
		
	}
//	²âÊÔĞŞ¸ÄÓÃ»§
	@Test
	public void updateTest() throws Exception {
		Userdata_Imp userdata_Imp = new Userdata_Imp();
		User user = new User("Àî¹ğÖ¥","43221");
		boolean flag = userdata_Imp.update(user.getUname());
		System.out.println(flag);
	}
//		²âÊÔ²éÑ¯ÓÃ»§
		@Test
		public void selectTest() throws Exception {
			Userdata_Imp userdata_Imp = new Userdata_Imp();
			User user = new User("Àî¹ğÖ¥","43221");
			boolean flag = userdata_Imp.update(user.getUname());
			System.out.println(user);
	}
}

