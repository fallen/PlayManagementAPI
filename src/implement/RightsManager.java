package implement;

import playmanagement.game.GameUId;
import playmanagement.rights.exceptions.RightsManagementException;
import playmanagement.user.AccountUId;
import playmanagement.user.RevocableToken;
import playmanagement.user.exceptions.InvalidAccountUIdException;
import playmanagement.user.exceptions.RevokedTokenException;

public class RightsManager implements playmanagement.rights.RightsManager {

	@Override
	public void grantGameInstanceCreationRights(RevocableToken adminToken,
			GameUId gameuid, AccountUId accountuid)
			throws RevokedTokenException, InvalidAccountUIdException,
			RightsManagementException {
		// TODO Auto-generated method stub

	}

	@Override
	public void grantGamePlayRights(RevocableToken adminToken, GameUId gameuid,
			AccountUId accountuid) throws RevokedTokenException,
			InvalidAccountUIdException, RightsManagementException {
		// TODO Auto-generated method stub

	}

	@Override
	public void grantGameRoomManagementRights(RevocableToken adminToken,
			GameUId gameuid, AccountUId accountuid)
			throws RevokedTokenException, InvalidAccountUIdException,
			RightsManagementException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean hasAccountGameInstanceCreationRights(AccountUId accountuid,
			GameUId gameuid) throws InvalidAccountUIdException,
			RightsManagementException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasAccountGamePlayRights(AccountUId accountuid,
			GameUId gameuid) throws InvalidAccountUIdException,
			RightsManagementException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasAccountGameRoomManagementRights(AccountUId accountuid,
			GameUId gameuid) throws InvalidAccountUIdException,
			RightsManagementException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeGameInstanceCreationRights(RevocableToken adminToken,
			GameUId gameuid, AccountUId accountuid)
			throws RevokedTokenException, InvalidAccountUIdException,
			RightsManagementException {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeGamePlayRights(RevocableToken adminToken,
			GameUId gameuid, AccountUId accountuid)
			throws RevokedTokenException, InvalidAccountUIdException,
			RightsManagementException {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeGameRoomManagementRights(RevocableToken adminToken,
			GameUId gameuid, AccountUId accountuid)
			throws RevokedTokenException, InvalidAccountUIdException,
			RightsManagementException {
		// TODO Auto-generated method stub

	}

}
