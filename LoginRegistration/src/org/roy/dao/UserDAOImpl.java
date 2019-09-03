package org.roy.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.roy.model.Login;
import org.roy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("userService")
public class UserDAOImpl implements UserDAO {

	@Autowired
	DataSource dataSource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void register(User user) {
		String insertQuery = "insert into users values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(insertQuery, new Object[] { user.getUserName(), user.getPassword(), user.getFirstName(),
				user.getLastName(), user.getEmail(), user.getAddress(), user.getPhone() });
	}

	@Override
	public User validate(Login login) {
		String query = "select * from users where userName='" + login.getUserName() + "' and password='"
				+ login.getPassword() + "'";
		System.out.println("QUERY => " + query);
		List<User> users = jdbcTemplate.query(query, new UserMapper());
		return users.size() > 0 ? users.get(0) : null;
	}

}

/*
 * To read data using JDBC - we use ResultSet interface
 * To read data using Spring JDBC - we have two interfaces 
 * 1. RowMapper -> to read only one row
 * 2. ResultSetExtractor -. to read all rows
 */
class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setUserName(rs.getString("userName"));
		user.setPassword(rs.getString("password"));
		user.setFirstName(rs.getString("firstName"));
		user.setLastName(rs.getString("lastName"));
		user.setEmail(rs.getString("email"));
		user.setAddress(rs.getString("address"));
		user.setPhone(rs.getString("phone"));
		return user;
	}

}
