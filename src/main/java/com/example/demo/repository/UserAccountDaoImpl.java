package com.example.demo.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Users;


@Repository
public class UserAccountDaoImpl implements UserAccountDao {

	private final NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	public UserAccountDaoImpl(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public Optional<Users> findUser(String email) {
		
		String sql = "SELECT id, username, email, password "
				+ "FROM users "
				+ "WHERE email = :email";
//		Map for setting parameter 
		Map<String, Object> param = new HashMap<>();
		param.put("email", email);
		Users user = new Users();
//		GET 1 row
		try {
			Map<String, Object> result = jdbcTemplate.queryForMap(sql, param);
			user.setId((int)result.get("id"));
			user.setUsername((String)result.get("username"));
			user.setEmail((String)result.get("email"));
			user.setPassword((String)result.get("password"));
		} catch(EmptyResultDataAccessException e) {
			Optional<Users> userOpt = Optional.ofNullable(user);
			return userOpt;
		}
//		wrapping 
		Optional<Users> userOpt = Optional.ofNullable(user);
		return userOpt;
	}

}
