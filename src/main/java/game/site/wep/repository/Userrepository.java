package game.site.wep.repository;

import game.site.wep.dto.User;

public interface Userrepository  {

	User selectOne(String email);
	
	User selectid(String userid);
	
	int insert(User user);

	int update_emailauth(String email);
	
	User selctOne(String userid);
}
