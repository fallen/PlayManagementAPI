package implement;

import java.util.List;
import java.util.Properties;

import playmanagement.game.GameUId;
import playmanagement.game.exceptions.GameManagementException;
import playmanagement.game.instance.GameInstance;
import playmanagement.game.instance.GameInstanceUId;
import playmanagement.game.instance.GamesInstancesManager;
import playmanagement.rights.exceptions.InsufficientRightsException;
import playmanagement.user.AccountUId;
import playmanagement.user.RevocableToken;
import playmanagement.user.exceptions.InvalidAccountUIdException;
import playmanagement.user.exceptions.RevokedTokenException;

public class GameInstanceManager implements GamesInstancesManager {

	@Override
	public GameInstanceUId createGameInstance(GameUId gameUId,
			RevocableToken gameInstanceCreator,
			AccountUId gameInstanceAdminAccountUId,
			Properties gameInstanceProperties) throws RevokedTokenException,
			InvalidAccountUIdException, GameManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteGameInstance(GameInstanceUId gameinstanceuid,
			RevocableToken requesterToken) throws RevokedTokenException,
			GameManagementException {
		// TODO Auto-generated method stub

	}

	@Override
	public GameInstance getGameInstance(GameInstanceUId gameInstanceUId,
			RevocableToken gameInstanceAdminToken)
			throws GameManagementException, InsufficientRightsException,
			RevokedTokenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameInstanceUId> getGameInstances(GameUId gameUId,
			RevocableToken requesterToken) throws GameManagementException,
			InsufficientRightsException, RevokedTokenException {
		// TODO Auto-generated method stub
		return null;
	}

}
