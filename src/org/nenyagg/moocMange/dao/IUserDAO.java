package org.nenyagg.moocMange.dao;
import org.nenyagg.moocMange.vo.User;
public interface IUserDAO {
	public void saveUser(User user);
	
	public User validateUser(String username, String password);
}
