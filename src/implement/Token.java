package implement;

import playmanagement.user.RevocableToken;

public class Token implements RevocableToken {
	
	private boolean isLife;
	private Long timeToLive;
	
	public boolean isLife() {
		return isLife;
	}
	public void setLife(boolean isLife) {
		this.isLife = isLife;
	}
	public Long getTimeToLive() {
		return timeToLive;
	}
	public void setTimeToLive(Long timeToLive) {
		this.timeToLive = timeToLive;
	}
	public Token() {
		this.isLife = false;
		this.timeToLive = Long.valueOf(0);
	}
	@Override
	public boolean isRevoked() {
		return !this.isLife;
	}
	@Override
	public void setTimeOut(long nbrOfSecondsOfValidity) {
		this.timeToLive = Long.valueOf(nbrOfSecondsOfValidity);
	}
	
	

}
