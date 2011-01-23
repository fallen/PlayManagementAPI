package implement;

import java.util.List;
import java.util.Properties;

import playmanagement.gameroom.GameRoomListener;
import playmanagement.gameroom.GameRoomManagementEvent;
import playmanagement.gameroom.GameRoomUId;
import playmanagement.gameroom.exceptions.GameRoomManagementException;
import playmanagement.rights.exceptions.InsufficientRightsException;
import playmanagement.user.AccountUId;
import playmanagement.user.RevocableToken;
import playmanagement.user.exceptions.RevokedTokenException;

public class GameRoom implements playmanagement.gameroom.GameRoom,
		GameRoomListener, GameRoomUId {

	@Override
	public void addManagementEventListener(GameRoomListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enter(RevocableToken requesterToken,
			AccountUId enteringPlayerAccountUId)
			throws InsufficientRightsException, RevokedTokenException,
			GameRoomManagementException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<AccountUId> getGameRoomPopulation(RevocableToken roomAdminToken)
			throws InsufficientRightsException, RevokedTokenException,
			GameRoomManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameRoomUId getGameRoomUId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Properties getRoomProperties(RevocableToken roomAdminToken)
			throws InsufficientRightsException, RevokedTokenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isIn(RevocableToken requesterToken,
			AccountUId enteringPlayerAccountUId)
			throws InsufficientRightsException, RevokedTokenException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void leave(RevocableToken requesterToken,
			AccountUId leavingPlayerAccountUId)
			throws InsufficientRightsException, RevokedTokenException,
			GameRoomManagementException {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeManagementEventListener(GameRoomListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void notify(GameRoomManagementEvent roomevent) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEqualTo(GameRoomUId gameRoomUid) {
		// TODO Auto-generated method stub
		return false;
	}

}
