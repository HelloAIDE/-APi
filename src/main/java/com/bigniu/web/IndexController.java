package com.bigniu.web;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lol.empty.JsonResult;

@Controller
public class IndexController {
	@ResponseBody
	@RequestMapping("/error.do")
	public JsonResult error(HttpServletRequest request, HttpServletResponse response,String mess){
		System.out.println("mess"+mess);
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain;charset='utf-8'"); 
		return new JsonResult(mess);
	}
}
