package com.bigniu.service;

import com.bigniu.model.Token;

public interface TokenService {
	public void addToken();
	public Token getTokenById(String id);
	public Token getTokenByValue(String value);
	public void updateTokenById(String id,String end_time,String ip,String host);
	public void addCount(String id,String ip,String url);
}
