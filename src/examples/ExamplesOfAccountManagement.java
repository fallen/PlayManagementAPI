package examples;

import playmanagement.user.AccountManager;
import playmanagement.user.AccountUId;
import playmanagement.user.LogonManager;
import playmanagement.user.RevocableToken;
import examples.resources.PlayManagementSystemImpl;

public class ExamplesOfAccountManagement {
	
	public void accountCreation(String loginName, String loginpwd, 
			RevocableToken admintokenfortest) throws Exception {
		AccountManager accountmanager = 
			new PlayManagementSystemImpl().getAccountManager();
		
		AccountUId accountuid;
		accountuid = accountmanager.createAccount(loginName,
													loginpwd);
			
		// NB : on a player node, the admin token is not available !
		assert(accountmanager.getAccountUIdList(
				admintokenfortest).contains(accountuid));
	}
	
	
	public boolean accountDeletion(AccountUId accountuid, 
									RevocableToken usertoken, 
									RevocableToken admintokenfortest) 
									throws Exception {
		PlayManagementSystemImpl system = new PlayManagementSystemImpl(); 
		
		AccountManager accountmanager = system.getAccountManager();
		LogonManager logonmanager = system.getLogonManager();
		
		if (usertoken.isRevoked()) {
			System.out.println("the user token is not valid.");
			return false;
		}
		
		if (!logonmanager.getUserAccountUId(usertoken).equals(accountuid)) {
			System.out.println("the user requesting the deletion " +
					"if not the owner of the account");
			return false;
		}		

		accountmanager.deleteAccount(usertoken, accountuid);
		
		// NB : on a player node, the admin token is not available !
		assert(!accountmanager.getAccountUIdList(
				admintokenfortest).contains(accountuid));
					
		return true;
	}
	
	
}
