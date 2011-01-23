package implement;

import java.util.List;

import playmanagement.game.Game;
import playmanagement.game.GameUId;
import playmanagement.game.GamesManager;
import playmanagement.game.exceptions.GameManagementException;
import playmanagement.game.instance.GameInstanceUId;
import playmanagement.rights.exceptions.InsufficientRightsException;
import playmanagement.user.RevocableToken;
import playmanagement.user.exceptions.RevokedTokenException;

public class GameManager implements GamesManager {

	@Override
	public Game getGame(GameUId gameuid) throws GameManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameUId getGameUId(GameInstanceUId instanceUId)
			throws GameManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameUId> getRegisteredGamesList()
			throws GameManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameUId registerGame(RevocableToken admintoken, String gameJarPath)
			throws GameManagementException, InsufficientRightsException,
			RevokedTokenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void unregisterGame(RevocableToken admintoken, GameUId gameuid)
			throws GameManagementException, InsufficientRightsException,
			RevokedTokenException {
		// TODO Auto-generated method stub

	}

}
