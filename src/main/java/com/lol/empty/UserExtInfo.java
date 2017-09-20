package com.lol.empty;

import java.util.List;

public class UserExtInfo {
	 	private List<UserExtInfoData> data;
	    private int code;
	    private String msg;
		public List<UserExtInfoData> getData() {
			return data;
		}
		public void setData(List<UserExtInfoData> data) {
			this.data = data;
		}
		public int getCode() {
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		@Override
		public String toString() {
			return "UserExtInfo [data=" + data + ", code=" + code + ", msg=" + msg + "]";
		}
		public UserExtInfo(List<UserExtInfoData> data, int code, String msg) {
			super();
			this.data = data;
			this.code = code;
			this.msg = msg;
		}
	    
		public UserExtInfo() {
			// TODO Auto-generated constructor stub
		}
}
