package com.cn.controller;

import com.cn.user.User;
import com.cn.data.Userdata_Imp;
import com.cn.login.login;

public class Control {
	public static void main(String[] args) {
		while(true) {
//		���û�չʾ��½ҳ��
		User user = login.indexlogin();
		Userdata_Imp Userdata_Imp = new Userdata_Imp();
		int type = Userdata_Imp.login(user);
		switch (type) {
		case -1:
			System.out.println("�����������������룡");
			break;
		case 1:
//			System.out.println("��ϲ����Ա��½�ɹ�");
			managerServer();
			break;
		case 2:
			System.out.println("��ϲ�û���½�ɹ�");
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
//		չʾ����Ա�˵���ͼ
		int item = login.managerlogin();
		boolean flag = false;
		switch (item) {
		case 1://�����Ϣ
			User user = login.addMenuView();
			flag = userdata_Imp.insert(user);
			System.out.println(flag?"add sucess":"add fail");
			break;
		case 2://ɾ����Ϣ
			String uname = login.deleteMenuView();
			flag = userdata_Imp.delete(uname);
			System.out.println(flag?"delete sucess":"delete fail");
			break;
		case 3://�鿴��Ϣ
			String uname1 = login.selectMenuView();
			User selectUser = userdata_Imp.select(uname1);
			login.printUser(selectUser);
			System.out.println(flag?"select sucess":"select fail");
			break;
		case 4://ͳ��ͼ
	
			break;
		case 5://�˳�
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
