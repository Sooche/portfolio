package game.site.wep;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
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
public class mysqltest {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/Gsitedb?useSSL=false&serverTimezone=Asia/Seoul";
	private static final String USER = "root";
	private static final String PASSWORD ="1111";
	
	
	
	
	@Inject
	 private SqlSessionFactory sqlFactory;
	 
	@Autowired
	private Userrepository ur;
	
	
	@Test
	public void testconect() throws Exception {
		Class.forName(DRIVER);
		try(Connection connection = DriverManager.getConnection(URL,USER,PASSWORD)){
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void testuser() {
		User user = new User();
		user.setUserid("wlfqns1");
		user.setPasswd("123");
		user.setUsernickname("ㄴㅇㅁ");
		user.setUsername("김릴파");
		user.setEmail("lilpa@gmail.com");
		user.setZipcode("14423");
		user.setAddrload("광명로");
		user.setAddrdetail("4호");
		
		int cnt = ur.insert(user);
		System.out.println(cnt+"건 가입");
		
	}
	@Test void testone(String email) {
		User user = ur.selectOne("wlfqns1@naver.com");
		System.out.println(user);
		
		
		
		
	}
	
	
	 @Test
	 public void testFactory(){
	     System.out.println("\n >>>>>>>>>> sqlFactory 출력 : "+sqlFactory);
	 }
	 
	 @Test
	 public void testSession() throws Exception{
	     
	     try(SqlSession session = sqlFactory.openSession()){
	         
	         System.out.println(" >>>>>>>>>> session 출력 : "+session+"\n");
	         
	     } catch (Exception e) {
	         e.printStackTrace();
	     }
	 }
	 
}
