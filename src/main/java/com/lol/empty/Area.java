package com.lol.empty;

public class Area {
	private String id;
	private String strid;
	private String isp;
	private String name;
	private String idc;
	private String tcls;
	private String ob;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStrid() {
		return strid;
	}
	public void setStrid(String strid) {
		this.strid = strid;
	}
	public String getIsp() {
		return isp;
	}
	public void setIsp(String isp) {
		this.isp = isp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdc() {
		return idc;
	}
	public void setIdc(String idc) {
		this.idc = idc;
	}
	public String getTcls() {
		return tcls;
	}
	public void setTcls(String tcls) {
		this.tcls = tcls;
	}
	public String getOb() {
		return ob;
	}
	public void setOb(String ob) {
		this.ob = ob;
	}
	@Override
	public String toString() {
		return "Area [id=" + id + ", strid=" + strid + ", isp=" + isp + ", name=" + name + ", idc=" + idc + ", tcls="
				+ tcls + ", ob=" + ob + "]";
	}
	public Area(String id, String strid, String isp, String name, String idc, String tcls, String ob) {
		super();
		this.id = id;
		this.strid = strid;
		this.isp = isp;
		this.name = name;
		this.idc = idc;
		this.tcls = tcls;
		this.ob = ob;
	}
	public Area() {
		// TODO Auto-generated constructor stub
	}
}
