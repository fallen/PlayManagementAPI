package examples;

import java.util.List;
import java.util.Properties;

import playmanagement.game.Game;
import playmanagement.game.GameUId;
import playmanagement.game.GamesManager;
import playmanagement.game.instance.GameInstanceUId;
import playmanagement.gameroom.GameRoom;
import playmanagement.gameroom.GameRoomUId;
import playmanagement.gameroom.GameRoomsManager;
import playmanagement.system.PlayManagementSystem;
import playmanagement.user.AccountManager;
import playmanagement.user.AccountUId;
import playmanagement.user.LogonManager;
import playmanagement.user.RevocableToken;
import examples.resources.PlayManagementSystemImpl;

public class ExampleOfPlayerBehavior {

	public void exhibitPlayerBehavior() throws Exception {
		PlayManagementSystem system = new PlayManagementSystemImpl();
		AccountManager accountman = system.getAccountManager();
		LogonManager logonmanager = system.getLogonManager();
		GameRoomsManager roomMan = system.getGameRoomsManager();
		GamesManager gamesmanager = system.getGamesManager();
		
		AccountUId accountid = accountman.createAccount("player1", "titi");
		RevocableToken playertoken = logonmanager.login("player1", "titi");
		
		List<GameRoomUId> roomlist = roomMan.getGameRoomList(playertoken);
		GameRoomUId therightroom = null;
		
		for (GameRoomUId roomid : roomlist) {
			GameInstanceUId instanceuid = roomMan.getAssociatedGameInstance(
														roomid, playertoken);
			
			GameUId gameuid = gamesmanager.getGameUId(instanceuid);
			Game game = gamesmanager.getGame(gameuid);			
			Properties gameprop = game.getGameDescription();
			
			// test on properties to find the right room
			// set the therightroom value
		}
		
		GameRoom room = roomMan.getGameRoom(therightroom, playertoken);		
		room.enter(playertoken, logonmanager.getUserAccountUId(playertoken));
	}
	
}
