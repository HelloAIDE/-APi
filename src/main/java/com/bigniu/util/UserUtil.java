package com.bigniu.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
public class UserUtil {
	public  static  String timeToString(long time,String dataformat){
		SimpleDateFormat sdf = new SimpleDateFormat(dataformat);
		String data = sdf.format(time);
		return data;
		
		
	}
	
	public  static  String timeToString(long time){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String data = sdf.format(time);
		return data;
		
		
	}
	
	public  static  String getStringTime(){
		long time = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String data = sdf.format(time);
		return data;
		
		
	}
	public static boolean openFile(String path){
		File file=new File(path);    
		if(!file.exists())    
		{    
			File file1 =new File(file.getParent());    
			//如果文件夹不存在则创建    
			if  (!file1 .exists()  && !file1 .isDirectory())      
			{   //目录不存在创建目录
			    file1 .mkdirs();    
			} else   
			{  
			    //目录存在不做任何操作
			}  
		    try {    
		        file.createNewFile();    
		        return true;
		    } catch (IOException e) {    
		        // TODO Auto-generated catch block    
		        e.printStackTrace();    
		        return false;
		    }    
		}    
		  return false;
	}
	 public static  String getIpAddr(HttpServletRequest request) {
		    String ip = request.getHeader("x-forwarded-for");
		    if(ip == null || ip.length() == 0 ||"unknown".equalsIgnoreCase(ip)) {
		        ip = request.getHeader("Proxy-Client-IP");
		    }
		    if(ip == null || ip.length() == 0 ||"unknown".equalsIgnoreCase(ip)) {
		        ip = request.getHeader("WL-Proxy-Client-IP");
		    }
		    if(ip == null || ip.length() == 0 ||"unknown".equalsIgnoreCase(ip)) {
		        ip = request.getRemoteAddr();
		    }
		    return ip;
		 }
}
