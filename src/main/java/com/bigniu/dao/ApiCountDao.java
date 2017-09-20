package com.bigniu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bigniu.model.Count;


@Repository
public interface ApiCountDao {
    public void insertToday();

    public Count selectToday();
    
    public List<Count> select7Day();

    public int getCountTotal();

    public void updateToday();
}