package com.bigniu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bigniu.model.Token;

@Repository
public interface TokenDao {
	public void addToken(Token token);
	public List<Token> getAllToken();
	public Token getTokenById(int id);
	public Token getTokenByValue(String value);
	public List<Token> getTokenByCreateTime(String createTime);
	public void deleteToken(Token token);
	public void updateToken(Token token);
}
