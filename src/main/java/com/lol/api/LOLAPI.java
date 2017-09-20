package com.lol.api;

import java.awt.image.BufferedImage;

import com.lol.empty.BattleList;
import com.lol.empty.GameDetail;
import com.lol.empty.JsonResult;
import com.lol.empty.UserAreaData;
import com.lol.empty.UserInfoData;
/**
 * 英雄联盟API接口
 * @author  BigNiu 
 * @date 创建时间：2017年3月11日 下午9:25:18 
 * @version 1.0
 */
public interface LOLAPI {
	
	/**
	 * 根据昵称查询英雄数据
	 * @param nickname  游戏昵称
	 * @return 多条英雄数据
	 */
	public UserInfoData seacherUserByName(String nickname);

	/**
	 * 根据大区和QQUIN查询第page页战斗数据(每页8条)
	 * @param areaId 大区id
	 * @param QQUid 游戏id
	 * @param page 第page页
	 * @return 战斗数据列表
	 */
	public BattleList getBattleList(String areaId,String QQUid,Integer page);
	/**
	 * 根据大区ID和游戏ID查询一条比赛记录
	 * @param areaId 大区id
	 * @param gameId 游戏id
	 * @return 一条比赛记录
	 */
	public GameDetail getGameDetail(String areaId,String gameId);
	/**
	 * 用户基本信息接口
	 * @param qquin qquin
	 * @param areaId 大区id
	 * @return 
	 */
	public UserAreaData UserExtInfo(String qquin, String areaId);
	/**
	 * 获取周免英雄
	 * @return
	 */
	public JsonResult getFree();
	/**
	 * 获取战绩汇总
	 * @param qquin qquin
	 * @param areaId 大区id
	 * @param type <br/>数据类型<br/> 0:近30天KDA及其位置使用情况;<br/>1:用户赛季信息汇总;<br/>2:用户荣誉信息(超神，5杀，补兵数等);<br/>3:排位MVP和匹配MVP数
	 * @return
	 */
	public String getBattleSummaryInfo(String qquin,String areaId,String type);
	/**
	 * 获取所有英雄
	 * @return
	 */
	public JsonResult getAllHero();
	/**
	 * 获取所有大区
	 * @return
	 * id:区服ID
		strid:简写
		isp:isp名称
		iname:区服名称
		idc:idc
		ob:是否支持OB文件
	 */
	public JsonResult getAllGameArea();
	/**
	 * 获取段位信息
	 * @param tier 段位1
	 * @param queue 段位2
	 * @return
	 */
	public JsonResult getTierQueue(String tier,String queue);
	/**
	 * 根据大区id获取大区名称
	 * @param id
	 * @return
	 */
	public JsonResult getAreaNameById(String id);
	
	/**
	 * 根据游戏类型id获取游戏类型名称
	 * @param typeId
	 * @return
	 */
	public JsonResult getGameType(String typeId);
	/**
	 * 根据战斗标签获取标签名字
	 * @param typeId
	 * @return
	 */
	public JsonResult getTagName(String tagid);
	/**
	 * 获取皮肤图标
	 * @param skinid
	 * @return
	 */
	public BufferedImage getSkinIcon(String skinid);
	/**
	 * 根据角色id获取角色对应头像
	 * @param id
	 * @return
	 */
	public BufferedImage getUserIcon(String id);
	/**
	 * 英雄头像接口
	 * @param id 头像id
	 * @return 图片流
	 */
	public BufferedImage getChampionIcon(String id);
	/**
	 * 获取召唤师技能图标
	 * @param id
	 * @return
	 */
	public BufferedImage getSummonability(String id);
	/**
	 * 获取装备图标
	 * @param id
	 * @return
	 */
	public BufferedImage getItemImage(String id);
	/**
	 * 获取皮肤图标
	 * @param skinid
	 * @return
	 */
	public String getSkinIconUrl(String skinid);
	/**
	 * 根据角色id获取角色对应头像
	 * @param id
	 * @return
	 */
	public String getUserIconUrl(String id);
	/**
	 * 英雄头像接口
	 * @param id 头像id
	 * @return 图片流
	 */
	public String getChampionIconUrl(String id);
	/**
	 * 获取召唤师技能图标
	 * @param id
	 * @return
	 */
	public String getSummonabilityUrl(String id);
	/**
	 * 获取装备图标
	 * @param id
	 * @return
	 */
	public String getItemImageUrl(String id);
	
}
