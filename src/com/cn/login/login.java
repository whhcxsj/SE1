package com.cn.login;

import java.util.Scanner;

import com.cn.user.User;

public class login {
	private static Scanner input = new Scanner(System.in);
	//��½ҳ��
	public static User indexlogin() {
		System.out.println("**************************************************");
		System.out.println("        \t\t�����ѯϵͳ\t\t			");
		System.out.println("	\t\t��ѡ�����\t\t			        ");
		System.out.println("	    \t\t�˺ţ�\t\t				");
		String uname = input.nextLine();
		System.out.println("	 \t\t���룺\t\t               ");
		System.out.println("***************************************************");
		String upass = input.nextLine();
		return new User(uname,upass);
	}
//	����Ա�˵���ͼ
	public static int managerlogin() {
		System.out.println("**************************************************");
		System.out.println("        \t\t����Ա��������\t\t			");
		System.out.println("	    \t\t��ѡ�����\t\t			        ");
		System.out.println("	    \t\t1.�����Ϣ\t\t				");
		System.out.println("	    \t\t2.ɾ����Ϣ\t\t				");
		System.out.println("	    \t\t3.�鿴��Ϣ\t\t				");
		System.out.println("	    \t\t4.ͳ��ͼ\t\t				");
		System.out.println("	    \t\t5.�˳�\t\t				");
		System.out.println("***************************************************");
//		��ȡ�û���Ϣ	
		String type = input.nextLine();
//		����ȡ��������ת��Ϊint��
		int item = Integer.parseInt(type);
//		�ж��û������Ƿ���0~4֮�䣬���������Χ����ʾ�û�������������������롱����������ͼҳ��
		if(item<0||item>4)
		{
			System.out.println("�����������������");
			return managerlogin();
		}
//		���������ȷ�����û������ѡ���
		return item;
	}
//	����û���Ϣ��ͼ
//	@return �µ�User����User(uname,upass)
	public static User addMenuView() {
		System.out.println("	    \t\t�˺ţ�\t\t				");
		String uname = input.nextLine();
		System.out.println("	 \t\t���룺\t\t               ");
		System.out.println("***************************************************");
		String upass = input.nextLine();
		return new User(uname,upass);
	}
//	�����Ϣ�ķ���
	public static void printUser(User user) {
		System.out.println("�û�id��"+user.getId());
		System.out.println("�û�����"+user.getUname());
		System.out.println("�û����룺"+user.getUpass());
		if(user.getType()==1) {
		System.out.println("�û�Ȩ�ޣ�����Ա");
	}else {
		System.out.println("�û�Ȩ�ޣ���ͨ�û�");
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
