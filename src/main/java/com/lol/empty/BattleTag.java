package com.lol.empty;

/**
 * 战斗标签
 * @author BigNiu
 * @date 创建时间：2017年3月11日 下午9:34:43
 * @version 1.0
 */
public class BattleTag {
	/**
	 * 标签名（官方为空返回，暂时预留）
	 */
	private String name;
	/**
	 * 标签id
	 */
	private int tag_id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTag_id() {
		return tag_id;
	}

	public void setTag_id(int tag_id) {
		this.tag_id = tag_id;
	}

	public BattleTag(String name, int tag_id) {
		super();
		this.name = name;
		this.tag_id = tag_id;
	}

	@Override
	public String toString() {
		return "Battle [name=" + name + ", tag_id=" + tag_id + "]";
	}

}
