package com.lol.bean;

import java.util.HashMap;
import java.util.Map;
/**
 * 战斗标签对应名字
 * @author  BigNiu 
 * @date 创建时间：2017年6月1日 下午4:14:03 
 * @version 1.0
 */
public class TagByName {
	/**
	 * 游戏类型存储在该Map中
	 */
	private Map<String,String> tagName;
	public TagByName() {
		tagName = new HashMap<String, String>();
		// TODO Auto-generated constructor stub
		tagName.put("1", "杀人最多不服来辩");
		tagName.put("2", "助攻最多请叫我雷锋");
		tagName.put("3", "打钱最多堪比土豪");
		tagName.put("4", "逃跑什么的最讨厌了");
		tagName.put("5", "可喜可贺三杀");
		tagName.put("6", "奔走相告四杀");
		tagName.put("7", "普天同庆杀");
		tagName.put("8", "连杀超过8个，超神");
		tagName.put("9", "补兵根本停不下来");
		tagName.put("10", "不推塔最多不服星人");
		tagName.put("11", "抗最多伤害的坦克爸爸");
		tagName.put("12", "对英雄伤害最多show全场");
		
	}
	/**
	 * 返回Map对象
	 * @return
	 */
	public Map<String, String> getTagName() {
		return tagName;
	}
}
