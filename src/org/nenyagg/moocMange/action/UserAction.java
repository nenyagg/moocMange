package org.nenyagg.moocMange.action;
import java.util.Map;
import org.nenyagg.moocMange.service.IUserService;
import org.nenyagg.moocMange.service.impl.UserService;
import org.nenyagg.moocMange.vo.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private User user;
	protected IUserService userService;
	
	public String register() throws Exception
	{
		userService.saveUser(user);
		return SUCCESS;
	}
	
	public String execute()throws Exception
	{
		User u = userService.validateUser(user.getUsername(), user.getPassword());
		if(u != null)
		{
			Map session = ActionContext.getContext().getSession();
			session.put("user", u);
			return SUCCESS;
		}
		return ERROR;
	}
	
	public String logout()throws Exception
	{
		Map session = ActionContext.getContext().getSession();
		session.remove("user");
		return SUCCESS;
	}
	
	public User getUser()
	{
		return this.user;
	}
	
	public void setUser(User user)
	{
		this.user = user;
	}
	
	public IUserService getUserService()
	{
		return this.userService;
	}
	
	public void setUserService(IUserService userService)
	{
		this.userService = userService;
	}
}
