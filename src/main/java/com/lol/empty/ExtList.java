package com.lol.empty;

import java.util.Arrays;

/**
 * 单个英雄属性
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:45:31 
 * @version 1.0
 */
public class ExtList {
	/**
	 * 护甲值
	 */
	private int armor;
	/**
	 * 攻击力
	 */
	private int attack;
	/**
	 * 攻速
	 */
	private int attack_speed;
	/**
	 * 冷却时间 （负数）
	 */
	private int cd_ratio;
	/**
	 * 英雄熟练度
	 */
	private int champion_used_exp;
	/**
	 * 暴击率
	 */
	private int crit;
	/**
	 * 法强
	 */
	private int magic;
	/**
	 * 魔抗
	 */
	private int magic_resist;
	/**
	 * 移动速度
	 */
	private int move_speed;
	/**
	 * 胜点
	 */
	private int win_point;
	/**
	 * 段位名称 5-青铜 4
	 */
	private int tier;
	/**
	 * 段位数  4 （以0开始，4表示青铜5）
	 */
	private int queue;
	/**
	 * 死亡分析
	 */
	private DeathCategory[]  death_category;
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getAttack_speed() {
		return attack_speed;
	}
	public void setAttack_speed(int attack_speed) {
		this.attack_speed = attack_speed;
	}
	public int getCd_ratio() {
		return cd_ratio;
	}
	public void setCd_ratio(int cd_ratio) {
		this.cd_ratio = cd_ratio;
	}
	public int getChampion_used_exp() {
		return champion_used_exp;
	}
	public void setChampion_used_exp(int champion_used_exp) {
		this.champion_used_exp = champion_used_exp;
	}
	public int getCrit() {
		return crit;
	}
	public void setCrit(int crit) {
		this.crit = crit;
	}
	public int getMagic() {
		return magic;
	}
	public void setMagic(int magic) {
		this.magic = magic;
	}
	public int getMagic_resist() {
		return magic_resist;
	}
	public void setMagic_resist(int magic_resist) {
		this.magic_resist = magic_resist;
	}
	public int getMove_speed() {
		return move_speed;
	}
	public void setMove_speed(int move_speed) {
		this.move_speed = move_speed;
	}
	public int getWin_point() {
		return win_point;
	}
	public void setWin_point(int win_point) {
		this.win_point = win_point;
	}
	public int getTier() {
		return tier;
	}
	public void setTier(int tier) {
		this.tier = tier;
	}
	public int getQueue() {
		return queue;
	}
	public void setQueue(int queue) {
		this.queue = queue;
	}
	public DeathCategory[] getDeath_category() {
		return death_category;
	}
	public void setDeath_category(DeathCategory[] death_category) {
		this.death_category = death_category;
	}
	public ExtList(int armor, int attack, int attack_speed, int cd_ratio, int champion_used_exp, int crit, int magic,
			int magic_resist, int move_speed, int win_point, int tier, int queue, DeathCategory[] death_category) {
		super();
		this.armor = armor;
		this.attack = attack;
		this.attack_speed = attack_speed;
		this.cd_ratio = cd_ratio;
		this.champion_used_exp = champion_used_exp;
		this.crit = crit;
		this.magic = magic;
		this.magic_resist = magic_resist;
		this.move_speed = move_speed;
		this.win_point = win_point;
		this.tier = tier;
		this.queue = queue;
		this.death_category = death_category;
	}
	@Override
	public String toString() {
		return "ExtList [armor=" + armor + ", attack=" + attack + ", attack_speed=" + attack_speed + ", cd_ratio="
				+ cd_ratio + ", champion_used_exp=" + champion_used_exp + ", crit=" + crit + ", magic=" + magic
				+ ", magic_resist=" + magic_resist + ", move_speed=" + move_speed + ", win_point=" + win_point
				+ ", tier=" + tier + ", queue=" + queue + ", death_category=" + Arrays.toString(death_category) + "]";
	}
}
