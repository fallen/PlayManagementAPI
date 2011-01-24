package implement;

import playmanagement.user.AccountUId;
import playmanagement.user.LogonManager;
import playmanagement.user.RevocableToken;

public class User implements RevocableToken, LogonManager, AccountUId {
	
	private boolean state;
	private long timeToLive;
	private String login;
	private String passwd;
	private Integer Uid;
	
	public Integer getUid() {
		return Uid;
	}

	public User()
	{
		this.state = false;
		this.timeToLive = 0;
		this.login = null;
		this.passwd = null;
	}

	@Override
	public boolean isRevoked() {
		return this.state;
	}

	@Override
	public void setTimeOut(long nbrOfSecondsOfValidity) {
		this.timeToLive = nbrOfSecondsOfValidity;
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
			return this;
		}
		return null;
	}

	@Override
	public void logout(RevocableToken usertoken) {
		((User)usertoken).setTimeOut(0);
	}

	@Override
	public boolean isEqualTo(AccountUId accountUid) {
		return this.Uid.equals(((User)accountUid).getUid());
	}

}
