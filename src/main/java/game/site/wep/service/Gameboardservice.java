package game.site.wep.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import game.site.wep.advice.ErrorCode;
import game.site.wep.dto.Gameboard;
import game.site.wep.dto.Page;
import game.site.wep.dto.Trade;

public interface Gameboardservice {

	List<Gameboard> selectList(Page page);
	
	ErrorCode insert(Gameboard gameboard) throws Exception;

	Gameboard selectOne(int boardnum);

	int gamebuy(Trade trade);

	int tradelog(Trade trade);

	int sellcnt(int boardnum);

	

}
