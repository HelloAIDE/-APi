package com.bigniu.model;
/**
 * 请求API历史记录
 * @author Administrator
 *
 */
public class History {
	private int id;
	private String path;
	private String token;
	private String time;
	private String ip;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public History(int id, String path, String token, String time, String ip) {
		super();
		this.id = id;
		this.path = path;
		this.token = token;
		this.time = time;
		this.ip = ip;
	}
	@Override
	public String toString() {
		return "History [id=" + id + ", path=" + path + ", token=" + token + ", time=" + time + ", ip=" + ip + "]";
	}
	public History() {
		// TODO Auto-generated constructor stub
	}
}
