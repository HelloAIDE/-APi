package com.lol.empty;

import java.util.Arrays;
/**
 * 角色大区数据
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:51:56 
 * @version 1.0
 */
public class UserInfoData {
	/**
	 * 通过昵称查询出所以相关角色大区数据
	 */
	private UserInfo[] data;
	/**
	 * 状态码
	 */
	private int retCode;
	/**
	 * 出错信息
	 */
	private String msg;
	
	public UserInfoData(UserInfo[] data, int retCode, String msg) {
		super();
		this.data = data;
		this.retCode = retCode;
		this.msg = msg;
	}

	public UserInfo[] getData() {
		return data;
	}

	public void setData(UserInfo[] data) {
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
		return "UserInfoData [data=" + Arrays.toString(data) + ", retCode=" + retCode + ", msg=" + msg + "]";
	}

	public UserInfoData() {
	}

	public UserInfoData( int retCode, String msg) {
		super();
		this.retCode = retCode;
		this.msg = msg;
	}
}
