package playmanagement.user;


/**
 * 
 * The unique (in time and space) id given by the system to a user when he
 * logs in to his account.
 * 
 * @author alain ozanne
 *
 */
public interface RevocableToken {
	boolean isRevoked();
	void setTimeOut(long nbrOfSecondsOfValidity);
}
