package com.cn.data;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cn.user.User;
import com.connect.jdbc.JDBCUtils;

public class Userdata_Imp implements Userdata {

	private static final String SQL_USER_LOGIN = "SELECT type from user WHERE uname=? AND upass=?";
	private static final String SQL_USER_INSET = "INSERT INTO 'user' VALUES(id,?,?,2)";
	private static final String SQL_USER_DELETE = "DELETE from 'user' WHERE uname=?";
	private static final String SQL_USER_UPDATA = "UPDATE from 'user' SET upass=? WHERE uname=?";
	private static final String SQL_USER_SELECT = "SELECT * FROM user WHERE uname=?";

	@Override
	public int login(User user) {
		// TODO Auto-generated method stub
//		�������ݿ⣬�������Ӷ���
		Connection conn = JDBCUtils.getConnection();
//		PreparedStatement prepareStatement = null;
//		ResultSet result = null;
		try {
//		����ִ�л���statement
//		ִ��sql���Query,�õ������
		PreparedStatement prepareStatement = conn.prepareStatement(SQL_USER_LOGIN);
		//����sql����еĲ���
		prepareStatement.setString(1, user.getUname());
		prepareStatement.setString(2, user.getUpass());
		//ִ�����
		ResultSet result = prepareStatement.executeQuery();
		while(result.next()) {
//			�ý������ѯ��ǰ�û�Ȩ��
			int type = result.getInt("type");
			return type;
		}
	}catch(SQLException e) {
		e.printStackTrace();
//	}finally {
//		 JDBCUtils.close(conn,prepareStatement,result);
	}
	   return -1;
	}

	@Override
	public User select(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String uname) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(String uname) {
		// TODO Auto-generated method stub
		return false;
	}

/*	@Override
	public User select(String uname) {
		// TODO Auto-generated method stub
//		�������ݿ⣬�������Ӷ���conn
		Connection conn = JDBCUtils.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			prepareStatement = conn.prepareStatement(SQL_USER_SELECT);
			//����sql����еĲ���
			preparedStatement.setString(1, uname);
		    ResultSet result = prepareStatement.executeQuery();
		    while(result.next()) {
		    	int id = result.getInt("id");
		    	uname = result.getString("uname");
		    	String upass = result.getString("upass");
		    	int type = result.getInt("type");
		  
//			if(line>0) {
//				return true;
//			}
		    return new User(id,uname,upass,type);
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(conn,prepareStatement,null);
		}
		return false;

	}

	@Override
	public boolean insert(User user) {
		// TODO Auto-generated method stub
//		�������ݿ⣬�������Ӷ���conn
		Connection conn = JDBCUtils.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			prepareStatement = conn.prepareStatement(SQL_USER_INSET);
			//����sql����еĲ���
			preparedStatement.setString(1, user.getUname());
			preparedStatement.setString(2, user.getUname());
			int line = prepareStatement.executeUpdate();
//			if(line>0) {
//				return true;
//			}
			return line>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(conn,prepareStatement,null);
		}
		return false;
	
	}

	@Override
	public boolean delete(String uname) {
		// TODO Auto-generated method stub
//		�������ݿ⣬�������Ӷ���conn
		Connection conn = JDBCUtils.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			prepareStatement = conn.prepareStatement(SQL_USER_DELETE);
			//����sql����еĲ���
			preparedStatement.setString(1, uname);
			int line = prepareStatement.executeUpdate();
//			if(line>0) {
//				return true;
//			}
			return line>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(conn,prepareStatement,null);
		}
		return false;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
//		�������ݿ⣬�������Ӷ���conn
		Connection conn = JDBCUtils.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			prepareStatement = conn.prepareStatement(SQL_USER_UPDATA);
			//����sql����еĲ���
			preparedStatement.setString(1, user.getUpass());
			preparedStatement.setString(2, user.getUname());
			int line = prepareStatement.executeUpdate();
//			if(line>0) {
//				return true;
//			}
			return line>0?true:false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(conn,prepareStatement,null);
		}
		return false;
	}

	@Override
	public boolean update(String uname) {
		// TODO Auto-generated method stub
		return false;
	}*/

}
