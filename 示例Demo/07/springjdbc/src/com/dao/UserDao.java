package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.entity.User;

@Repository
public class UserDao extends JdbcDaoSupport{
	/**
	 * 使用JdbcDaoSupport的2种注入dataSource的方式
	 */
//	@Autowired
//	public UserDao(DataSource dataSource){
//		setDataSource(dataSource);
//	}
	
	@Resource
	private DataSource dataSource;
	@PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }
	
	public User get(int qqNum){
		return this.getJdbcTemplate().queryForObject("select * from users where qqNum=?",
				new Object[]{qqNum}, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int index) throws SQLException {
				User u=new User();
				u.setQqnum(rs.getInt(1));
				u.setNickName(rs.getString(2));
				return u;
			}
			
		});
	}

}
