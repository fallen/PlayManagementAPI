package implement;

import java.util.List;
import java.util.Properties;

import playmanagement.game.GameInstancesManager;
import playmanagement.game.GameUId;
import playmanagement.game.exceptions.GameManagementException;
import playmanagement.game.instance.GameInstance;
import playmanagement.game.instance.GameInstanceUId;
import playmanagement.rights.exceptions.InsufficientRightsException;
import playmanagement.user.AccountUId;
import playmanagement.user.RevocableToken;
import playmanagement.user.exceptions.InvalidAccountUIdException;
import playmanagement.user.exceptions.RevokedTokenException;

public class Game implements playmanagement.game.Game, GameUId,
		GameInstancesManager {
	
	private Integer Uid;

	public Integer getUid() {
		return Uid;
	}

	@Override
	public Properties getGameDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameUId getGameUId() {
		return this;
	}

	@Override
	public GameInstancesManager getInstancesManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEqualTo(GameUId gameUid) {
		return this.Uid.equals(((Game)gameUid).getUid());
	}

	@Override
	public GameInstanceUId createGameInstance(
			RevocableToken gameInstanceCreator,
			AccountUId gameInstanceAdminAccountUId,
			Properties gameInstanceProperties) throws RevokedTokenException,
			InvalidAccountUIdException, GameManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteGameInstance(RevocableToken requesterToken,
			GameInstanceUId gameInstanceUId) throws RevokedTokenException,
			GameManagementException {
		// TODO Auto-generated method stub

	}

	@Override
	public GameInstance getGameInstance(RevocableToken gameInstanceAdminToken,
			GameInstanceUId gameInstanceUId) throws GameManagementException,
			InsufficientRightsException, RevokedTokenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameInstanceUId> getGameInstances(RevocableToken requesterToken)
			throws GameManagementException, InsufficientRightsException,
			RevokedTokenException {
		// TODO Auto-generated method stub
		return null;
	}

}
