package implement;

import playmanagement.user.AccountUId;
import playmanagement.user.LogonManager;
import playmanagement.user.RevocableToken;

public class User implements RevocableToken, LogonManager, AccountUId {

	@Override
	public boolean isRevoked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setTimeOut(long nbrOfSecondsOfValidity) {
		// TODO Auto-generated method stub

	}

	@Override
	public AccountUId getUserAccountUId(RevocableToken token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RevocableToken login(String login, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void logout(RevocableToken usertoken) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEqualTo(AccountUId accountUid) {
		// TODO Auto-generated method stub
		return false;
	}

}
