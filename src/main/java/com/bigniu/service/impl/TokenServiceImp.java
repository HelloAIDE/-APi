package com.bigniu.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigniu.dao.TokenDao;
import com.bigniu.exception.TokenException;
import com.bigniu.model.Count;
import com.bigniu.model.Token;
import com.bigniu.service.TokenService;
import com.bigniu.util.date.DateUtil;
@Service
public class TokenServiceImp implements TokenService {
	@Autowired
	private TokenDao dao;
	public void addToken() {
		Token token = new Token();
		String uuid = UUID.randomUUID().toString();
		uuid=uuid.replace("-", "");
		token.setValue(uuid);
		token.setCreateTime(DateUtil.getDateStr());
		token.setEndTime((DateUtil.addDay(DateUtil.getDate(DateUtil.getDateStr()),7)+" 00:00:00"));
		dao.addToken(token);
	}

	public Token getTokenById(String id) {
		if(id==null||id.trim().isEmpty())
		{
			throw new TokenException("id不能为空");
		}
		Token token = dao.getTokenById(Integer.valueOf(id));
		if(token==null)
		{
			throw new TokenException("token不存在");
		}
		return token;
	}

	public Token getTokenByValue(String value) {
		if(value==null||value.trim().isEmpty())
		{
			throw new TokenException("value不能为空");
		}
		Token token = dao.getTokenByValue(value);
		if(token==null)
		{
			throw new TokenException("token不存在");
		}
		return token;
	}

	public void updateTokenById(String id, String end_time, String ip, String host) {
		if(id==null||id.trim().isEmpty())
		{
			throw new TokenException("id不能为空");
			
		}
		Token token = dao.getTokenById(Integer.valueOf(id));
		if(token==null)
		{
			throw new TokenException("token不存在");
		}
		if(end_time!=null)
		{
			token.setEndTime(end_time);
		}
		if(ip!=null)
		{
			token.setIp(ip);
		}
		if(host!=null)
		{
			token.setHost(host);
		}
		dao.updateToken(token);
	}
	public void addCount(String id, String ip, String url) {
		
	}

}
