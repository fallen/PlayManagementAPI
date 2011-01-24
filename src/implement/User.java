package implement;

import playmanagement.user.AccountUId;
import playmanagement.user.LogonManager;
import playmanagement.user.RevocableToken;

public class User implements  LogonManager{
	
	private Token token;
	private String login;
	private String passwd;
	private UId uid;
	

	public UId getGameUid() {
		return uid;
	}

	public Token getToken() {
		return token;
	}
	
	public User()
	{
		this.login = null;
		this.passwd = null;
		this.uid = new UId(null);
		this.token = new Token();
	}

	public User(String loginName, String loginpwd) {
		this.login = loginName;
		this.passwd = loginpwd;
		this.uid = new UId(null);
		this.token = new Token();
	}

	@Override
	public AccountUId getUserAccountUId(RevocableToken token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RevocableToken login(String login, String pwd) {
		if( this.login.equalsIgnoreCase(login) && this.passwd.equalsIgnoreCase(pwd))
		{
			return this.token;
		}
		return null;
	}

	@Override
	public void logout(RevocableToken usertoken) {
		((Token)usertoken).setTimeOut(Long.valueOf(0));
	}

}
