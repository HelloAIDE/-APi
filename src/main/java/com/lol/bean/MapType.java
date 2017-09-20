package com.lol.bean;

import java.util.HashMap;
import java.util.Map;
/**
 * 地图类型id对应名称
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:48:04 
 * @version 1.0
 */
public class MapType {
	private Map<String,String> mapType;
	public MapType() {
		mapType = new HashMap<String, String>();
		// TODO Auto-generated constructor stub
		mapType.put("10", "扭曲丛林");
		mapType.put("11", "召唤师峡谷");
		mapType.put("12", "嚎哭深渊");
	}
	public Map<String, String> getMapType() {
		return mapType;
	}
}
