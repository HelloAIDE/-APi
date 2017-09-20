package com.lol.empty;

import java.util.Date;

public class Token {
	private String pkey;
	private String puin;
	private int state;
	private Date date;
	

	public Token(String pkey, String puin, int state, Date date) {
		super();
		this.pkey = pkey;
		this.puin = puin;
		this.state = state;
		this.date = date;
	}


	public String getPkey() {
		return pkey;
	}


	public void setPkey(String pkey) {
		this.pkey = pkey;
	}


	public String getPuin() {
		return puin;
	}


	public void setPuin(String puin) {
		this.puin = puin;
	}


	public int getState() {
		return state;
	}


	public void setState(int state) {
		this.state = state;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Token [pkey=" + pkey + ", puin=" + puin + ", state=" + state + ", date=" + date + "]";
	}


	public Token() {
		// TODO Auto-generated constructor stub
	}
}
