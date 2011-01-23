package playmanagement.rights;

import playmanagement.game.GameUId;
import playmanagement.rights.exceptions.RightsManagementException;
import playmanagement.user.AccountUId;
import playmanagement.user.RevocableToken;
import playmanagement.user.exceptions.InvalidAccountUIdException;
import playmanagement.user.exceptions.RevokedTokenException;

/**
 * 
 * This interface manages the rights grant.
 * 
 * @author alain ozanne
 *
 */

public interface RightsManager {
	void grantGameRoomManagementRights(RevocableToken adminToken,
										GameUId gameuid, 
										AccountUId accountuid)
							throws 	RevokedTokenException, 
									InvalidAccountUIdException, 
									RightsManagementException;	
	
	void grantGameInstanceCreationRights(RevocableToken adminToken,
											GameUId gameuid, 
											AccountUId accountuid)
							throws 	RevokedTokenException, 
									InvalidAccountUIdException, 
									RightsManagementException;
	
	void grantGamePlayRights(RevocableToken adminToken,
								GameUId gameuid, 
								AccountUId accountuid)
							throws 	RevokedTokenException, 
									InvalidAccountUIdException, 
									RightsManagementException;		
	
	
	void removeGameRoomManagementRights(RevocableToken adminToken,
										GameUId gameuid, 
										AccountUId accountuid)
							throws 	RevokedTokenException, 
									InvalidAccountUIdException, 
									RightsManagementException;	
	
	
	void removeGamePlayRights(RevocableToken adminToken,
								GameUId gameuid, 
								AccountUId accountuid)							
							throws 	RevokedTokenException, 
									InvalidAccountUIdException, 
									RightsManagementException;
	
	
	void removeGameInstanceCreationRights(RevocableToken adminToken,
											GameUId gameuid, 
											AccountUId accountuid)
							throws 	RevokedTokenException, 
									InvalidAccountUIdException, 
									RightsManagementException;
		
	
	boolean hasAccountGameRoomManagementRights(AccountUId accountuid, 
												GameUId gameuid)
							throws InvalidAccountUIdException, 
									RightsManagementException;
	
	boolean hasAccountGamePlayRights(AccountUId accountuid, 
											GameUId gameuid)
							throws InvalidAccountUIdException, 
									RightsManagementException;
	
	boolean hasAccountGameInstanceCreationRights(AccountUId accountuid, 
														GameUId gameuid)
							throws InvalidAccountUIdException, 
									RightsManagementException;
}
