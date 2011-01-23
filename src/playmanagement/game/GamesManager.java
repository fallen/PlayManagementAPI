package playmanagement.game;

import java.util.List;

import playmanagement.game.exceptions.GameManagementException;
import playmanagement.game.instance.GameInstanceUId;
import playmanagement.rights.exceptions.InsufficientRightsException;
import playmanagement.user.RevocableToken;
import playmanagement.user.exceptions.RevokedTokenException;

public interface GamesManager {
	GameUId			registerGame(RevocableToken admintoken, String gameJarPath)
					throws 	GameManagementException,
							InsufficientRightsException,
							RevokedTokenException;
	
	GameUId 		getGameUId(GameInstanceUId instanceUId)
					throws GameManagementException;
	
	void	 		unregisterGame(RevocableToken admintoken, GameUId gameuid)
					throws 	GameManagementException,
							InsufficientRightsException,
							RevokedTokenException;
	
	List<GameUId> 	getRegisteredGamesList()
					throws 	GameManagementException;
	
	Game			getGame(GameUId gameuid)
					throws 	GameManagementException;
}
