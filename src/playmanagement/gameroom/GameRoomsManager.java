package playmanagement.gameroom;

import java.util.List;
import java.util.Properties;

import playmanagement.game.exceptions.GameManagementException;
import playmanagement.game.instance.GameInstanceUId;
import playmanagement.gameroom.exceptions.GameRoomManagementException;
import playmanagement.rights.exceptions.InsufficientRightsException;
import playmanagement.user.RevocableToken;
import playmanagement.user.exceptions.RevokedTokenException;

public interface GameRoomsManager {	
	GameRoomUId createGameRoom(Properties roomproperties,
								RevocableToken requesterToken)
				throws 	InsufficientRightsException, 
						RevokedTokenException,
						GameRoomManagementException;
	
	void associateGameRoomAndGameInstance (GameRoomUId gameroomuid,
											GameInstanceUId gameinstanceuid,
											RevocableToken roomadmin)
				throws 	GameManagementException,
						GameRoomManagementException,
						InsufficientRightsException, 
						RevokedTokenException;
	
	void dissociateGameRoomAndGameInstance (GameRoomUId gameroomuid,
											 GameInstanceUId gameinstanceuid,
											 RevocableToken roomadmin)
				throws 	GameManagementException,
				GameRoomManagementException,
				InsufficientRightsException, 
				RevokedTokenException;

	
	
	void deleteGameRoom(GameRoomUId gameroomuid, 
						RevocableToken roomadmin)
				throws 	InsufficientRightsException, 
						RevokedTokenException,
						GameRoomManagementException;

	
	List<GameRoomUId> getGameRoomList(RevocableToken requesterToken)
				throws 	InsufficientRightsException, 
						RevokedTokenException,
						GameRoomManagementException;
	
	GameRoom getGameRoom(GameRoomUId gameroomuid, 
	  					 RevocableToken requesterToken)
				throws 	InsufficientRightsException, 
						RevokedTokenException;
	
	GameInstanceUId  getAssociatedGameInstance(GameRoomUId gameroomuid, 
	  								RevocableToken requesterToken)
				throws 	InsufficientRightsException, 
						RevokedTokenException,
						GameRoomManagementException;
	
	GameRoomUId getAssociatedGameRoom(GameInstanceUId gameinstanceuid, 
	  								RevocableToken requesterToken)
				throws 	InsufficientRightsException, 
						RevokedTokenException,
						GameRoomManagementException;
}
