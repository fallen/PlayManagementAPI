package implement;

import playmanagement.user.AccountUId;
import playmanagement.user.LogonManager;
import playmanagement.user.RevocableToken;

public class User implements RevocableToken, LogonManager, AccountUId {
	
	private Token token;
	private String login;
	private String passwd;
	private UId uid;
	

	public UId getGameUid() {
		return uid;
	}

	public User()
	{
		this.login = null;
		this.passwd = null;
		this.uid = new UId(null);
		this.token = new Token();
	}
	
	public User(String login, String passwd)
	{
		this.login = login;
		this.passwd = passwd;
		this.uid = new UId(null);
		this.token = new Token();
	}

	@Override
	public boolean isRevoked() {
		return this.token.isLife();
	}

	@Override
	public void setTimeOut(long nbrOfSecondsOfValidity) {
		this.token.setTimeToLive(Long.valueOf(nbrOfSecondsOfValidity));
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
		((User)usertoken).setTimeOut(Long.valueOf(0));
	}

	@Override
	public boolean isEqualTo(AccountUId accountUid) {
		return uid.getUid().equals(((User)accountUid).getGameUid().getUid());
	}

}
