package com.bigniu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigniu.dao.HistoryDao;
import com.bigniu.model.History;
import com.bigniu.service.HistoryService;
@Service
public class HistoryServiceImp implements HistoryService {
	@Autowired
	private HistoryDao dao;
	
	public void addHistory(History history) {
		dao.addHistory(history);
	}

}
