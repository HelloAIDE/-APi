package com.bigniu.service;

import java.util.List;

import com.lol.empty.Area;
import com.lol.empty.Champion;

public interface APIChampiontService {
	public List<Champion> getAllChampion();
	public List<Champion> getFreeChampion();
	public List<Area> getAllArea();
}
