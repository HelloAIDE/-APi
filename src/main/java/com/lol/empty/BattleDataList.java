package com.lol.empty;
/**
 * 比赛记录
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:43:24 
 * @version 1.0
 */
public class BattleDataList {
	/**
	 * 地图类型
	 */
	private int battle_map;
	/**
	 * 游戏时长
	 */
	private String battle_time;
	/**
	 * 英雄ID
	 */
	private int champion_id;
	/**
	 * 扩展状态
	 */
	private int ext_flag;
	/**
	 * 评价
	 */
	private int flag;
	/**
	 * 游戏id
	 */
	private long game_id;
	/**
	 * 暂无说明
	 */
	private int game_mode;
	/**
	 * 游戏模式 27-重开
	 */
	private int game_type;
	/**
	 * 胜负类型 1-胜利 2-失败 
	 */
	private int win;
	public int getBattle_map() {
		return battle_map;
	}
	public void setBattle_map(int battle_map) {
		this.battle_map = battle_map;
	}
	public String getBattle_time() {
		return battle_time;
	}
	public void setBattle_time(String battle_time) {
		this.battle_time = battle_time;
	}
	public int getChampion_id() {
		return champion_id;
	}
	public void setChampion_id(int champion_id) {
		this.champion_id = champion_id;
	}
	public int getExt_flag() {
		return ext_flag;
	}
	public void setExt_flag(int ext_flag) {
		this.ext_flag = ext_flag;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
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
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public long getGame_id() {
		return game_id;
	}
	public void setGame_id(long game_id) {
		this.game_id = game_id;
	}
	@Override
	public String toString() {
		return "BattleDataList [battle_map=" + battle_map + ", battle_time=" + battle_time + ", champion_id="
				+ champion_id + ", ext_flag=" + ext_flag + ", flag=" + flag + ", game_id=" + game_id + ", game_mode="
				+ game_mode + ", game_type=" + game_type + ", win=" + win + "]";
	}
	public BattleDataList(int battle_map, String battle_time, int champion_id, int ext_flag, int flag, long game_id,
			int game_mode, int game_type, int win) {
		super();
		this.battle_map = battle_map;
		this.battle_time = battle_time;
		this.champion_id = champion_id;
		this.ext_flag = ext_flag;
		this.flag = flag;
		this.game_id = game_id;
		this.game_mode = game_mode;
		this.game_type = game_type;
		this.win = win;
	}
	
	
	
}
