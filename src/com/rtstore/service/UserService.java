package com.rtstore.service;

import com.rtstore.dao.UserDao;
import com.rtstore.domain.User;

public class UserService {
	private UserDao dao = new UserDao();
	

	public UserService(User user) {
		// 调用dao完成注册
		dao.addUser(user);
		//发送激活邮件
		String emailMsg = "感谢您注册网上书城，单击"+"<a href='http://localhost:8080/bookstore/activUser?activeCode='>"
		+user.getActiveCode()+"'>&nbsp;</a>后使用。"
		+"<br />为保障您的账户安全，请在24小时完成激活操作";
		MailUtils.sendmain();
		
	}

}
