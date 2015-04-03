package org.nenyagg.moocMange.dao.impl;
import java.sql.*;
import java.util.List;
import org.nenyagg.moocMange.dao.*;
import org.nenyagg.moocMange.vo.User;
import org.hibernate.*;

public class UserDAO extends BaseDAO implements IUserDAO{
	public void saveUser(User user)
	{
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
	}
	
	public User validateUser(String username, String password)
	{
		return null;
	}

}
