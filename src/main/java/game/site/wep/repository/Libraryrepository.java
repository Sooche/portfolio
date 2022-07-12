package game.site.wep.repository;

import java.util.List;

import game.site.wep.dto.Page;
import game.site.wep.dto.Trade;

public interface Libraryrepository {

	int selectTotalCnt(Page page);

	List<Trade> selectList(Trade trade);


}
