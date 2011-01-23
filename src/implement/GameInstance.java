package implement;

import java.util.List;
import java.util.Properties;

import playmanagement.game.GameUId;
import playmanagement.game.exceptions.GameManagementException;
import playmanagement.game.instance.GameInstanceEvent;
import playmanagement.game.instance.GameInstanceListener;
import playmanagement.game.instance.GameInstanceUId;
import playmanagement.rights.exceptions.InsufficientRightsException;
import playmanagement.user.AccountUId;
import playmanagement.user.RevocableToken;
import playmanagement.user.exceptions.InvalidAccountUIdException;
import playmanagement.user.exceptions.RevokedTokenException;

public class GameInstance implements GameInstanceListener, GameInstanceUId,
		playmanagement.game.instance.GameInstance {

	@Override
	public void notify(GameInstanceEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEqualTo(GameInstanceUId gameInstanceUid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addGameInstanceManagementEventListener(
			GameInstanceListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPlayer(RevocableToken instanceAdmin,
			AccountUId accountOfthePlayer) throws RevokedTokenException,
			InvalidAccountUIdException, InsufficientRightsException,
			GameManagementException {
		// TODO Auto-generated method stub

	}

	@Override
	public Properties getGameInstanceProperties(RevocableToken requesterToken) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameInstanceUId getGameInstanceUId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameUId getGameUId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountUId> getPlayers(RevocableToken requesterToken)
			throws RevokedTokenException, InsufficientRightsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean haveResourcesBeenReleased(RevocableToken requesterToken)
			throws RevokedTokenException, InsufficientRightsException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPaused(RevocableToken requesterToken)
			throws RevokedTokenException, InsufficientRightsException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isStarted(RevocableToken requesterToken)
			throws RevokedTokenException, InsufficientRightsException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isStopped(RevocableToken requesterToken)
			throws RevokedTokenException, InsufficientRightsException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void pause(RevocableToken requesterToken)
			throws RevokedTokenException, InsufficientRightsException {
		// TODO Auto-generated method stub

	}

	@Override
	public void releaseResources(RevocableToken requesterToken)
			throws RevokedTokenException, InsufficientRightsException {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeGameInstanceManagementEventListener(
			GameInstanceListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removePlayer(RevocableToken instanceAdmin,
			AccountUId accountOfthePlayer) throws RevokedTokenException,
			InvalidAccountUIdException, InsufficientRightsException,
			GameManagementException {
		// TODO Auto-generated method stub

	}

	@Override
	public void start(RevocableToken requesterToken)
			throws RevokedTokenException, InsufficientRightsException {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop(RevocableToken requesterToken)
			throws RevokedTokenException, InsufficientRightsException {
		// TODO Auto-generated method stub

	}

}
