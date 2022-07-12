package game.site.wep.service;

import game.site.wep.advice.ErrorCode;

public interface Loginservice {

	ErrorCode loginCheck(String userid, String passwd);

}
