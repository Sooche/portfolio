package game.site.wep.service;

import java.util.Map;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import game.site.wep.advice.ErrorCode;
import game.site.wep.dto.User;
import game.site.wep.repository.Userrepository;

@Service
public class UserserviceImpl implements Userservice{
	@Autowired
	private Userrepository userrepository;
	
	//비밀번호 암호화
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	//이메일 전송
	@Autowired
	private JavaMailSender mailSender;
	
	@Override
	public ErrorCode insert(User user,HttpSession session) throws Exception {
		
	//1)중복이메일 체크
	User dbuser = userrepository.selectOne(user.getEmail());
	if(dbuser != null) {
		return ErrorCode.ERROR_JOIN_ID_EXIST;
	}
		
	//2)패스워드 암호화
	String cryptPasswd = bCryptPasswordEncoder.encode(user.getPasswd());
		user.setPasswd(cryptPasswd);
		
	//3)이메일전송	
		String authCode = sendAuthMail(user.getEmail());
		
		
		
		//4)저장
		 userrepository.insert(user);
		
		 session.setMaxInactiveInterval(60*60*2);
		session.setAttribute("authCode", authCode); //이메일 인증번호
		
		
		return ErrorCode.SUCCESS_JOIN;
	}

	//인증번호 6자리 만들기
		private String getAuthCode() {
			StringBuffer authCode = new StringBuffer();
			Random random = new Random();
			for(int i=0; i< 6; i++)
				authCode.append(random.nextInt(10)) ; //0~9사이의 정수
				
			return authCode.toString();
		}
	
	
	public String sendAuthMail(String email) throws MessagingException {
		//6자리 인증번호
		String authCode = getAuthCode();
		//보낼 이메일 내용
		StringBuffer content = new StringBuffer();
		content.append(email + "님 반갑습니다. 아래링크를 클릭해주세요<br>");
		//윈도우용 이메일 
		content.append("<a href='http://localhost:8081/wep/user/emailConfirm?authCode="+authCode+"&email="+email+"'>이메일인증확인</a>");
		
		//우분투용 이메일
		//content.append("<a href='http://101.101.209.59:8080/GameWepSite/user/emailConfirm?authCode="+authCode+"&email="+email+"'>이메일인증확인</a>");
		
		//보낼메일 메시지 객체 생성
		MimeMessage message= mailSender.createMimeMessage();
		
		message.setSubject("회원가입 이메일 인증","utf-8");
		message.setText(content.toString(), "utf-8","html");
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
	
		//메일보내기
		mailSender.send(message);		
		
		
		return authCode;
	}


	@Override
	public void update_emaiauth(String email) {
		// 이메일 인증
		int cnt = userrepository.update_emailauth(email);
		System.out.println(cnt);
		
	}

	@Override
	public User selectOne(String userid) {
		// TODO Auto-generated method stub
		return userrepository.selectOne(userid);
	}

	
	
}
