package game.site.wep.repository;

import java.util.List;

import game.site.wep.dto.Gameboard;
import game.site.wep.dto.Page;
import game.site.wep.dto.Trade;

public interface Gameboardrepository {

	int insert(Gameboard gameboard);

	List<Gameboard> selectList(Page page); //page 는 페이징처리를 위한 정보

	int selectTotalCnt(Page page);

	Gameboard selectOne(int boardnum);

	int gamebuy(Trade trade);

	int tradelog(Trade trade);

	int sellcnt(int boardnum);

}
