package com.lol.bean;

import java.util.HashMap;
import java.util.Map;
/**
 * 段位id对应名称
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:50:17 
 * @version 1.0
 */
public class TierType {
	private Map<String,String> tier;
	public TierType() {
		tier = new HashMap<String, String>();
		// TODO Auto-generated constructor stub
		tier.put("6", "超凡大师");
		tier.put("5", "青铜");
		tier.put("4", "白银");
		tier.put("3", "黄金");
		tier.put("2", "铂金");
		tier.put("1", "钻石");
		tier.put("0", "最强王者");
		tier.put("255", "无段位");
	}
	public Map<String, String> getTier() {
		return tier;
	}
}
