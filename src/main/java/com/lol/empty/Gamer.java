package com.lol.empty;

import java.util.Arrays;

/**
 * 玩家
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:46:37 
 * @version 1.0
 */
public class Gamer {
	/**
	 * 荣耀数
	 */
	private int battle_tag_num;
	/**
	 * 荣誉列表
	 */
	private BattleTag[] battle_tag_list;
	/**
	 * 大区id
	 */
	private int area_id;
	/**
	 * QQ标识
	 */
	private String qquin;
	/**
	 * 英雄昵称
	 */
	private String name;
	/**
	 * 英雄id
	 */
	private int champion_id;
	/**
	 * 杀敌数
	 */
	private int champions_killed;
	/**
	 * 死亡
	 */
	private int num_deaths;
	/**
	 * 助攻
	 */
	private int assists;
	/**
	 * 补兵数
	 */
	private int minions_killed;
	/**
	 * 经验值
	 */
	private int exp;
	/**
	 * 胜利失败
	 */
	private int win;
	/**
	 * 评分
	 */
	private int game_score;
	/**
	 * 金钱
	 */
	private int gold_earned;
	/**
	 * 使用的金币
	 */
	private int gold_spent;
	/**
	 * 最大连杀
	 */
	private int largest_killing_spree;
	/**
	 * 最大多杀
	 */
	private int largest_multi_kill;
	/**
	 * 魔法输出伤害
	 */
	private int magic_damage_dealt_to_champions;
	/**
	 * 物理输出伤害
	 */
	private int physical_damage_dealt_to_champions;
	/**
	 * 击杀野怪数量
	 */
	private int neutral_minions_killed;
	/**
	 * 5杀次数
	 */
	private int penta_kills;
	/**
	 * 4杀次数
	 */
	private int quadra_kills;
	/**
	 * 3杀次数
	 */
	private int triple_kills;
	/**
	 * 皮肤id
	 */
	private int skin_id;
	/**
	 * 召唤师技能1 4-闪现 11-惩戒
	 */
	private int summon_spell1_id;
	/**
	 * 召唤师技能2
	 */
	private int summon_spell2_id;
	/**
	 * 超级怪物击杀
	 */
	private int super_monster_killed;
	/**
	 * 队伍id  100-红方  200-蓝方
	 */
	private int team;
	/**
	 * 输出总伤害
	 */
	private int total_damage_dealt;
	/**
	 * 给英雄造成总伤害
	 */
	private int total_damage_dealt_to_champions;
	/**
	 * 承受伤害
	 */
	private int total_damage_taken;
	/**
	 * 总治疗
	 */
	private int total_health;
	/**
	 * 推塔数
	 */
	private int turrets_killed;
	/**
	 * 反眼数
	 */
	private int ward_killed;
	/**
	 * 插眼数
	 */
	private int ward_placed;
	/**
	 * 等级
	 */
	private int level;
	/**
	 * 装备id
	 */
	private int item0;
	private int item1;
	private int item2;
	private int item3;
	private int item4;
	private int item5;
	private int item6;
	public Gamer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "Gamer [battle_tag_num=" + battle_tag_num + ", battle_tag_list="
				+ (battle_tag_list != null
						? Arrays.asList(battle_tag_list).subList(0, Math.min(battle_tag_list.length, maxLen)) : null)
				+ ", area_id=" + area_id + ", qquin=" + qquin + ", name=" + name + ", champion_id=" + champion_id
				+ ", champions_killed=" + champions_killed + ", num_deaths=" + num_deaths + ", assists=" + assists
				+ ", minions_killed=" + minions_killed + ", exp=" + exp + ", win=" + win + ", game_score=" + game_score
				+ ", gold_earned=" + gold_earned + ", gold_spent=" + gold_spent + ", largest_killing_spree="
				+ largest_killing_spree + ", largest_multi_kill=" + largest_multi_kill
				+ ", magic_damage_dealt_to_champions=" + magic_damage_dealt_to_champions
				+ ", physical_damage_dealt_to_champions=" + physical_damage_dealt_to_champions
				+ ", neutral_minions_killed=" + neutral_minions_killed + ", penta_kills=" + penta_kills
				+ ", quadra_kills=" + quadra_kills + ", triple_kills=" + triple_kills + ", skin_id=" + skin_id
				+ ", summon_spell1_id=" + summon_spell1_id + ", summon_spell2_id=" + summon_spell2_id
				+ ", super_monster_killed=" + super_monster_killed + ", team=" + team + ", total_damage_dealt="
				+ total_damage_dealt + ", total_damage_dealt_to_champions=" + total_damage_dealt_to_champions
				+ ", total_damage_taken=" + total_damage_taken + ", total_health=" + total_health + ", turrets_killed="
				+ turrets_killed + ", ward_killed=" + ward_killed + ", ward_placed=" + ward_placed + ", level=" + level
				+ ", item0=" + item0 + ", item1=" + item1 + ", item2=" + item2 + ", item3=" + item3 + ", item4=" + item4
				+ ", item5=" + item5 + ", item6=" + item6 + "]";
	}
	public int getBattle_tag_num() {
		return battle_tag_num;
	}
	public void setBattle_tag_num(int battle_tag_num) {
		this.battle_tag_num = battle_tag_num;
	}
	public BattleTag[] getBattle_tag_list() {
		return battle_tag_list;
	}
	public void setBattle_tag_list(BattleTag[] battle_tag_list) {
		this.battle_tag_list = battle_tag_list;
	}
	public int getArea_id() {
		return area_id;
	}
	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}
	public String getQquin() {
		return qquin;
	}
	public void setQquin(String qquin) {
		this.qquin = qquin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChampion_id() {
		return champion_id;
	}
	public void setChampion_id(int champion_id) {
		this.champion_id = champion_id;
	}
	public int getChampions_killed() {
		return champions_killed;
	}
	public void setChampions_killed(int champions_killed) {
		this.champions_killed = champions_killed;
	}
	public int getNum_deaths() {
		return num_deaths;
	}
	public void setNum_deaths(int num_deaths) {
		this.num_deaths = num_deaths;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	public int getMinions_killed() {
		return minions_killed;
	}
	public void setMinions_killed(int minions_killed) {
		this.minions_killed = minions_killed;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getGame_score() {
		return game_score;
	}
	public void setGame_score(int game_score) {
		this.game_score = game_score;
	}
	public int getGold_earned() {
		return gold_earned;
	}
	public void setGold_earned(int gold_earned) {
		this.gold_earned = gold_earned;
	}
	public int getGold_spent() {
		return gold_spent;
	}
	public void setGold_spent(int gold_spent) {
		this.gold_spent = gold_spent;
	}
	public int getLargest_killing_spree() {
		return largest_killing_spree;
	}
	public void setLargest_killing_spree(int largest_killing_spree) {
		this.largest_killing_spree = largest_killing_spree;
	}
	public int getLargest_multi_kill() {
		return largest_multi_kill;
	}
	public void setLargest_multi_kill(int largest_multi_kill) {
		this.largest_multi_kill = largest_multi_kill;
	}
	public int getMagic_damage_dealt_to_champions() {
		return magic_damage_dealt_to_champions;
	}
	public void setMagic_damage_dealt_to_champions(int magic_damage_dealt_to_champions) {
		this.magic_damage_dealt_to_champions = magic_damage_dealt_to_champions;
	}
	public int getPhysical_damage_dealt_to_champions() {
		return physical_damage_dealt_to_champions;
	}
	public void setPhysical_damage_dealt_to_champions(int physical_damage_dealt_to_champions) {
		this.physical_damage_dealt_to_champions = physical_damage_dealt_to_champions;
	}
	public int getNeutral_minions_killed() {
		return neutral_minions_killed;
	}
	public void setNeutral_minions_killed(int neutral_minions_killed) {
		this.neutral_minions_killed = neutral_minions_killed;
	}
	public int getPenta_kills() {
		return penta_kills;
	}
	public void setPenta_kills(int penta_kills) {
		this.penta_kills = penta_kills;
	}
	public int getQuadra_kills() {
		return quadra_kills;
	}
	public void setQuadra_kills(int quadra_kills) {
		this.quadra_kills = quadra_kills;
	}
	public int getTriple_kills() {
		return triple_kills;
	}
	public void setTriple_kills(int triple_kills) {
		this.triple_kills = triple_kills;
	}
	public int getSkin_id() {
		return skin_id;
	}
	public void setSkin_id(int skin_id) {
		this.skin_id = skin_id;
	}
	public int getSummon_spell1_id() {
		return summon_spell1_id;
	}
	public void setSummon_spell1_id(int summon_spell1_id) {
		this.summon_spell1_id = summon_spell1_id;
	}
	public int getSummon_spell2_id() {
		return summon_spell2_id;
	}
	public void setSummon_spell2_id(int summon_spell2_id) {
		this.summon_spell2_id = summon_spell2_id;
	}
	public int getSuper_monster_killed() {
		return super_monster_killed;
	}
	public void setSuper_monster_killed(int super_monster_killed) {
		this.super_monster_killed = super_monster_killed;
	}
	public int getTeam() {
		return team;
	}
	public void setTeam(int team) {
		this.team = team;
	}
	public int getTotal_damage_dealt() {
		return total_damage_dealt;
	}
	public void setTotal_damage_dealt(int total_damage_dealt) {
		this.total_damage_dealt = total_damage_dealt;
	}
	public int getTotal_damage_dealt_to_champions() {
		return total_damage_dealt_to_champions;
	}
	public void setTotal_damage_dealt_to_champions(int total_damage_dealt_to_champions) {
		this.total_damage_dealt_to_champions = total_damage_dealt_to_champions;
	}
	public int getTotal_damage_taken() {
		return total_damage_taken;
	}
	public void setTotal_damage_taken(int total_damage_taken) {
		this.total_damage_taken = total_damage_taken;
	}
	public int getTotal_health() {
		return total_health;
	}
	public void setTotal_health(int total_health) {
		this.total_health = total_health;
	}
	public int getTurrets_killed() {
		return turrets_killed;
	}
	public void setTurrets_killed(int turrets_killed) {
		this.turrets_killed = turrets_killed;
	}
	public int getWard_killed() {
		return ward_killed;
	}
	public void setWard_killed(int ward_killed) {
		this.ward_killed = ward_killed;
	}
	public int getWard_placed() {
		return ward_placed;
	}
	public void setWard_placed(int ward_placed) {
		this.ward_placed = ward_placed;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getItem0() {
		return item0;
	}
	public void setItem0(int item0) {
		this.item0 = item0;
	}
	public int getItem1() {
		return item1;
	}
	public void setItem1(int item1) {
		this.item1 = item1;
	}
	public int getItem2() {
		return item2;
	}
	public void setItem2(int item2) {
		this.item2 = item2;
	}
	public int getItem3() {
		return item3;
	}
	public void setItem3(int item3) {
		this.item3 = item3;
	}
	public int getItem4() {
		return item4;
	}
	public void setItem4(int item4) {
		this.item4 = item4;
	}
	public int getItem5() {
		return item5;
	}
	public void setItem5(int item5) {
		this.item5 = item5;
	}
	public int getItem6() {
		return item6;
	}
	public void setItem6(int item6) {
		this.item6 = item6;
	}
	public Gamer(int battle_tag_num, BattleTag[] battle_tag_list, int area_id, String qquin, String name,
			int champion_id, int champions_killed, int num_deaths, int assists, int minions_killed, int exp, int win,
			int game_score, int gold_earned, int gold_spent, int largest_killing_spree, int largest_multi_kill,
			int magic_damage_dealt_to_champions, int physical_damage_dealt_to_champions, int neutral_minions_killed,
			int penta_kills, int quadra_kills, int triple_kills, int skin_id, int summon_spell1_id,
			int summon_spell2_id, int super_monster_killed, int team, int total_damage_dealt,
			int total_damage_dealt_to_champions, int total_damage_taken, int total_health, int turrets_killed,
			int ward_killed, int ward_placed, int level, int item0, int item1, int item2, int item3, int item4,
			int item5, int item6) {
		super();
		this.battle_tag_num = battle_tag_num;
		this.battle_tag_list = battle_tag_list;
		this.area_id = area_id;
		this.qquin = qquin;
		this.name = name;
		this.champion_id = champion_id;
		this.champions_killed = champions_killed;
		this.num_deaths = num_deaths;
		this.assists = assists;
		this.minions_killed = minions_killed;
		this.exp = exp;
		this.win = win;
		this.game_score = game_score;
		this.gold_earned = gold_earned;
		this.gold_spent = gold_spent;
		this.largest_killing_spree = largest_killing_spree;
		this.largest_multi_kill = largest_multi_kill;
		this.magic_damage_dealt_to_champions = magic_damage_dealt_to_champions;
		this.physical_damage_dealt_to_champions = physical_damage_dealt_to_champions;
		this.neutral_minions_killed = neutral_minions_killed;
		this.penta_kills = penta_kills;
		this.quadra_kills = quadra_kills;
		this.triple_kills = triple_kills;
		this.skin_id = skin_id;
		this.summon_spell1_id = summon_spell1_id;
		this.summon_spell2_id = summon_spell2_id;
		this.super_monster_killed = super_monster_killed;
		this.team = team;
		this.total_damage_dealt = total_damage_dealt;
		this.total_damage_dealt_to_champions = total_damage_dealt_to_champions;
		this.total_damage_taken = total_damage_taken;
		this.total_health = total_health;
		this.turrets_killed = turrets_killed;
		this.ward_killed = ward_killed;
		this.ward_placed = ward_placed;
		this.level = level;
		this.item0 = item0;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
		this.item6 = item6;
	}
	
	
	
}
