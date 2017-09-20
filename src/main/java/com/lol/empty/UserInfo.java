package com.lol.empty;
/**
 * 角色大区实体类
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:50:33 
 * @version 1.0
 */
public class UserInfo {
	/**
	 * 大区ID
	 */
	private int area_id;
	/**
	 * 用户唯一码
	 */
	private String qquin;
	/**
	 * 用户头像
	 */
	private int icon_id;
	/**
	 * 用户昵称
	 */
	private String name;
	/**
	 * 级别
	 */
	private int level;
	/**
	 * 段位：青铜
	 */
	private int tier;
	/**
	 * 段位数：4  - 表示青铜5
	 */
	private int queue;
	/**
	 * 胜点
	 */
	private int win_point;
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}
	public UserInfo(int area_id, String qquin, int icon_id, String name, int level, int tier, int queue,
			int win_point) {
		super();
		this.area_id = area_id;
		this.qquin = qquin;
		this.icon_id = icon_id;
		this.name = name;
		this.level = level;
		this.tier = tier;
		this.queue = queue;
		this.win_point = win_point;
	}

	public int getArea_id() {
		return area_id;
	}

	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}

	public String getQquin() {
		return qquin;
	}

	public void setQquin(String qquin) {
		this.qquin = qquin;
	}

	public int getIcon_id() {
		return icon_id;
	}

	public void setIcon_id(int icon_id) {
		this.icon_id = icon_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getTier() {
		return tier;
	}

	public void setTier(int tier) {
		this.tier = tier;
	}

	public int getQueue() {
		return queue;
	}

	public void setQueue(int queue) {
		this.queue = queue;
	}

	public int getWin_point() {
		return win_point;
	}

	public void setWin_point(int win_point) {
		this.win_point = win_point;
	}

	@Override
	public String toString() {
		return "UserArea [area_id=" + area_id + ", qquin=" + qquin + ", icon=" + icon_id + ", name=" + name
				+ ", level=" + level + ", tier=" + tier + ", queue=" + queue + ", win_point=" + win_point + "]";
	}
	
	
	
}
