package com.cn.login;

import java.util.Scanner;

import com.cn.user.User;

public class login {
	private static Scanner input = new Scanner(System.in);
	//登陆页面
	public static User indexlogin() {
		System.out.println("**************************************************");
		System.out.println("        \t\t疫情查询系统\t\t			");
		System.out.println("	\t\t请选择操作\t\t			        ");
		System.out.println("	    \t\t账号：\t\t				");
		String uname = input.nextLine();
		System.out.println("	 \t\t密码：\t\t               ");
		System.out.println("***************************************************");
		String upass = input.nextLine();
		return new User(uname,upass);
	}
//	管理员菜单试图
	public static int managerlogin() {
		System.out.println("**************************************************");
		System.out.println("        \t\t管理员操作界面\t\t			");
		System.out.println("	    \t\t请选择操作\t\t			        ");
		System.out.println("	    \t\t1.添加信息\t\t				");
		System.out.println("	    \t\t2.删除信息\t\t				");
		System.out.println("	    \t\t3.查看信息\t\t				");
		System.out.println("	    \t\t4.统计图\t\t				");
		System.out.println("	    \t\t5.退出\t\t				");
		System.out.println("***************************************************");
//		获取用户信息	
		String type = input.nextLine();
//		将获取到的数据转换为int型
		int item = Integer.parseInt(type);
//		判断用户输入是否在0~4之间，如果超出范围，提示用户“输入错误，请重新输入”，并留在视图页面
		if(item<0||item>4)
		{
			System.out.println("输入错误，请重新输入");
			return managerlogin();
		}
//		如果输入正确，将用户输入的选项返回
		return item;
	}
//	添加用户信息视图
//	@return 新的User对象User(uname,upass)
	public static User addMenuView() {
		System.out.println("	    \t\t账号：\t\t				");
		String uname = input.nextLine();
		System.out.println("	 \t\t密码：\t\t               ");
		System.out.println("***************************************************");
		String upass = input.nextLine();
		return new User(uname,upass);
	}
//	输出信息的方法
	public static void printUser(User user) {
		System.out.println("用户id："+user.getId());
		System.out.println("用户名："+user.getUname());
		System.out.println("用户密码："+user.getUpass());
		if(user.getType()==1) {
		System.out.println("用户权限：管理员");
	}else {
		System.out.println("用户权限：普通用户");
	}
 }
	public static String deleteMenuView() {
		// TODO Auto-generated method stub
		return null;
	}
	public static String selectMenuView() {
		// TODO Auto-generated method stub
		return null;
	}
}
