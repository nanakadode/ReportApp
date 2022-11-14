//package com.example.demo.repository;
//
//import java.util.List;
//
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.stereotype.Repository;
//
//import com.example.demo.entity.Users;
//
//@Repository
//public class UserDaoImpl implements UserDao {
//
//	private static final String TABLE_NAME = "users";
//    private static final String SELECT_SQL = "SELECT id, username, email, password, enabled, authority_id, tempkey ";
//    private static final String FROM_SQL = "FROM " + TABLE_NAME;
//    private static final String PRIMARY_KEY_WHERE_SQL = "WHERE id = ? ";
//    private static final String ORDER_BY_SQL = "ORDER BY id";
//    
//    private static final String FIND_ALL_SQL = SELECT_SQL + FROM_SQL + ORDER_BY_SQL;
//    private static final String FIND_ACTIVE_USERS_SQL = SELECT_SQL + FROM_SQL + "WHERE enabled = 1 " + ORDER_BY_SQL;
//    private static final String FIND_BY_ID_SQL = SELECT_SQL + FROM_SQL + PRIMARY_KEY_WHERE_SQL;
//
//    private static final String INSERT_SQL = "INSERT INTO " + TABLE_NAME +
//            "(username, email, password, enabled, authority_id, tempkey) " +
//            "VALUES(?, ?, ?, ?, ?, ?)";
//
//    private static final String UPDATE_SQL = "UPDATE " + TABLE_NAME +
//            "SET username = ?, email = ?, password = ?, enabled = ?, authority_id = ?, tempkey = ? " +
//            PRIMARY_KEY_WHERE_SQL;
//
//    private static final String DELETE_BY_ID_SQL = "DELETE FROM " + TABLE_NAME + PRIMARY_KEY_WHERE_SQL;
//
////    rs = result set
//    private static final RowMapper<User> USER_ROW_MAPPER = (rs, rowNum) -> {
//        var user = new Users();
//        user.setId(rs.getInt("id"));
//        user.setUsername(rs.getString("username"));
//        user.setEmail(rs.getString("email"));
//        user.setPassword(rs.getString("password"));
//        user.setEnabled(rs.getBoolean("enabled"));
//        user.setAuthorityId(rs.getString("authority_id"));
//        user.setTempkey(rs.getString("tempkey"));
//        return user;
//    };
//    
//    private JdbcTemplate jdbcTemplate;
//    
//    
//	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
//
//	@Override
//	public List<User> findAll() {
//		return jdbcTemplate.query(FIND_ALL_SQL, )
//	}
//
//	@Override
//	public List<User> findActiveUsers() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public User findById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int insert(User user) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int update(User user) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int deleteById(int id) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//}
