package com.cn.data;

import com.cn.user.User;

public interface Userdata {
	/**��֤��½�ķ���
	 * @author ���ۺ�user uname�˻� upass����
	 *int���� -1 ��½ʧ��  1 ����Ա��½ 2�û���½
	 */
	 
	int login(User user);
	 /**������ѯ��Ϣ�ķ���
		 * @author ���ۺ� userҪɾ���Ķ��� �����˻�������
		 *�����ѯ�ɹ�����user,��ѯʧ�ܷ���null
		 */
	   User select(String uname);
	
	    /**���������Ϣ�ķ���
		 * @author ���ۺ� userҪɾ���Ķ��� �����˻�������
		 *�����ӳɹ�����true,���ʧ�ܷ���false
		 */

		boolean insert(User user);
		/**����ɾ����Ϣ�ķ���
		 * @author ���ۺ� Ҫɾ���Ķ��󣬰����˻�������
		 *�����ӳɹ�����true,ɾ��ʧ�ܷ���false
		 */
		boolean delete(String uname);
		/**�����޸���Ϣ�ķ���
		 * @author ���ۺ� Ҫɾ���Ķ��󣬰����˻�������
		 *����޸ĳɹ�����true,�޸�ʧ�ܷ���false
		 */
		boolean update(String uname);
		
	
}
