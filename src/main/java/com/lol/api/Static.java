package com.lol.api;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import com.lol.empty.Token;

@SuppressWarnings("static-access")
public class Static {
	/** 登录验证码地址 */
	public static final String CheckURL = "http://check.ptlogin2.qq.com/check?regmaster=&pt_tea=2&pt_vcode=1&uin=201309512&appid=549000912&js_ver=10201&js_type=1&login_sig=8V674YojC1bL8Q3HxWbIJqOU6NoZFnZql20EaO*OIHElu1pWejMkXlt*GUk7fU9p&u1=http%3A%2F%2Fqzs.qq.com%2Fqzone%2Fv5%2Floginsucc.html%3Fpara%3Dizone&r=0.5828571321719136&pt_uistyle=40";
	
	/** API接口地址 */
	public static final String URL = "http://api.pallas.tgp.qq.com";

	/** 心跳连接 */
	public static final String BeatURL = "http://forum.tgp.qq.com/api/forum/get_mymsgnumdetail";
	
	/** 查询地址 参数：?key=英雄昵称 */
	public static final String SeacherURL = URL + "/core/search_player";
	/** 查询单场战斗数据 参数：?area_id=大区id&game_id=单场比赛id */
	public static final String GameDetailURL = URL + "/core/get_battle_info";
	/**
	 * 查询比赛记录地址
	 * 参数：?p=[[3,{"area_id":"22","qquin":"U9664576447373934529","bt_num":"0",
	 * "bt_list":[],"champion_id":0,"offset":0,"limit":8,"mvp_flag":-1}]]
	 */
	public static final String BattleListURL = URL + "/core/get_player_battle_list";
	/**英雄头像接口*/
	public static final String ChampionIconURL = "http://cdn.tgp.qq.com/lol/images/resources/champions/";
	/**用户头像接口*/
	public static final String UserIconURL = "http://cdn.tgp.qq.com/lol/images/resources/usericon/";
	/**用户高级信息接口*/
	public static final String UserExtInfo = URL + "/core/get_user_hot_info";
	/**战绩汇总*/
	public static final String  TCALLURL= URL + "/core/tcall";
	/**周免接口*/
	public static final String FreeURL = "http://lol.qq.com/biz/hero/free.js";
	/**英雄大全接口*/
	public static final String HeroURL = "http://cdn.tgp.qq.com/lol/conf/LOLChampSearch.js";
	/**游戏大区接口*/
	public static final String AreaURL = "http://cdn.tgp.qq.com/lol/conf/LOLGameArea.js";
	/**获取召唤师技能图标接口*/
	public static final String SummonabilityURL = "http://cdn.tgp.qq.com/lol/images/resources/summonability/";
	/**获取装备图标接口*/
	public static final String ItemURL = "http://cdn.tgp.qq.com/lol/images/resources/items/";
	/**获取皮肤接口*/
	public static final String SkinURL = "http://ossweb-img.qq.com/images/lol/appskin/";
}