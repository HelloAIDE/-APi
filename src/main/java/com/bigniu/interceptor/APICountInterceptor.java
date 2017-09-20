package com.bigniu.interceptor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.bigniu.model.History;
import com.bigniu.model.Token;
import com.bigniu.service.HistoryService;
import com.bigniu.service.ICountService;
import com.bigniu.service.TokenService;
import com.bigniu.util.UserUtil;
import com.bigniu.util.date.DateUtil;
import com.bigniu.util.date.DateUtil_2;
import com.bigniu.util.date.DateUtil_3;
import com.lol.empty.JsonResult;
@Component
public class APICountInterceptor implements HandlerInterceptor {
	protected final Logger LOG = LoggerFactory.getLogger(APICountInterceptor.class);
	@Autowired
	private ICountService countService;
	@Autowired
	TokenService tokenService;
	@Resource(name="historyServiceImp")
	HistoryService historyService;

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("arg2:"+arg2.getClass());
		if(arg2 instanceof HandlerMethod)
		{
		}
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain;charset='utf-8'"); 
		if (countService.selectToday() == null) {
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			countService.insertToday();
			System.out.println("定时器还未执行，直接插入当天计数，成功-------->" + format.format(new Date()));
		}
		String ip = UserUtil.getIpAddr(request);
		String url = request.getServletPath();
		countService.updateToday();
		//Token验证
		String tokenStr = request.getHeader("Token");
		String path = request.getRequestURI();
		LOG.info("请求ip:" + ip);
		LOG.info("请求url:" + url);
		LOG.info("请求tokenStr:" + tokenStr);
		LOG.info("RequestPath：" + path);
		if(!path.startsWith("/api")){
			return true;
		}
		if (tokenStr == null) {
			LOG.info("tokenStr为空");
			response.sendRedirect(request.getContextPath() + "/error.do?mess=token error");
			return false;
		}
		Token token=null;
		try{
			token = tokenService.getTokenByValue(tokenStr);
		}catch(Exception e){
			LOG.info("token获取异常");
			response.sendRedirect(request.getContextPath() + "/error.do?mess="+e.getMessage());
			return false;
		}
		if (token == null) {
			LOG.info("token为空");
			response.sendRedirect(request.getContextPath() + "/error.do?mess=token error");
			return false;
		}
		if(DateUtil.StringToDate(token.getEndTime()).before(new Date())){
			LOG.info("token为空");
			response.sendRedirect(request.getContextPath() + "/error.do?mess=token expiration");
			return false;
		}
		tokenService.addCount(String.valueOf(token.getId()),ip,url);
		History history = new History();
		history.setIp(ip);
		history.setPath(path);
		history.setToken(token.getValue());
		historyService.addHistory(history);
		return true;
	}
}
