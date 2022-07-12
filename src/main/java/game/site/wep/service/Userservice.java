package game.site.wep.service;

import java.lang.reflect.Member;
import java.util.Map;

import javax.servlet.http.HttpSession;

import game.site.wep.advice.ErrorCode;
import game.site.wep.dto.User;

public interface Userservice {

	ErrorCode insert(User user, HttpSession session) throws Exception;

	void update_emaiauth(String email);

	User selectOne(String userid);


	
	

}
