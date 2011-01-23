package playmanagement.user;

/**
 * 
 * This interface manages the logon of the user. An user obtains a token when
 * he logged through this interface to the system. The token is meant to be private
 * and local to the node. If a user wants to communicate his id he should send
 * his account uid.
 * 
 * The token is revoked when the user logs out, or if the system detects a problem
 * in the user's node behavior. 
 * 
 * The revocation of a token is not the same thing as the logout :
 * - the revocation concerns only the token
 * - the logout concerns the account
 * 
 * The interest of revocation is when the token is given, by the node, 
 * to a local client game code to let it access some system resources as if it was
 * the node.
 * If the client game code doesn't use the token properly the node can revoke the
 * token, but the account is still logged in.
 * 
 * @author alain ozanne
 *
 */


public interface LogonManager {	
	
	AccountUId getUserAccountUId(RevocableToken token);
	
	RevocableToken login(String login, String pwd);
	
	void logout(RevocableToken usertoken);		
}
