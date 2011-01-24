package implement;

import org.jgroups.ChannelException;
import org.jgroups.JChannel;

import playmanagement.game.GamesManager;
import playmanagement.game.instance.GamesInstancesManager;
import playmanagement.gameroom.GameRoomsManager;
import playmanagement.rights.RightsManager;
import playmanagement.system.PlayManagementSystem;
import playmanagement.user.AccountManager;
import playmanagement.user.LogonManager;

public class System implements PlayManagementSystem {

	public JChannel Channel;
	public String JGroupsConfigFile = "udp.xml";
	public String SignalingChannelName = "Signaling";
	public UserManager AccountManager;
	
	public System() throws ChannelException {
		Channel = new JChannel(JGroupsConfigFile);
		Channel.connect(SignalingChannelName);
	}
	
	@Override
	public AccountManager getAccountManager() {
		// TODO Auto-generated method stub
		return AccountManager;
	}

	@Override
	public GamesInstancesManager getGameInstanceManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameRoomsManager getGameRoomsManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GamesManager getGamesManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LogonManager getLogonManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RightsManager getRightsManager() {
		// TODO Auto-generated method stub
		return null;
	}

}
