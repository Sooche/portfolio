package game.site.wep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import game.site.wep.advice.ErrorCode;
import game.site.wep.dto.User;
import game.site.wep.repository.Userrepository;

@Service
public class LoginserviceImpl implements Loginservice{
	
	@Autowired
	private Userrepository userrepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public ErrorCode loginCheck(String userid, String passwd) {
		User user = userrepository.selectid(userid);
		
		//1)아이디조회
		if(userid == null) {
			return ErrorCode.ERROR_LOGIN_USERID;
		}
		//2)비밀번호
		//평문과 암호문을 비교
		boolean match =bCryptPasswordEncoder.matches(passwd, user.getPasswd());
		if(!match) {
			return ErrorCode.ERROR_LOGIN_PASSWD;
		}
		//성공
		
		return ErrorCode.SUCCESS_LOGIN;
	}

}
