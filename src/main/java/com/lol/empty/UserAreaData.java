package com.lol.empty;

import java.util.Arrays;
/**
 * 角色大区数据
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:51:56 
 * @version 1.0
 */
public class UserAreaData {
	/**
	 * 通过昵称查询出所以相关角色大区数据
	 */
	private UserArea data;
	/**
	 * 状态码
	 */
	private int retCode;
	/**
	 * 出错信息
	 */
	private String msg;
	
	public UserAreaData(UserArea data, int retCode, String msg) {
		super();
		this.data = data;
		this.retCode = retCode;
		this.msg = msg;
	}

	public UserArea getData() {
		return data;
	}

	public void setData(UserArea data) {
		this.data = data;
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

	@Override
	public String toString() {
		return "UserAreaData [data=" + data + ", retCode=" + retCode + ", msg=" + msg + "]";
	}

	public UserAreaData(int retCode, String msg) {
		super();
		this.retCode = retCode;
		this.msg = msg;
	}

	
}
