package com.lol.empty;
/**
 * 死亡分析
 * @author Administrator
 *
 */
public class DeathCategory {
	/**
	 * 本局玩家ID
	 */
	private int sum_id;
	/**
	 * 被击杀数
	 */
	private int death_num;
	@Override
	public String toString() {
		return "DeathCategory [sum_id=" + sum_id + ", death_num=" + death_num + "]";
	}
	public DeathCategory(int sum_id, int death_num) {
		super();
		this.sum_id = sum_id;
		this.death_num = death_num;
	}
	public int getSum_id() {
		return sum_id;
	}
	public void setSum_id(int sum_id) {
		this.sum_id = sum_id;
	}
	public int getDeath_num() {
		return death_num;
	}
	public void setDeath_num(int death_num) {
		this.death_num = death_num;
	}
}
