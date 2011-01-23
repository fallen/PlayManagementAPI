package playmanagement.user;

import java.util.List;

import playmanagement.rights.exceptions.InsufficientRightsException;
import playmanagement.user.exceptions.AccountManagementException;
import playmanagement.user.exceptions.InvalidAccountUIdException;
import playmanagement.user.exceptions.RevokedTokenException;

/**
 * 
 * This interface enables the management of user accounts : creation, deletion,
 * properties setting and reading.
 * 
 * @author alain ozanne
 *
 */

public interface AccountManager {
	AccountUId createAccount(String loginName, String loginpwd)
				throws AccountManagementException;
	
	boolean deleteAccount(RevocableToken loggedinuid, AccountUId accountuid)
				throws 	InvalidAccountUIdException, 
						RevokedTokenException,
						InsufficientRightsException;
	
	List<AccountUId> getAccountUIdList(RevocableToken admintoken)
				throws 	RevokedTokenException,
						InsufficientRightsException;
			
	String getAccountProperty(RevocableToken requesterToken, 
								AccountUId account,
								String propertyName)
				throws 	InvalidAccountUIdException, 
						RevokedTokenException,
						InsufficientRightsException;
	
	void setAccountProperty(RevocableToken requesterToken, 
							AccountUId account,
							String propertyName,
							String propertyValue)
				throws 	InvalidAccountUIdException, 
						RevokedTokenException,
						InsufficientRightsException;
}
