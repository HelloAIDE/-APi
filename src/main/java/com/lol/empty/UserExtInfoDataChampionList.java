package com.lol.empty;

public class UserExtInfoDataChampionList {
	private String qquin;
	private int area_id;
	private int champion_id;
	private int use_num;
	private String last_use_time;
	private int win_num;
	private int used_exp_value;
	private int wins_plus;
	private int reserved2;
	private int champion_global_avg;
	public UserExtInfoDataChampionList() {
		// TODO Auto-generated constructor stub
	}public UserExtInfoDataChampionList(String qquin, int area_id, int champion_id, int use_num, String last_use_time,
			int win_num, int used_exp_value, int wins_plus, int reserved2, int champion_global_avg) {
		super();
		this.qquin = qquin;
		this.area_id = area_id;
		this.champion_id = champion_id;
		this.use_num = use_num;
		this.last_use_time = last_use_time;
		this.win_num = win_num;
		this.used_exp_value = used_exp_value;
		this.wins_plus = wins_plus;
		this.reserved2 = reserved2;
		this.champion_global_avg = champion_global_avg;
	}
	@Override
	public String toString() {
		return "UserExtInfoDataChampionList [qquin=" + qquin + ", area_id=" + area_id + ", champion_id=" + champion_id
				+ ", use_num=" + use_num + ", last_use_time=" + last_use_time + ", win_num=" + win_num
				+ ", used_exp_value=" + used_exp_value + ", wins_plus=" + wins_plus + ", reserved2=" + reserved2
				+ ", champion_global_avg=" + champion_global_avg + "]";
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
	public int getChampion_id() {
		return champion_id;
	}
	public void setChampion_id(int champion_id) {
		this.champion_id = champion_id;
	}
	public int getUse_num() {
		return use_num;
	}
	public void setUse_num(int use_num) {
		this.use_num = use_num;
	}
	public String getLast_use_time() {
		return last_use_time;
	}
	public void setLast_use_time(String last_use_time) {
		this.last_use_time = last_use_time;
	}
	public int getWin_num() {
		return win_num;
	}
	public void setWin_num(int win_num) {
		this.win_num = win_num;
	}
	public int getUsed_exp_value() {
		return used_exp_value;
	}
	public void setUsed_exp_value(int used_exp_value) {
		this.used_exp_value = used_exp_value;
	}
	public int getWins_plus() {
		return wins_plus;
	}
	public void setWins_plus(int wins_plus) {
		this.wins_plus = wins_plus;
	}
	public int getReserved2() {
		return reserved2;
	}
	public void setReserved2(int reserved2) {
		this.reserved2 = reserved2;
	}
	public int getChampion_global_avg() {
		return champion_global_avg;
	}
	public void setChampion_global_avg(int champion_global_avg) {
		this.champion_global_avg = champion_global_avg;
	}
}
