package com.lol.api.imp;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.lol.api.HttpConnection;
import com.lol.api.LOLAPI;
import com.lol.api.Static;
import com.lol.bean.AreaByName;
import com.lol.bean.GameType;
import com.lol.bean.TagByName;
import com.lol.bean.TierType;
import com.lol.empty.BattleList;
import com.lol.empty.ErrorJson;
import com.lol.empty.GameDetail;
import com.lol.empty.JsonResult;
import com.lol.empty.UserAreaData;
import com.lol.empty.UserInfoData;

/**
 * 英雄联盟API实现类
 * 
 * @author BigNiu
 * @date 创建时间：2017年3月11日 下午9:25:33
 * @version 1.0
 */
@Service
public class APIImp implements LOLAPI {
	public static LOLAPI api;
	private static Thread thread;

	private APIImp() {
	}

	public UserInfoData seacherUserByName(String nickname) {
		UserInfoData users = null;
		Gson gson = new Gson();
		String data = "";
		Map<String, String> params = new HashMap<String, String>();
		try {
			params.put("key", nickname);
			data = HttpConnection.getJson(Static.SeacherURL, params);
			while (data.contains("2002")) {
				data = HttpConnection.getJson(Static.SeacherURL, params);
			}
			users = gson.fromJson(data, UserInfoData.class);
		} catch (Exception e) {
			e.printStackTrace();
			ErrorJson err = gson.fromJson(data, ErrorJson.class);
			users = new UserInfoData(err.getRetCode(), err.getMsg());
		}
		return users;
	}

	public GameDetail getGameDetail(String areaId, String gameId) {
		GameDetail game = null;
		Gson gson = new Gson();
		Map<String, String> params = new HashMap<String, String>();
		String data = "";
		try {
			params.put("p", "{\"area_id\":\"" + areaId + "\",\"game_id\":" + gameId + "}");
			data = HttpConnection.getJson(Static.GameDetailURL, params);
			game = gson.fromJson(data, GameDetail.class);
			while (game.getRetCode()==2002) {
				data = HttpConnection.getJson(Static.GameDetailURL, params);
			}
		} catch (Exception e) {
			e.printStackTrace();
			ErrorJson err = gson.fromJson(data, ErrorJson.class);
			game = new GameDetail(err.getRetCode(), err.getMsg());
		}
		return game;
	}

	public BattleList getBattleList(String areaId, String QQUid, Integer page) {
		int offset = (page - 1) * 8;
		int limit = 8;

		BattleList battleList = null;
		Gson gson = new Gson();
		Map<String, String> params = new HashMap<String, String>();
		String data = "";
		try {
			params.put("p",
					"[[3,{\"area_id\":\"" + areaId + "\",\"qquin\":\"" + QQUid
							+ "\",\"bt_num\":\"0\", \"bt_list\":[],\"champion_id\":0,\"offset\":" + offset
							+ ",\"limit\":" + limit + ",\"mvp_flag\":-1}]]");
			data = HttpConnection.getJson(Static.BattleListURL, params);
			while (data.contains("2002")) {
				System.out.println(data);
				data = HttpConnection.getJson(Static.BattleListURL, params);
			}
			battleList = gson.fromJson(data, BattleList.class);
		} catch (Exception e) {
			System.out.println("出错了");
			e.printStackTrace();
			ErrorJson err = gson.fromJson(data, ErrorJson.class);
			battleList = new BattleList(err.getRetCode(), err.getMsg());
		}
		return battleList;
	}
	

	public UserAreaData UserExtInfo(String qquin, String areaId) {
		Gson gson = new Gson();
		String data = "";
		UserAreaData userExtInfo = null;
		Map<String, String> params = new HashMap<String, String>();
		try {
			params.put("qquin", qquin);
			params.put("area_id", areaId);
			data = HttpConnection.getJson(Static.UserExtInfo, params);
			while (data.contains("2002")) {
				data = HttpConnection.getJson(Static.UserExtInfo, params);
			}
			userExtInfo = gson.fromJson(data, UserAreaData.class);
		} catch (Exception e) {
			e.printStackTrace();
			ErrorJson err = gson.fromJson(data, ErrorJson.class);
			userExtInfo = new UserAreaData(err.getRetCode(), err.getMsg());
		}
		return userExtInfo;
	}
	

