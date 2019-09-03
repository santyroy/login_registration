package org.roy.dao;

import org.roy.model.Login;
import org.roy.model.User;

public interface UserDAO {

	void register(User user);
	
	User validate(Login login);
}
