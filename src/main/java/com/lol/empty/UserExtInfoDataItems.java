package com.lol.empty;


public class UserExtInfoDataItems {
	private UserExtInfoDataItemsFullId full_id;
	private UserExtInfoDataItemsRecentPosition recent_position;
	private UserExtInfoDataItemsRecentKda recent_kda;

	public UserExtInfoDataItems(UserExtInfoDataItemsFullId full_id, UserExtInfoDataItemsRecentPosition recent_position,
			UserExtInfoDataItemsRecentKda recent_kda) {
		super();
		this.full_id = full_id;
		this.recent_position = recent_position;
		this.recent_kda = recent_kda;
	}

	@Override
	public String toString() {
		return "UserExtInfoDataItems [full_id=" + full_id + ", recent_position=" + recent_position + ", recent_kda="
				+ recent_kda + "]";
	}

	public UserExtInfoDataItemsFullId getFull_id() {
		return full_id;
	}

	public void setFull_id(UserExtInfoDataItemsFullId full_id) {
		this.full_id = full_id;
	}

	public UserExtInfoDataItemsRecentPosition getRecent_position() {
		return recent_position;
	}

	public void setRecent_position(UserExtInfoDataItemsRecentPosition recent_position) {
		this.recent_position = recent_position;
	}

	public UserExtInfoDataItemsRecentKda getRecent_kda() {
		return recent_kda;
	}

	public void setRecent_kda(UserExtInfoDataItemsRecentKda recent_kda) {
		this.recent_kda = recent_kda;
	}

	public UserExtInfoDataItems() {
	}

}
