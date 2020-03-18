package com.cn.data;

import com.cn.user.User;

public interface Userdata {
	/**验证登陆的方法
	 * @author 汪慧和user uname账户 upass密码
	 *int类型 -1 登陆失败  1 管理员登陆 2用户登陆
	 */
	 
	int login(User user);
	 /**用来查询信息的方法
		 * @author 汪慧和 user要删除的对象 包含账户和密码
		 *如果查询成功返回user,查询失败返回null
		 */
	   User select(String uname);
	
	    /**用来添加信息的方法
		 * @author 汪慧和 user要删除的对象 包含账户和密码
		 *如果添加成功返回true,添加失败返回false
		 */

		boolean insert(User user);
		/**用来删除信息的方法
		 * @author 汪慧和 要删除的对象，包含账户和密码
		 *如果添加成功返回true,删除失败返回false
		 */
		boolean delete(String uname);
		/**用来修改信息的方法
		 * @author 汪慧和 要删除的对象，包含账户和密码
		 *如果修改成功返回true,修改失败返回false
		 */
		boolean update(String uname);
		
	
}
