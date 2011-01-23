package implement;

import java.util.List;

import playmanagement.rights.exceptions.InsufficientRightsException;
import playmanagement.user.AccountManager;
import playmanagement.user.AccountUId;
import playmanagement.user.RevocableToken;
import playmanagement.user.exceptions.AccountManagementException;
import playmanagement.user.exceptions.InvalidAccountUIdException;
import playmanagement.user.exceptions.RevokedTokenException;

public class UserManager implements AccountManager {

	@Override
	public AccountUId createAccount(String loginName, String loginpwd)
			throws AccountManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteAccount(RevocableToken loggedinuid,
			AccountUId accountuid) throws InvalidAccountUIdException,
			RevokedTokenException, InsufficientRightsException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getAccountProperty(RevocableToken requesterToken,
			AccountUId account, String propertyName)
			throws InvalidAccountUIdException, RevokedTokenException,
			InsufficientRightsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountUId> getAccountUIdList(RevocableToken admintoken)
			throws RevokedTokenException, InsufficientRightsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAccountProperty(RevocableToken requesterToken,
			AccountUId account, String propertyName, String propertyValue)
			throws InvalidAccountUIdException, RevokedTokenException,
			InsufficientRightsException {
		// TODO Auto-generated method stub

	}

}
