package com.bigniu.service;

import java.util.List;

import com.bigniu.model.Count;


public interface ICountService {
    public void insertToday();

    public Count selectToday();
    
    public List<Count> select7Day();

    public int getCountTotal();

    public void updateToday();
}
