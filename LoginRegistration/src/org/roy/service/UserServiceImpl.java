package org.roy.service;

import org.roy.dao.UserDAO;
import org.roy.model.Login;
import org.roy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	
	@Override
	public void register(User user) {
		userDAO.register(user);
	}

	@Override
	public User login(Login login) {
		return userDAO.validate(login);
	}

}
