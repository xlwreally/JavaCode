package org.microsoft.xlw.day6.bank;

public class Login {
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	public boolean login(Login lg)
	{
		boolean flag=false;
		if(this.getUserName().equals(lg.getUserName()) && this.getPassword().equals(lg.getPassword()))
		{
			flag=true;
		}
		
		return flag;
	}
	
}
