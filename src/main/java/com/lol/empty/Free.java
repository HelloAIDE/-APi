package com.lol.empty;

import java.util.Map;

public class Free {
	private Map<String,Free> data;
	private Map<String,String> keys;
	
	public Free(Map<String, Free> data, Map<String, String> keys) {
		super();
		this.data = data;
		this.keys = keys;
	}

	public Map<String, Free> getData() {
		return data;
	}

	public void setData(Map<String, Free> data) {
		this.data = data;
	}

	public Map<String, String> getKeys() {
		return keys;
	}

	public void setKeys(Map<String, String> keys) {
		this.keys = keys;
	}

	@Override
	public String toString() {
		return "Free [data=" + data + ", keys=" + keys + "]";
	}

	public Free() {
	}
}
