package com.lol.empty;
/**
 * 角色大区实体类
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:50:33 
 * @version 1.0
 */
public class UserArea {
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
	private int icon;
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
	public UserArea() {
	}
	public UserArea(int area_id, String qquin, int icon, String name, int level, int tier, int queue, int win_point) {
		super();
		this.area_id = area_id;
		this.qquin = qquin;
		this.icon = icon;
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

	public int getIcon() {
		return icon;
	}

	public void setIcon(int icon) {
		this.icon = icon;
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
		return "UserArea [area_id=" + area_id + ", qquin=" + qquin + ", icon=" + icon + ", name=" + name
				+ ", level=" + level + ", tier=" + tier + ", queue=" + queue + ", win_point=" + win_point + "]";
	}
	
	
	
}
