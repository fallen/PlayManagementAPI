package implement;

public class Token {
	
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
	
	

}