	public JsonResult getFree() {
		String data = "";
		Map<String, String> params = new HashMap<String, String>();
		String str = "";
		Object obj = null;
		try {
			data = HttpConnection.getJson(Static.FreeURL, params);
			int start_index = data.indexOf("free=") + 5;
			int end_index = data.lastIndexOf(";");
			str = data.substring(start_index, end_index);
			System.out.println(str);
			Gson gson = new Gson();
			obj = gson.fromJson(str, Object.class);
			System.out.println("obj" + obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", obj);
		list.add(map);
		JsonResult jsonResult = new JsonResult(list);
		return jsonResult;
	}

	public String getBattleSummaryInfo(String qquin, String areaId, String type) {
		Gson gson = new Gson();
		String data = "";
		Map<String, String> params = new HashMap<String, String>();
		String p = "[[14,{\"battle_type\":7,\"qquin\":\"" + qquin + "\",\"area_id\":" + areaId + "}]]";
		switch (Integer.valueOf(type)) {
		case 0:
			// 近30天KDA及其位置使用情况
			p = "[[7,{\"items\":[{\"qquin\":\"" + qquin + "\",\"area_id\":" + areaId + "}]}]]";
			break;
		case 1:
			// 用户赛季信息汇总
			p = "[[14,{\"battle_type\":-1,\"qquin\":\"" + qquin + "\",\"area_id\":" + areaId + "}]]";
			break;
		case 2:
			// 用户荣誉信息(超神，5杀，补兵数等)
			p = "[[28,{\"qquin\":\"" + qquin + "\",\"area_id\":" + areaId + "}]]";
			break;
		case 3:
			// 排位MVP和匹配MVP数
			p = "[[29,{\"qquin\":\"" + qquin + "\",\"area_id\":" + areaId + ",\"top_mvp_type\":0}]]";
			break;
		}
		// 1:基本信息,28:用户荣誉信息(超神，5杀，mvp等)
		// [[7,{\"items\":[{\"qquin\":\""+qquin+"\",\"area_id\":"+areaId+"}]}]]近30天KDA及其位置使用情况
		// [[28,{\"qquin\":\""+qquin+"\",\"area_id\":"+areaId+"}]]用户荣誉信息(超神，5杀，补兵数等)
		// [[29,{\"qquin\":\""+qquin+"\",\"area_id\":"+areaId+",\"top_mvp_type\":0}]]排位MVP和匹配MVP数
		// [[35,{\"qquin\":\""+qquin+"\",\"area_id\":"+areaId+",\"champion_id\":0}]]
		// 未知
		// [[36,{\"qquin\":\""+qquin+"\",\"area_id\":"+areaId+"}]]未知
		// [[44,{\"sid\":4,\"qquin\":\""+qquin+"\",\"area_id\":"+areaId+"}]] 未知
		// [[14,{\"battle_type\":7,\"qquin\":\""+qquin+"\",\"area_id\":"+areaId+"}]]
		// 用户赛季信息汇总
		params.put("p", p);
		try {
			data = HttpConnection.getJson(Static.TCALLURL, params);
			while (data.contains("2002")) {
				data = HttpConnection.getJson(Static.TCALLURL, params);
			}
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public JsonResult getAllHero() {
		String data = "";
		Map<String, String> params = new HashMap<String, String>();
		String str = "";
		Object obj = null;
		try {
			data = HttpConnection.getJson(Static.HeroURL, params);
			int start_index = data.indexOf("Search=") + 7;
			int end_index = data.lastIndexOf(";PLS.LOLHeroType");
			str = data.substring(start_index, end_index);
			System.out.println(str);
			Gson gson = new Gson();
			obj = gson.fromJson(str, Object.class);
			System.out.println("obj" + obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", obj);
		list.add(map);
		JsonResult jsonResult = new JsonResult(list);
		return jsonResult;
	}

	public JsonResult getAllGameArea() {
		String data = "";
		Map<String, String> params = new HashMap<String, String>();
		String str = "";
		Object obj = null;
		try {
			data = HttpConnection.getJson(Static.AreaURL, params);
			int start_index = data.indexOf("map=") + 4;
			int end_index = data.lastIndexOf(";if(typeof");
			str = data.substring(start_index, end_index);
			Gson gson = new Gson();
			obj = gson.fromJson(str, Object.class);
			System.out.println("obj" + obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", obj);
		list.add(map);
		JsonResult jsonResult = new JsonResult(list);
		return jsonResult;
	}
	public JsonResult getTierQueue(String tier, String queue) {
		TierType tierType = new TierType();
		Map<String, String> map = tierType.getTier();
		String tierStr = map.get(tier);
		String queueStr = String.valueOf(Integer.valueOf(queue) + 1);
		String re = tierStr;
		if (tier.equals("6") || tier.equals("0") || tier.equals("255")) {

		} else {
			re = tierStr + queueStr;
		}
		System.out.println(re);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("name", re);
		list.add(map1);
		JsonResult jsonResult = new JsonResult(list);
		return jsonResult;
	}

	public JsonResult getAreaNameById(String id) {
		AreaByName area = new AreaByName();
		Map<String, String> map = area.getArea();
		String name = map.get(id);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map1 = new HashMap<String, Object>();
		if (name == null || name.trim().isEmpty()) {
			name = "";
		}
		map1.put("name", name);
		list.add(map1);
		JsonResult jsonResult = new JsonResult(list);
		return jsonResult;
	}
	
	public JsonResult getGameType(String typeId) {
		GameType type = new GameType();
		Map<String, String> map = type.getGameType();
		String typeName = map.get(typeId);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map1 = new HashMap<String, Object>();
		if (typeName == null || typeName.trim().isEmpty()) {
			typeName = "未知比赛";
		}
		map1.put("name", typeName);
		list.add(map1);
		JsonResult jsonResult = new JsonResult(list);
		return jsonResult;
	}

	public JsonResult getTagName(String tagid) {
		TagByName type = new TagByName();
		Map<String, String> map = type.getTagName();
		String typeName = map.get(tagid);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map1 = new HashMap<String, Object>();
		if (typeName == null || typeName.trim().isEmpty()) {
			typeName = "";
		}
		map1.put("name", typeName);
		list.add(map1);
		JsonResult jsonResult = new JsonResult(list);
		return jsonResult;
	}

	public BufferedImage getSkinIcon(String skinid) {
		BufferedImage image = null;
		String url = Static.SkinURL + skinid + ".jpg";
		URL input;
		try {
			input = new URL(url);
			image = ImageIO.read(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}
	public BufferedImage getChampionIcon(String id) {
		BufferedImage image = null;
		String url = Static.ChampionIconURL + id + ".png";
		URL input;
		try {
			input = new URL(url);
			image = ImageIO.read(input);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}
	public BufferedImage getUserIcon(String id) {
		BufferedImage image = null;
		String url = Static.UserIconURL + id + ".png";
		URL input;
		try {
			input = new URL(url);
			image = ImageIO.read(input);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}
	public BufferedImage getSummonability(String id) {
		BufferedImage image = null;
		String url = Static.SummonabilityURL + id + ".png";
		URL input;
		try {
			input = new URL(url);
			image = ImageIO.read(input);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}

	public BufferedImage getItemImage(String id) {
		BufferedImage image = null;
		String url = Static.ItemURL + id + ".png";
		URL input;
		try {
			input = new URL(url);
			image = ImageIO.read(input);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}

	public String getSkinIconUrl(String skinid) {
		String url = Static.SkinURL + skinid + ".jpg";
		return url;
	}

	public String getUserIconUrl(String id) {
		String url = Static.UserIconURL + id + ".png";
		return url;
	}

	public String getChampionIconUrl(String id) {
		String url = Static.ChampionIconURL + id + ".png";
		return url;
	}

	public String getSummonabilityUrl(String id) {
		String url = Static.SummonabilityURL + id + ".png";
		return url;
	}

	public String getItemImageUrl(String id) {
		String url = Static.ItemURL + id + ".png";
		return url;
	}
}
