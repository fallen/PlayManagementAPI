package playmanagement.gameroom;

import java.util.List;
import java.util.Properties;

import playmanagement.gameroom.exceptions.GameRoomManagementException;
import playmanagement.rights.exceptions.InsufficientRightsException;
import playmanagement.user.AccountUId;
import playmanagement.user.RevocableToken;
import playmanagement.user.exceptions.RevokedTokenException;

public interface GameRoom {
	GameRoomUId getGameRoomUId();	
	
	void enter(RevocableToken requesterToken, 
				AccountUId enteringPlayerAccountUId)
	throws 	InsufficientRightsException, 
			RevokedTokenException,
			GameRoomManagementException;
	
	void leave(RevocableToken requesterToken, 
				AccountUId leavingPlayerAccountUId)
	throws 	InsufficientRightsException, 
			RevokedTokenException,
			GameRoomManagementException;
	
	// ------------------------------------------------------------------
	List<AccountUId> getGameRoomPopulation(RevocableToken roomAdminToken)
	throws 	InsufficientRightsException, 
			RevokedTokenException,
			GameRoomManagementException;
	
	boolean isIn(RevocableToken requesterToken, 
					AccountUId enteringPlayerAccountUId)
	throws 	InsufficientRightsException, 
			RevokedTokenException;
	
	Properties getRoomProperties(RevocableToken roomAdminToken)
	throws 	InsufficientRightsException, 
			RevokedTokenException;
	
	void    addManagementEventListener(GameRoomListener listener);
	void 	removeManagementEventListener(GameRoomListener listener);
}
