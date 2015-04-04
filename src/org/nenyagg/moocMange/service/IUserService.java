package org.nenyagg.moocMange.service;
import org.nenyagg.moocMange.vo.User;

public interface IUserService {
	public void saveUser(User user);
	public User	validateUser(String username, String password);
}
