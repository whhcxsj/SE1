package com.cn.controller;

import com.cn.user.User;
import com.cn.data.Userdata_Imp;
import com.cn.login.login;

public class Control {
	public static void main(String[] args) {
		while(true) {
//		给用户展示登陆页面
		User user = login.indexlogin();
		Userdata_Imp Userdata_Imp = new Userdata_Imp();
		int type = Userdata_Imp.login(user);
		switch (type) {
		case -1:
			System.out.println("输入有误，请重新输入！");
			break;
		case 1:
//			System.out.println("恭喜管理员登陆成功");
			managerServer();
			break;
		case 2:
			System.out.println("恭喜用户登陆成功");
			userServer();
			break;
		default:
			break;
		}
	  }
	}


	private static void managerServer() {
		// TODO Auto-generated method stub
		Userdata_Imp userdata_Imp = new Userdata_Imp();
		while(true) {
//		展示管理员菜单视图
		int item = login.managerlogin();
		boolean flag = false;
		switch (item) {
		case 1://添加信息
			User user = login.addMenuView();
			flag = userdata_Imp.insert(user);
			System.out.println(flag?"add sucess":"add fail");
			break;
		case 2://删除信息
			String uname = login.deleteMenuView();
			flag = userdata_Imp.delete(uname);
			System.out.println(flag?"delete sucess":"delete fail");
			break;
		case 3://查看信息
			String uname1 = login.selectMenuView();
			User selectUser = userdata_Imp.select(uname1);
			login.printUser(selectUser);
			System.out.println(flag?"select sucess":"select fail");
			break;
		case 4://统计图
	
			break;
		case 5://退出
			System.exit(-1);
			break;

		default:
			break;
		}	
		}
	}
	private static void  userServer(){
		// TODO Auto-generated method stub
		
	}
	
}
