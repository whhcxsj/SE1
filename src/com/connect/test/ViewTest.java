package com.connect.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cn.login.login;
import com.cn.user.User;

public class ViewTest {
//	���Ե�½��ͼ
	@Test
	public void indexlogin() throws Exception {
		login.indexlogin();
		User user1 = login.indexlogin();
		System.out.println(user1);
		
	}
	
//	���Թ���Ա�˵���ͼ
	@Test
	public void managerloginTest() throws Exception {
		int item = login.managerlogin();
		System.out.println(item);
	}
//	�����û���Ϣ��ͼ
	@Test
	public void addMenuView() throws Exception {
		User user = login.addMenuView();
		System.out.println(user);
		
	}
}
