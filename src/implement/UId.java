package implement;

import playmanagement.game.GameUId;
import playmanagement.game.instance.GameInstanceUId;
import playmanagement.user.AccountUId;

public class UId implements AccountUId, GameInstanceUId, GameUId{
	private Integer Uid;

	public Integer getUid() {
		return Uid;
	}

	public void setUid(Integer uid) {
		Uid = uid;
	}

	public UId(Integer uid) {
		Uid = uid;
	}

	@Override
	public boolean isEqualTo(AccountUId accountUid) {
		return this.Uid.equals(((UId)accountUid).getUid());
	}

	@Override
	public boolean isEqualTo(GameInstanceUId gameInstanceUid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEqualTo(GameUId gameUid) {
		// TODO Auto-generated method stub
		return false;
	}

}
