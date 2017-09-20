package com.lol.bean;

import java.util.HashMap;
import java.util.Map;
/**
 * 游戏类型id对应名称
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:46:44 
 * @version 1.0
 */
public class GameType {
	/**
	 * 游戏类型存储在该Map中
	 */
	private Map<String,String> gameType;
	public GameType() {
		gameType = new HashMap<String, String>();
		// TODO Auto-generated constructor stub
		gameType.put("1", "匹配赛");
		gameType.put("2", "人机");
		gameType.put("4", "排位赛");
		gameType.put("5", "灵活组排");
		gameType.put("6", "大乱斗");
		gameType.put("7", "匹配3v3");
		gameType.put("8", "自定义");
		gameType.put("17", "飞升赛");
		gameType.put("24", "无限乱斗");
		gameType.put("26", "血月杀");
		gameType.put("27", "重开局");
	}
	/**
	 * 返回Map对象
	 * @return
	 */
	public Map<String, String> getGameType() {
		return gameType;
	}
}
