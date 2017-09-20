package com.lol.empty;

import java.util.Arrays;
/**
 * 比赛记录详情实体类
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:46:31 
 * @version 1.0
 */
public class GameDetailDataBattle {
	/**
	 * 大区id
	 */
	private int area_id;
	/**
	 * 地图id
	 */
	private int battle_map;
	/**
	 * 游戏时间 单位-秒
	 * 
	 */
	private int duration;
	/**
	 * 英雄属性数
	 */
	private int ext1_num;
	/**
	 * 英雄属性列表 预留属性
	 */
	private ExtList[] ext1_list;
	/**
	 * 对局id
	 */
	private long game_id;
	/**
	 * 类似模式id(未知)
	 */
	private int game_mode;
	/**
	 *	游戏类型id
	 */
	private int game_type;
	/**
	 * 对局人数
	 */
	private int gamer_num;
	/**
	 * 对局玩家详情预留属性
	 */
	private Gamer[] gamer_records;
	/**
	 * 对局开始时间
	 */
	private String start_time;
	/**
	 * 对局结束时间
	 */
	private String stop_time;
	/**
	 * 红方击杀小龙数
	 */
	private int team100_killed_baron_num;
	/**
	 * 红方击杀大龙数
	 */
	private int team100_killed_dragon_num;
	/**
	 * 蓝方击杀小龙数
	 */
	private int team200_killed_baron_num;
	public int getArea_id() {
		return area_id;
	}
	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}
	public int getBattle_map() {
		return battle_map;
	}
	public void setBattle_map(int battle_map) {
		this.battle_map = battle_map;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getExt1_num() {
		return ext1_num;
	}
	public void setExt1_num(int ext1_num) {
		this.ext1_num = ext1_num;
	}
	public ExtList[] getExt1_list() {
		return ext1_list;
	}
	public void setExt1_list(ExtList[] ext1_list) {
		this.ext1_list = ext1_list;
	}
	
	public long getGame_id() {
		return game_id;
	}
	public void setGame_id(long game_id) {
		this.game_id = game_id;
	}
	public int getGame_mode() {
		return game_mode;
	}
	public void setGame_mode(int game_mode) {
		this.game_mode = game_mode;
	}
	public int getGame_type() {
		return game_type;
	}
	public void setGame_type(int game_type) {
		this.game_type = game_type;
	}
	public int getGamer_num() {
		return gamer_num;
	}
	public void setGamer_num(int gamer_num) {
		this.gamer_num = gamer_num;
	}
	public Gamer[] getGamer_records() {
		return gamer_records;
	}
	public void setGamer_records(Gamer[] gamer_records) {
		this.gamer_records = gamer_records;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getStop_time() {
		return stop_time;
	}
	public void setStop_time(String stop_time) {
		this.stop_time = stop_time;
	}
	public int getTeam100_killed_baron_num() {
		return team100_killed_baron_num;
	}
	public void setTeam100_killed_baron_num(int team100_killed_baron_num) {
		this.team100_killed_baron_num = team100_killed_baron_num;
	}
	public int getTeam100_killed_dragon_num() {
		return team100_killed_dragon_num;
	}
	public void setTeam100_killed_dragon_num(int team100_killed_dragon_num) {
		this.team100_killed_dragon_num = team100_killed_dragon_num;
	}
	public int getTeam200_killed_baron_num() {
		return team200_killed_baron_num;
	}
	public void setTeam200_killed_baron_num(int team200_killed_baron_num) {
		this.team200_killed_baron_num = team200_killed_baron_num;
	}
	@Override
	public String toString() {
		return "GameDetailDataBattle [area_id=" + area_id + ", battle_map=" + battle_map + ", duration=" + duration
				+ ", ext1_num=" + ext1_num + ", ext1_list=" + Arrays.toString(ext1_list) + ", game_id=" + game_id
				+ ", game_mode=" + game_mode + ", game_type=" + game_type + ", gamer_num=" + gamer_num
				+ ", gamer_records=" + Arrays.toString(gamer_records) + ", start_time=" + start_time + ", stop_time="
				+ stop_time + ", team100_killed_baron_num=" + team100_killed_baron_num + ", team100_killed_dragon_num="
				+ team100_killed_dragon_num + ", team200_killed_baron_num=" + team200_killed_baron_num + "]";
	}
	public GameDetailDataBattle(int area_id, int battle_map, int duration, int ext1_num, ExtList[] ext1_list,
			long game_id, int game_mode, int game_type, int gamer_num, Gamer[] gamer_records, String start_time,
			String stop_time, int team100_killed_baron_num, int team100_killed_dragon_num,
			int team200_killed_baron_num) {
		super();
		this.area_id = area_id;
		this.battle_map = battle_map;
		this.duration = duration;
		this.ext1_num = ext1_num;
		this.ext1_list = ext1_list;
		this.game_id = game_id;
		this.game_mode = game_mode;
		this.game_type = game_type;
		this.gamer_num = gamer_num;
		this.gamer_records = gamer_records;
		this.start_time = start_time;
		this.stop_time = stop_time;
		this.team100_killed_baron_num = team100_killed_baron_num;
		this.team100_killed_dragon_num = team100_killed_dragon_num;
		this.team200_killed_baron_num = team200_killed_baron_num;
	}
	
	
	
}
