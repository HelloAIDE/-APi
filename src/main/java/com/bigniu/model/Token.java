package com.bigniu.model;

public class Token {
	private int id;
	private String value;
	private String createTime;
	private String modifyTime;
	private String endTime;
	private String ip;
	private int count;
	private String lastTime;
	private String host;
	


	public Token(int id, String value, String createTime, String modifyTime, String endTime, String ip, int count,
			String lastTime, String host) {
		super();
		this.id = id;
		this.value = value;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.endTime = endTime;
		this.ip = ip;
		this.count = count;
		this.lastTime = lastTime;
		this.host = host;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getValue() {
		return value;
	}



	public void setValue(String value) {
		this.value = value;
	}



	public String getCreateTime() {
		return createTime;
	}



	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}



	public String getModifyTime() {
		return modifyTime;
	}



	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}



	public String getEndTime() {
		return endTime;
	}



	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}



	public String getIp() {
		return ip;
	}



	public void setIp(String ip) {
		this.ip = ip;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public String getLastTime() {
		return lastTime;
	}



	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}



	public String getHost() {
		return host;
	}



	public void setHost(String host) {
		this.host = host;
	}



	@Override
	public String toString() {
		return "Token [id=" + id + ", value=" + value + ", createTime=" + createTime + ", modifyTime=" + modifyTime
				+ ", endTime=" + endTime + ", ip=" + ip + ", count=" + count + ", lastTime=" + lastTime + ", host="
				+ host + "]";
	}



	public Token() {
		// TODO Auto-generated constructor stub
	}
}
