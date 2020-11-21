package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class UserDao
{
	private JdbcTemplate jdbc;

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	public int save(User u)
	{
		String str=" insert into user4 values(' " + u.getUsername() + " ' , ' " + u.getPassowrd() + " ',' "+u.getEmail()+" ',' "+u.getMobile()+" ') ";
	return	jdbc.update(str);
	}
	
	public List display()
	{
		final List list=new ArrayList();
		String str="select * from user4 ";
		jdbc.query(str,new ResultSetExtractor<User>() {

			public User extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				while(rs.next())
				{
					User obj=new User();
					obj.setUsername(rs.getString("username"));
					obj.setPassowrd(rs.getString("password"));
					obj.setEmail(rs.getString("email"));
					obj.setMobile(rs.getString("mobile"));
					
					list.add(obj);
				}
				
				return null;
			}});
				return list;
		
	}

}
