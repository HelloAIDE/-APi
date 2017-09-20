package com.lol.empty;


public class UserExtInfoDataItemsFullId {
	private String qquin;
    private int area_id;
	
    
    public UserExtInfoDataItemsFullId(String qquin, int area_id) {
		super();
		this.qquin = qquin;
		this.area_id = area_id;
	}

	@Override
	public String toString() {
		return "UserExtInfoDataItemsFullId [qquin=" + qquin + ", area_id=" + area_id + "]";
	}

	public String getQquin() {
		return qquin;
	}

	public void setQquin(String qquin) {
		this.qquin = qquin;
	}

	public int getArea_id() {
		return area_id;
	}

	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}

	public UserExtInfoDataItemsFullId() {
		// TODO Auto-generated constructor stub
	}
}
