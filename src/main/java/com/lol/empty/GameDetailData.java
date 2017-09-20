package com.lol.empty;
/**
 * 单场战斗数据
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:46:03 
 * @version 1.0
 */
public class GameDetailData {
	/**
	 * 出错信息
	 */
	private String error_info;
	/**
	 * 状态码
	 */
	private int result;
	/**
	 * 比赛记录详情
	 */
	private GameDetailDataBattle battle;
	public GameDetailData(String error_info, int result, GameDetailDataBattle battle) {
		super();
		this.error_info = error_info;
		this.result = result;
		this.battle = battle;
	}
	public String getError_info() {
		return error_info;
	}
	public void setError_info(String error_info) {
		this.error_info = error_info;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public GameDetailDataBattle getBattle() {
		return battle;
	}
	public void setBattle(GameDetailDataBattle battle) {
		this.battle = battle;
	}
	@Override
	public String toString() {
		return "GameDetailData [error_info=" + error_info + ", result=" + result + ", battle=" + battle + "]";
	}
	
}
