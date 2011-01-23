package playmanagement.system;

import playmanagement.game.GamesManager;
import playmanagement.game.instance.GamesInstancesManager;
import playmanagement.gameroom.GameRoomsManager;
import playmanagement.rights.RightsManager;
import playmanagement.user.AccountManager;
import playmanagement.user.LogonManager;


/**
 * 
 * The play management system object is meant to be instantiated on each node 
 * of the system. Each player obtains, by logging in, a personal revocableToken object, 
 * which is meant to be local and private. This token enables the player to interact 
 * with the local PlayManagementSystem instance.
 * 
 * If server and client are distinguished (for example if the client cannot run games
 * and act as a server) : There should two implementations of this interface : 
 * a server and a client one.
 * 
 * @author alain ozanne
 *
 */

public interface PlayManagementSystem {
	AccountManager 			getAccountManager();
	RightsManager 			getRightsManager();
	GamesManager 			getGamesManager();
	LogonManager			getLogonManager();
	GameRoomsManager		getGameRoomsManager();
	GamesInstancesManager 	getGameInstanceManager();
}
