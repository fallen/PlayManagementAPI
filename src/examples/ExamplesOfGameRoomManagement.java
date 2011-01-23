package examples;

import java.util.Properties;

import playmanagement.game.GameUId;
import playmanagement.game.instance.GameInstanceUId;
import playmanagement.gameroom.GameRoom;
import playmanagement.gameroom.GameRoomUId;
import playmanagement.gameroom.GameRoomsManager;
import playmanagement.gameroom.exceptions.GameRoomManagementException;
import playmanagement.rights.RightsManager;
import playmanagement.rights.exceptions.InsufficientRightsException;
import playmanagement.system.PlayManagementSystem;
import playmanagement.user.AccountUId;
import playmanagement.user.LogonManager;
import playmanagement.user.RevocableToken;
import playmanagement.user.exceptions.RevokedTokenException;
import examples.resources.PlayManagementSystemImpl;

public class ExamplesOfGameRoomManagement {
	
	public GameRoomUId createGameRoom(RevocableToken roomCreator,
								GameInstanceUId gameInstanceUId,
								GameUId gameUId) 
					throws 	Exception {
		
		PlayManagementSystem system = new PlayManagementSystemImpl();
		GameRoomsManager roomsManager = system.getGameRoomsManager();
		RightsManager rightsManager = system.getRightsManager();
		LogonManager logonManager = system.getLogonManager();
		Properties roomProperties = new Properties();
		GameRoomUId gameroomuid = null;
		
		assert(rightsManager.hasAccountGameRoomManagementRights(
				logonManager.getUserAccountUId(roomCreator), 
				gameUId));
		
		gameroomuid = roomsManager.createGameRoom(roomProperties, 
												roomCreator);
		
		roomsManager.associateGameRoomAndGameInstance(gameroomuid, 
														gameInstanceUId, 
														roomCreator);
		
		return gameroomuid;
	}
	
	public void enterGameRoom(GameRoomUId gameroomuid,
							AccountUId playerAccountUId,
							RevocableToken roommanager) 
	throws 	RevokedTokenException, 
			InsufficientRightsException, 
			GameRoomManagementException {		
		PlayManagementSystem system = new PlayManagementSystemImpl();
		GameRoomsManager roomsManager = system.getGameRoomsManager();
		
		// --------------------------------------------------------------
		// only the room manager can get the controller to a room
		GameRoom roomcontroller 
				= roomsManager.getGameRoom(gameroomuid, 
										   roommanager);
		
		// --------------------------------------------------------------
		roomcontroller.enter(roommanager, playerAccountUId);		
	}
	
}
