package examples;

import playmanagement.game.GameUId;
import playmanagement.rights.RightsManager;
import playmanagement.user.AccountUId;
import playmanagement.user.RevocableToken;
import examples.resources.PlayManagementSystemImpl;

public class ExamplesOfRightsManagement {
	
	public void gameRoomManagementRightsGrant(AccountUId accountuid,
												GameUId gameuid,
												RevocableToken adminloggedinuid) 
	throws Exception {	
		RightsManager rightsmanager = 
			new PlayManagementSystemImpl().getRightsManager();
		rightsmanager.grantGameRoomManagementRights(
				adminloggedinuid, gameuid, accountuid);		

		assert(rightsmanager.hasAccountGameRoomManagementRights(accountuid,
																gameuid));
		// then
		rightsmanager.removeGameRoomManagementRights(
				adminloggedinuid, gameuid, accountuid);
		
		assert(!rightsmanager.hasAccountGameRoomManagementRights(accountuid,
																gameuid));
	}
	
	public void gamePlayRightsGrant(AccountUId accountuid,
			GameUId gameuid,
			RevocableToken adminloggedinuid) 
	throws Exception {
		RightsManager rightsmanager = 
			new PlayManagementSystemImpl().getRightsManager();
		rightsmanager.grantGamePlayRights(
				adminloggedinuid, gameuid, accountuid);
		
		assert(rightsmanager.hasAccountGamePlayRights(accountuid, gameuid));
		
		// then
		rightsmanager.removeGamePlayRights(
				adminloggedinuid, gameuid, accountuid);
		
		assert(!rightsmanager.hasAccountGamePlayRights(accountuid, gameuid));			
	}
}
