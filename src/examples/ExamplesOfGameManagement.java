package examples;

import java.util.Properties;

import playmanagement.game.Game;
import playmanagement.game.GameUId;
import playmanagement.game.GamesManager;
import playmanagement.game.instance.GameInstance;
import playmanagement.game.instance.GameInstanceUId;
import playmanagement.game.instance.GamesInstancesManager;
import playmanagement.rights.RightsManager;
import playmanagement.user.AccountUId;
import playmanagement.user.LogonManager;
import playmanagement.user.RevocableToken;
import examples.resources.PlayManagementSystemImpl;

public class ExamplesOfGameManagement {
	
	/*************************************************************************/
	/*                on the admin node                                      */
	/*************************************************************************/	
	public void gameRegistration(RevocableToken admintoken) 
	throws Exception {
		PlayManagementSystemImpl system = new PlayManagementSystemImpl();
		GamesManager gamesmanager = system.getGamesManager();
				
		GameUId gameuid = null;
		Game game = null;

		gameuid = gamesmanager.registerGame(
				admintoken, "./tmp/spaceinvaders.jar");
		game = gamesmanager.getGame(gameuid);
		 
		Properties properties = game.getGameDescription();
		assert(properties.getProperty("vendor").equals("gmt"));
		assert(properties.getProperty("name").equals("space invaders"));
	}
	
	public void gameUnregistration(RevocableToken admintoken, GameUId gameuid) 
	throws Exception {
		PlayManagementSystemImpl system = new PlayManagementSystemImpl();
		GamesManager gamesmanager = system.getGamesManager();
		
		gamesmanager.unregisterGame(admintoken, gameuid);
		assert(!gamesmanager.getRegisteredGamesList().contains(gameuid));
	}
	/*************************************************************************/
	
	
	/*************************************************************************/
	public void createAndStartGameInstance(	RevocableToken gameInstanceCreator,
											RevocableToken gameInstanceAdminToken,
								   			GameUId gameuid) 
	throws Exception {
		PlayManagementSystemImpl system = new PlayManagementSystemImpl();
		GamesManager gamesmanager = system.getGamesManager();
		RightsManager rightsManager = system.getRightsManager();
		LogonManager logonmanager = system.getLogonManager();
		GamesInstancesManager instanceManager = system.getGameInstanceManager();
		
		/**********************************************************************/
		/*             on the game instance creator node                      */
		/**********************************************************************/
		// on the game instance creator node, only the instanceadminaccountUId
		// is available :
		AccountUId instanceAdminAccountUId = logonmanager.getUserAccountUId(
					gameInstanceAdminToken);
				
		Properties gameInstanceProperties = new Properties();
		

		assert(rightsManager.hasAccountGameInstanceCreationRights(
						logonmanager.getUserAccountUId(gameInstanceCreator), 
						gameuid));
		
		GameInstanceUId gameinstanceuid= null;
		 

		gameinstanceuid = instanceManager.createGameInstance(gameuid,
												gameInstanceCreator,
												instanceAdminAccountUId, 
												gameInstanceProperties);
		
		/**********************************************************************/

		
		/**********************************************************************/
		/*             on the game instance admin node                        */
		/**********************************************************************/
		 GameInstance gamecontroller = instanceManager.getGameInstance(
				 gameinstanceuid, 
				 gameInstanceAdminToken);
		 
		 // on the game instance admin node, the token of the game creator is
		 // not available :
		 AccountUId instanceCreatorAccountUId = 
			 logonmanager.getUserAccountUId(gameInstanceCreator); 
		 
		gamecontroller.addPlayer(gameInstanceAdminToken, 
							instanceCreatorAccountUId);

		gamecontroller.start(gameInstanceAdminToken);
		/**********************************************************************/
	}
	
}
