package com.bigniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigniu.dao.ApiCountDao;
import com.bigniu.model.Count;
import com.bigniu.service.ICountService;
@Service
public class ICountServiceImp implements ICountService {
	@Autowired
	private ApiCountDao dao;
	public void insertToday() {
		dao.insertToday();
	}

	public Count selectToday() {
		Count count = dao.selectToday();
		return count;
	}

	public List<Count> select7Day() {
		List<Count> list = dao.select7Day();
		return list;
	}

	public int getCountTotal() {
		int i = dao.getCountTotal();
		return i;
	}

	public void updateToday() {
		dao.updateToday();
	}

}
