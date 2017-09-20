package com.lol.empty;
/**
 * 出错时返回Json对象
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:44:59 
 * @version 1.0
 */
public class ErrorJson {
	/**
	 * 出错码
	 */
	private int retCode;
	/**
	 * 出错信息
	 */
	private String msg;
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
	public ErrorJson(int retCode, String msg) {
		super();
		this.retCode = retCode;
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "ErrorJson [retCode=" + retCode + ", msg=" + msg + "]";
	}
	
	
}
