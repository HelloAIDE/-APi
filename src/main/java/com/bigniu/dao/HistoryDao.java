package com.bigniu.dao;

import org.springframework.stereotype.Repository;

import com.bigniu.model.History;
@Repository
public interface HistoryDao {
	public void addHistory(History history);
}
