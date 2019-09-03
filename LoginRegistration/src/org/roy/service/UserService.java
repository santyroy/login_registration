package org.roy.service;

import org.roy.model.Login;
import org.roy.model.User;

public interface UserService {

	void register(User user);
	
	User login(Login login);
}
