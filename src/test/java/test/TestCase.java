package test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bigniu.service.TokenService;

public class TestCase {
	private TokenService tokenService;

	@Before
	public void init() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
		tokenService = context.getBean("tokenServiceImp", TokenService.class);
	}
	
	@Test
	public void test1(){
		tokenService.addToken();
	}
}
