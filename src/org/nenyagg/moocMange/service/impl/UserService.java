package org.nenyagg.moocMange.service.impl;
import org.nenyagg.moocMange.dao.IUserDAO;
import org.nenyagg.moocMange.service.IUserService;
import org.nenyagg.moocMange.vo.User;

public class UserService implements IUserService{
	private IUserDAO userDAO;
	
	public void saveUser(User user)
	{
		this.userDAO.saveUser(user);
	}
	public User	validateUser(String username, String password)
	{
		return userDAO.validateUser(username, password);
	}
	
	public IUserDAO getUserDAO()
	{
		return userDAO;
	}
	
	public void setUserDAO(IUserDAO userDAO)
	{
		this.userDAO = userDAO;
	}
}
