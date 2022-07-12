package game.site.wep;

import static org.junit.Assert.*;

import javax.mail.MessagingException;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import game.site.wep.dto.User;
import game.site.wep.repository.Gameboardrepository;
import game.site.wep.repository.Userrepository;
import game.site.wep.service.UserserviceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/**/servlet-context.xml"})
public class jtest2 {
	@Autowired
	private Userrepository userrepository;

	@Test
	public void test() {
		User user = userrepository.selectOne("lilpa@gmail.com");
		System.out.println(user);
	}

	
	
	/* 이메일 보내기 */
	@Autowired
	private  UserserviceImpl ui;
	@Test
	public void testMailSend() throws MessagingException {
		//"codingtreeksy@gmail.com" : 받는사람 메일주소
		ui.sendAuthMail("wlfqns1@naver.com");
	}

}
