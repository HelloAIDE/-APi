package com.bigniu.web;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bigniu.service.APIChampiontService;
import com.lol.api.LOLAPI;
import com.lol.empty.BattleList;
import com.lol.empty.GameDetail;
import com.lol.empty.JsonResult;
import com.lol.empty.UserAreaData;
import com.lol.empty.UserInfoData;
@RequestMapping("/api")
@Controller
public class APIController {
	@Autowired
	private LOLAPI api;
	@Autowired
	private APIChampiontService service;
	
	/**
	 * 昵称查询
	 * @param name
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/UserArea")
	public Object UserArea(String userName){
		UserInfoData  data = api.seacherUserByName(userName);
		 return data;
	}
	/**
	 * 用户基本信息查询
	 * @param qquin
	 * @param areaid
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/UserExtInfo")
	public Object UserExtInfo(String qquin,String areaid){
		UserAreaData  data = api.UserExtInfo(qquin, areaid);
		 return data;
	}
	/**
	 * 获取用户战绩列表
	 * @param qquin 用户标识
	 * @param areaid 大区id
	 * @param page 页数 0开始
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/BattleList")
	public Object BattleList(String qquin,String areaid,int page){
		BattleList  data = api.getBattleList(areaid, qquin, page);
		 return data;
	}
	/**
	 * 根据大区ID和游戏ID查询一场比赛详情
	 * @param areaId 大区id
	 * @param gameId 游戏id
	 * @return 一条比赛记录
	 */
	@ResponseBody
	@RequestMapping("/GameDetail")
	public Object GameDetail(String areaid,String gameid){
		GameDetail  data = api.getGameDetail(areaid, gameid);
		 return data;
	}
	/**
	 * 获取近30天kda及期位置使用情况
	  * @param qquin 用户标识
	 * @param areaid 大区id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/UserKDA")
	public String GetUserKDA(String qquin,String areaid){
		String  data = api.getBattleSummaryInfo(qquin,areaid,"0");
		 return data;
	}
	/**
	 * 用户赛季信息汇总
	 * @param qquin 用户标识
	 * @param areaid 大区id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/UserAllBattle")
	public String UserAllBattle(String qquin,String areaid){
		String  data = api.getBattleSummaryInfo(qquin,areaid,"1");
		 return data;
	}
	/**
	 * 获取用户荣誉
	 * @param qquin 用户标识
	 * @param areaid 大区id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/UserHonor")
	public String BattleSummaryInfo(String qquin,String areaid){
		String  data = api.getBattleSummaryInfo(qquin,areaid,"2");
		return data;
	}
	/**
	 * 获取总共mvp数
	 * @param qquin 用户标识
	 * @param areaid 大区id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/UserMVP")
	public String UserMVP(String qquin,String areaid){
		String  data = api.getBattleSummaryInfo(qquin,areaid,"3");
		 return data;
	}
	
	/**
	 * 获取游戏类型
	 * @param typeid
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/GameType")
	public Object getGameType(String typeid) {
		JsonResult obj = api.getGameType(typeid);
		return obj;
	}
	/**
	 * 获取游戏类型
	 * @param typeid
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/GameArea")
	public Object GameArea(String areaid) {
		JsonResult obj = api.getAreaNameById(areaid);
		return obj;
	}
	/**
	 * 获取游戏类型
	 * @param typeid
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/TierQueue")
	public Object TierQueue(String tier,String queue) {
		JsonResult obj = api.getTierQueue(tier, queue);
		return obj;
	}
	/**
	 * 获取所有大区信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/AllGameArea")
	public Object AllGameArea() {
		JsonResult obj = new JsonResult(service.getAllArea());
		return obj;
	}
	/**
	 * 获取所有英雄信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/AllHero")
	public Object AllHero() {
		JsonResult obj = new JsonResult(service.getAllChampion());
		return obj;
	}
	/**
	 * 获取周免英雄
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/Free")
	public Object Free() {
		JsonResult obj = new JsonResult(service.getAllChampion());
		return obj;
	}
	/**
	 * 获取战斗标签描述
	 * @param typeid
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/TagName")
	public Object TagName(String tagid) {
		JsonResult obj = api.getTagName(tagid);
		return obj;
	}
	/**
	 * 获取英雄头像
	 * @param res
	 * @param id
	 */
	@ResponseBody
	@RequestMapping("/ChampionIcon")
	public void ChampionIcon( HttpServletResponse res, String id) {
		BufferedImage buffer = api.getChampionIcon(id);
		OutputStream out = null ;
		try {
			 out =  res.getOutputStream();
			ImageIO.write(buffer, "png", out);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	/**
	 * 获取角色头像
	 * @param res
	 * @param id
	 */
	@ResponseBody
	@RequestMapping("/UserIcon")
	public void UserIcon( HttpServletResponse res, String id) {
		BufferedImage buffer = api.getUserIcon(id);
		OutputStream out = null ;
		try {
			 out =  res.getOutputStream();
			ImageIO.write(buffer, "png", out);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	/**
	 * 获取召唤师技能图标
	 * @param res
	 * @param id
	 */
	@ResponseBody
	@RequestMapping("/SkillIcon")
	public void SkillIcon( HttpServletResponse res, String id) {
		BufferedImage buffer = api.getSummonability(id);
		OutputStream out = null ;
		try {
			 out =  res.getOutputStream();
			ImageIO.write(buffer, "png", out);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	/**
	 * 获取装备图标
	 * @param res
	 * @param id
	 */
	@ResponseBody
	@RequestMapping("/ItemIcon")
	public void ItemIcon( HttpServletResponse res, String id) {
		BufferedImage buffer = api.getItemImage(id);
		OutputStream out = null ;
		try {
			 out =  res.getOutputStream();
			ImageIO.write(buffer, "png", out);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 获取皮肤图标
	 * @param res
	 * @param id
	 */
	@ResponseBody
	@RequestMapping("/SkinIcon")
	public void SkinIcon( HttpServletResponse res, String id) {
		BufferedImage buffer = api.getSkinIcon(id);
		OutputStream out = null ;
		try {
			out =  res.getOutputStream();
			ImageIO.write(buffer, "jpg", out);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 获取英雄头像官方路径
	 * @param res
	 * @param id
	 * @return 
	 */
	@ResponseBody
	@RequestMapping("/ChampionIconStr")
	public JsonResult ChampionIconStr( HttpServletResponse res, String id) {
		String str = api.getChampionIconUrl(id);
		List<String> list = new ArrayList<String>();
		list.add(str);
		return new JsonResult(list);
		
	}
	/**
	 * 获取角色头像官方路径
	 * @param res
	 * @param id
	 */
	@ResponseBody
	@RequestMapping("/UserIconStr")
	public JsonResult UserIconStr( HttpServletResponse res, String id) {
		String str  = api.getUserIconUrl(id);
		List<String> list = new ArrayList<String>();
		list.add(str);
		return new JsonResult(list);
		
	}
	/**
	 * 获取召唤师技能图标官方路径
	 * @param res
	 * @param id
	 */
	@ResponseBody
	@RequestMapping("/SkillIconStr")
	public JsonResult SkillIconStr( HttpServletResponse res, String id) {
		String str  = api.getSummonabilityUrl(id);
		List<String> list = new ArrayList<String>();
		list.add(str);
		return new JsonResult(list);
		
	}
	/**
	 * 获取装备图标官方路径
	 * @param res
	 * @param id
	 */
	@ResponseBody
	@RequestMapping("/ItemIconStr")
	public JsonResult ItemIconStr( HttpServletResponse res, String id) {
		String str  =  api.getItemImageUrl(id);
		List<String> list = new ArrayList<String>();
		list.add(str);
		return new JsonResult(list);
		
	}
	/**
	 * 获取皮肤图标官方路径
	 * @param res
	 * @param id
	 */
	@ResponseBody
	@RequestMapping("/SkinIconStr")
	public JsonResult SkinIconStr( HttpServletResponse res, String id) {
		String str  =  api.getSkinIconUrl(id);
		List<String> list = new ArrayList<String>();
		list.add(str);
		return new JsonResult(list);
	}
/*	@RequestMapping("/update-tgp-config.do")
	@ResponseBody
	public JsonResult updateTGPConfig(String puin,String pkey) {
		BufferedInputStream in;
		String configURI = Static.path;//"c:/js/TGPconfig.properties";
		try {
			in = new BufferedInputStream(new FileInputStream(configURI));
			Properties properties = new Properties();
			properties.load(in);
			properties.setProperty("puin", puin);
			properties.setProperty("pkey", pkey);
			OutputStream out = new FileOutputStream(configURI);
			//以适合使用 load 方法加载到 Properties 表中的格式，  
			//将此 Properties 表中的属性列表（键和元素对）写入输出流  
			properties.store(out, "Update " + pkey + " name");
			Static.pUin = puin;
			Static.pKey = pkey;
			Token token = new Token(pkey,puin,0,new Date());
			boolean isHave = false;
			for(int i=0;i<Static.list.size();i++)
			{
				Token temptoken = Static.list.get(i);
				if(temptoken.getPuin().equals(puin))
				{
					temptoken.setPkey(pkey);
					Static.list.remove(i);
					Static.list.add(temptoken);
					isHave = true;
					continue;
				}
			}
			if(!isHave)
			{
				Static.list.add(token);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("configURI" + configURI);
		List<Map<String, Object>> data = new ArrayList<Map<String,Object>>();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "更新成功");
		map.put("pkey", Static.pKey);
		map.put("puin", Static.pUin);
		data.add(map);
		return new JsonResult(data);
	}*/

}