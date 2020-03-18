package com.connect.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cn.login.login;
import com.cn.user.User;

public class ViewTest {
//	测试登陆试图
	@Test
	public void indexlogin() throws Exception {
		login.indexlogin();
		User user1 = login.indexlogin();
		System.out.println(user1);
		
	}
	
//	测试管理员菜单试图
	@Test
	public void managerloginTest() throws Exception {
		int item = login.managerlogin();
		System.out.println(item);
	}
//	测试用户信息视图
	@Test
	public void addMenuView() throws Exception {
		User user = login.addMenuView();
		System.out.println(user);
		
	}
}
