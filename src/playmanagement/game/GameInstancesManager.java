package playmanagement.game;

import java.util.List;
import java.util.Properties;

import playmanagement.game.exceptions.GameManagementException;
import playmanagement.game.instance.GameInstance;
import playmanagement.game.instance.GameInstanceUId;
import playmanagement.rights.exceptions.InsufficientRightsException;
import playmanagement.user.AccountUId;
import playmanagement.user.RevocableToken;
import playmanagement.user.exceptions.InvalidAccountUIdException;
import playmanagement.user.exceptions.RevokedTokenException;

public interface GameInstancesManager {
	GameInstanceUId createGameInstance(
										RevocableToken gameInstanceCreator,
										AccountUId gameInstanceAdminAccountUId,
										Properties gameInstanceProperties)
	throws RevokedTokenException, 
			InvalidAccountUIdException,
			GameManagementException;
	
	
	void deleteGameInstance(RevocableToken requesterToken , 
								GameInstanceUId gameInstanceUId)
	throws RevokedTokenException, GameManagementException;
	
	
	List<GameInstanceUId> getGameInstances(RevocableToken requesterToken)
	throws 	GameManagementException,
			InsufficientRightsException,
			RevokedTokenException;
	
	
	GameInstance getGameInstance(RevocableToken gameInstanceAdminToken, 
								GameInstanceUId gameInstanceUId)
	throws 	GameManagementException,
			InsufficientRightsException,
			RevokedTokenException;
}
