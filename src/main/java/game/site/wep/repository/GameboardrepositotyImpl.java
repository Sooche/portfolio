package game.site.wep.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import game.site.wep.dto.Gameboard;
import game.site.wep.dto.Page;
import game.site.wep.dto.Trade;

@Repository
public class GameboardrepositotyImpl implements Gameboardrepository{
	@Autowired 
	private SqlSession sqlSeeion;
	
	@Override
	public int insert(Gameboard gameboard) {
		return sqlSeeion.insert("game.site.wep.gameboardMapper.insert",gameboard);
		
		
	}

	@Override
	public List<Gameboard> selectList(Page page) {
		
		return sqlSeeion.selectList("game.site.wep.gameboardMapper.selctList", page);
	}

	@Override
	public int selectTotalCnt(Page page) {
		
		return sqlSeeion.selectOne("game.site.wep.gameboardMapper.selectTotalCnt",page);
	}

	@Override
	public Gameboard selectOne(int boardnum) {
		
		return sqlSeeion.selectOne("game.site.wep.gameboardMapper.selectOne",boardnum);
	}

	@Override
	public int gamebuy(Trade trade) {
		
		return sqlSeeion.insert("game.site.wep.gameboardMapper.gamebuy",trade);
	}

	@Override
	public int tradelog(Trade trade) {
		
		return sqlSeeion.selectOne("game.site.wep.gameboardMapper.tradelog",trade);
	}

	@Override
	public int sellcnt(int boardnum) {
		
		return sqlSeeion.update("game.site.wep.gameboardMapper.sellcnt",boardnum);
	}



}
