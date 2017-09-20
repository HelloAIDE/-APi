package com.lol.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.bigniu.main.GetPkey;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.lol.empty.Token;
import com.lol.util.GetQQCookieUtil;
import com.lol.util.URLUtil;

/**
 * 对指定TGP接口进行请求
 * 
 * @author BigNiu
 * @date 创建时间：2017年3月11日 下午9:26:00
 * @version 1.0
 */
public class HttpConnection {
	private static int count = 0;
	private static List<Token> list = new ArrayList<Token>();

	private HttpConnection() {

	}

	private static final String ua = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/43.0.2357.130 Safari/537.36 qblink tgp_daemon.exe QBCore/3.43.45.400 QQBrowser/9.0.2524.400";
	Response res;
	private static Map<String, String> cookies = new HashMap<String, String>();

	/**
	 * @param url
	 *            链接地址
	 * @param params
	 *            请求参数
	 * @return 返回TGP官方Json数据
	 */
	public static String getJson(String url, Map<String, String> params) {
		String data = "";
		Random ran = new Random();
		int a = -1;
		try{
			System.out.println("开始获取。");
			String cookie = GetPkey.getPkey();
			System.out.println("cookie:"+cookie);
			cookies.putAll(URLUtil.URLRequest(cookie));
		}catch(Exception e){
			e.printStackTrace();
		}
		Document el;
		try {
			el = Jsoup.connect(url).data(params).cookies(cookies)
					.referrer(
							"http://game.tgp.qq.com/lol/profile/v1602/overview.shtml?qquin=U9664576447373934529&area_id=22")
					.userAgent(ua).header("Accept", "*/*").ignoreContentType(true).get();
			data = el.text();
			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			data = "{\"retCode\": 2001, \"msg\": \"网络连接出错\"}";
		}
		System.out.println(data);
		return data;
	}
}
