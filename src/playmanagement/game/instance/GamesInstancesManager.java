package playmanagement.game.instance;

import java.util.List;
import java.util.Properties;

import playmanagement.game.GameUId;
import playmanagement.game.exceptions.GameManagementException;
import playmanagement.rights.exceptions.InsufficientRightsException;
import playmanagement.user.AccountUId;
import playmanagement.user.RevocableToken;
import playmanagement.user.exceptions.InvalidAccountUIdException;
import playmanagement.user.exceptions.RevokedTokenException;

public interface GamesInstancesManager {
	GameInstanceUId createGameInstance(
										GameUId gameUId,
										RevocableToken gameInstanceCreator,
										AccountUId gameInstanceAdminAccountUId,
										Properties gameInstanceProperties)
	throws RevokedTokenException, 
			InvalidAccountUIdException,
			GameManagementException;

	
	void deleteGameInstance(GameInstanceUId gameinstanceuid, 
							RevocableToken requesterToken)
	throws RevokedTokenException, GameManagementException;

	
	List<GameInstanceUId> getGameInstances(GameUId gameUId,
											RevocableToken requesterToken)
	throws 	GameManagementException,
			InsufficientRightsException,
			RevokedTokenException;
	
	
	GameInstance getGameInstance(GameInstanceUId gameInstanceUId,
			 						RevocableToken gameInstanceAdminToken)
	throws 	GameManagementException,
			InsufficientRightsException,
			RevokedTokenException;
}
