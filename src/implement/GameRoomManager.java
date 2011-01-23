package implement;

import java.util.List;
import java.util.Properties;

import playmanagement.game.exceptions.GameManagementException;
import playmanagement.game.instance.GameInstanceUId;
import playmanagement.gameroom.GameRoom;
import playmanagement.gameroom.GameRoomUId;
import playmanagement.gameroom.GameRoomsManager;
import playmanagement.gameroom.exceptions.GameRoomManagementException;
import playmanagement.rights.exceptions.InsufficientRightsException;
import playmanagement.user.RevocableToken;
import playmanagement.user.exceptions.RevokedTokenException;

public class GameRoomManager implements GameRoomsManager {

	@Override
	public void associateGameRoomAndGameInstance(GameRoomUId gameroomuid,
			GameInstanceUId gameinstanceuid, RevocableToken roomadmin)
			throws GameManagementException, GameRoomManagementException,
			InsufficientRightsException, RevokedTokenException {
		// TODO Auto-generated method stub

	}

	@Override
	public GameRoomUId createGameRoom(Properties roomproperties,
			RevocableToken requesterToken) throws InsufficientRightsException,
			RevokedTokenException, GameRoomManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteGameRoom(GameRoomUId gameroomuid, RevocableToken roomadmin)
			throws InsufficientRightsException, RevokedTokenException,
			GameRoomManagementException {
		// TODO Auto-generated method stub

	}

	@Override
	public void dissociateGameRoomAndGameInstance(GameRoomUId gameroomuid,
			GameInstanceUId gameinstanceuid, RevocableToken roomadmin)
			throws GameManagementException, GameRoomManagementException,
			InsufficientRightsException, RevokedTokenException {
		// TODO Auto-generated method stub

	}

	@Override
	public GameInstanceUId getAssociatedGameInstance(GameRoomUId gameroomuid,
			RevocableToken requesterToken) throws InsufficientRightsException,
			RevokedTokenException, GameRoomManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameRoomUId getAssociatedGameRoom(GameInstanceUId gameinstanceuid,
			RevocableToken requesterToken) throws InsufficientRightsException,
			RevokedTokenException, GameRoomManagementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameRoom getGameRoom(GameRoomUId gameroomuid,
			RevocableToken requesterToken) throws InsufficientRightsException,
			RevokedTokenException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GameRoomUId> getGameRoomList(RevocableToken requesterToken)
			throws InsufficientRightsException, RevokedTokenException,
			GameRoomManagementException {
		// TODO Auto-generated method stub
		return null;
	}

}
