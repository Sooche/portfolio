package game.site.wep;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import game.site.wep.dto.User;
import game.site.wep.repository.Userrepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml",
"file:src/main/webapp/WEB-INF/spring/**/servlet-context.xml"})
public class JunitTests {

	@Autowired
	private Userrepository ur;
	
	@Test void test() {
		
	}
	
	@Test
	public void testuser() {
		User user = new User();
		user.setUserid("wlfqns1151251");
		user.setPasswd("123");
		user.setUsernickname("ㄴㅇㅁ");
		user.setUsername("김릴파");
		user.setEmail("lilpa@ggma222il.com");
		user.setZipcode("14423");
		user.setAddrload("광명로");
		user.setAddrdetail("4호");
		
		int cnt = ur.insert(user);
		System.out.println(cnt+"건 가입");
		
	}

	@Test
	void testone(String email) {
		User user = ur.selectOne("wlfqns1@naver.com");
		System.out.println(user);
		
		
		
		
	}
		
}
