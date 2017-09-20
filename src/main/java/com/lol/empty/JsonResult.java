package com.lol.empty;

import java.util.List;

import com.google.gson.Gson;

public class JsonResult<T> {
	private int retCode;
	private String msg;
	private List<T> data;
	private Gson gson;
	
	
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

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public JsonResult(int retCode, String msg, List<T> data) {
		super();
		gson = new Gson();
		this.retCode = retCode;
		this.msg = msg;
		this.data = data;
	}

	@Override
	public String toString() {
		return "JsonResult [retCode=" + retCode + ", msg=" + msg + ", data=" + data + "]";
	}
	
	public JsonResult(List<T> data) {
		this(0,"",data);
	}
	public JsonResult(String msg) {
		this(600,msg,null);
	}
	
	public JsonResult() {
		gson = new Gson();
	}
	public String toJson(){
		return gson.toJson(this,JsonResult.class);
	}
}
