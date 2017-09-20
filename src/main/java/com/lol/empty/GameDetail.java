package com.lol.empty;

import java.io.Serializable;
/**
 * 每场战斗的详细数据
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:45:46 
 * @version 1.0
 */
public class GameDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ukey;
	private int retCode;
	private String msg;
	private GameDetailData data;
	public String getUkey() {
		return ukey;
	}
	public void setUkey(String ukey) {
		this.ukey = ukey;
	}
	public int getRetCode() {
		return retCode;
	}
	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public GameDetailData getData() {
		return data;
	}
	public void setData(GameDetailData data) {
		this.data = data;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public GameDetail(int retCode, String msg) {
		super();
		this.retCode = retCode;
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "GameDetailBean [ukey=" + ukey + ", retCode=" + retCode + ", msg=" + msg + ", data=" + data + "]";
	}
	
}
