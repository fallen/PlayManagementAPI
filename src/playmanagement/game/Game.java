package playmanagement.game;

import java.util.Properties;

public interface Game {
	Properties getGameDescription();	
	GameUId getGameUId();
	GameInstancesManager getInstancesManager();
}
