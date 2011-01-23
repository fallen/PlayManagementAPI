package playmanagement.user;


/**
 * 
 * The unique (in time and space) id given by the system to a user account. 
 * 
 * @author alain ozanne
 *
 */
public interface AccountUId {
	boolean isEqualTo(AccountUId accountUid);
}
