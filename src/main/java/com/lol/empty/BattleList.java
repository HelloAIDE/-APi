package com.lol.empty;

import java.util.Arrays;

/**
 * 战斗列表
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:43:36 
 * @version 1.0
 */
public class BattleList {
	/**
	 * 战斗列表简要数据
	 */
	private BattleData[] data;
	/**
	 * 出错信息
	 */
	private String msg;
	/**
	 * 返回码
	 */
	private int retCode;
	/**
	 * 用户标识
	 */
	private String ukey;
	public BattleData[] getData() {
		return data;
	}
	public void setData(BattleData[] data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getRetCode() {
		return retCode;
	}
	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}
	public String getUkey() {
		return ukey;
	}
	public void setUkey(String ukey) {
		this.ukey = ukey;
	}
	public BattleList( int retCode,String msg) {
		super();
		this.retCode = retCode;
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "BattleList [data=" + Arrays.toString(data) + ", msg=" + msg + ", retCode=" + retCode + ", ukey=" + ukey
				+ "]";
	}
	
	
}
