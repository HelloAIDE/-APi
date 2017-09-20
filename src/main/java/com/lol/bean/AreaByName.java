package com.lol.bean;

import java.util.HashMap;
import java.util.Map;
/**
 * 大区ID对应名称
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:34:04 
 * @version 1.0
 */
public class AreaByName {
	private Map<String,String> area;
	public AreaByName() {
		area = new HashMap<String, String>();
		area.put("1", "艾欧尼亚");
		area.put("2", "比尔吉沃特");
		area.put("3", "祖安");
		area.put("4", "洛克萨斯");
		area.put("5", "班德尔城");
		area.put("6", "德玛西亚");
		area.put("7", "皮尔特沃夫");
		area.put("8", "战争学院");
		area.put("9", "弗雷尔卓德");
		area.put("10", "巨神峰");
		area.put("11", "雷瑟守备");
		area.put("12", "无畏先锋");
		area.put("13", "裁决之地");
		area.put("14", "黑色玫瑰");
		area.put("15", "暗影岛");
		area.put("16", "恕瑞玛");
		area.put("17", "钢铁烈阳");
		area.put("18", "水晶之恒");
		area.put("19", "均衡教派");
		area.put("20", "扭曲丛林");
		area.put("21", "教育网专区");
		area.put("22", "影流");
		area.put("23", "守望之海");
		area.put("24", "征服之海");
		area.put("25", "卡拉曼达");
		area.put("26", "巨龙之巢");
		area.put("27", "皮城警备");
		area.put("28", "未知大区");
		area.put("29", "未知大区");
		area.put("30", "男爵领域");
	}
	public Map<String, String> getArea() {
		return area;
	}
}
