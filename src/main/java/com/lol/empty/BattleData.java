package com.lol.empty;

import java.util.Arrays;

/**
 * 单条比赛记录列表数据
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:34:50 
 * @version 1.0
 */
public class BattleData {
	/**
	 * 比赛记录列表
	 */
	private BattleDataList[] battle_list;
	/**
	 * 出错信息
	 */
	private String error_info;
	/**
	 * 记录数
	 */
	private int list_num;
	/**
	 * 返回id
	 */
	private int result;
	/**
	 * 总局数
	 */
	private int total_num;
	/**
	 * 胜利总数
	 */
	private int total_win_num;
	@Override
	public String toString() {
		return "BattleData [battle_list=" + Arrays.toString(battle_list) + ", error_info=" + error_info + ", list_num="
				+ list_num + ", result=" + result + ", total_num=" + total_num + ", total_win_num=" + total_win_num
				+ "]";
	}
	public BattleDataList[] getBattle_list() {
		return battle_list;
	}
	public void setBattle_list(BattleDataList[] battle_list) {
		this.battle_list = battle_list;
	}
	public String getError_info() {
		return error_info;
	}
	public void setError_info(String error_info) {
		this.error_info = error_info;
	}
	public int getList_num() {
		return list_num;
	}
	public void setList_num(int list_num) {
		this.list_num = list_num;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public int getTotal_num() {
		return total_num;
	}
	public void setTotal_num(int total_num) {
		this.total_num = total_num;
	}
	public int getTotal_win_num() {
		return total_win_num;
	}
	public void setTotal_win_num(int total_win_num) {
		this.total_win_num = total_win_num;
	}
	public BattleData(BattleDataList[] battle_list, String error_info, int list_num, int result, int total_num,
			int total_win_num) {
		super();
		this.battle_list = battle_list;
		this.error_info = error_info;
		this.list_num = list_num;
		this.result = result;
		this.total_num = total_num;
		this.total_win_num = total_win_num;
	}
	
	
}
