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

public interface GameInstance {
	GameUId 			getGameUId();
	GameInstanceUId 	getGameInstanceUId();
	Properties 			getGameInstanceProperties(
												RevocableToken requesterToken);
	
	void 				addGameInstanceManagementEventListener(
												GameInstanceListener listener);
	void 				removeGameInstanceManagementEventListener(
												GameInstanceListener listener);

	void 				addPlayer(RevocableToken instanceAdmin, 
								AccountUId accountOfthePlayer)
									throws 	RevokedTokenException,
											InvalidAccountUIdException,
											InsufficientRightsException,
											GameManagementException;
	
	void 				removePlayer(RevocableToken instanceAdmin, 
									AccountUId accountOfthePlayer)
									throws 	RevokedTokenException,
											InvalidAccountUIdException,
											InsufficientRightsException,
											GameManagementException;

	List<AccountUId> 	getPlayers(RevocableToken requesterToken)
								throws 	RevokedTokenException,
										InsufficientRightsException;
	
	boolean 			isStarted(RevocableToken requesterToken)
								throws 	RevokedTokenException,
										InsufficientRightsException;
	
	boolean 			isStopped(RevocableToken requesterToken)
								throws 	RevokedTokenException,
										InsufficientRightsException;
	
	boolean 			isPaused(RevocableToken requesterToken)
								throws 	RevokedTokenException,
										InsufficientRightsException;
	
	void 				start(RevocableToken requesterToken)
								throws 	RevokedTokenException,
										InsufficientRightsException;
	
	void 				pause(RevocableToken requesterToken)
								throws 	RevokedTokenException,
										InsufficientRightsException;
	
	void 				stop(RevocableToken requesterToken)
								throws 	RevokedTokenException,
										InsufficientRightsException;
	
	void				releaseResources(RevocableToken requesterToken)
								throws 	RevokedTokenException,
										InsufficientRightsException;
	
	boolean 			haveResourcesBeenReleased(RevocableToken requesterToken)
								throws 	RevokedTokenException,
										InsufficientRightsException;
}
