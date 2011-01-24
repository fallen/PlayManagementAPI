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
		return this.Uid.equals(((UId)gameInstanceUid).getUid());
	}

	@Override
	public boolean isEqualTo(GameUId gameUid) {
		return this.Uid.equals(((UId)gameUid).getUid());
	}

}
