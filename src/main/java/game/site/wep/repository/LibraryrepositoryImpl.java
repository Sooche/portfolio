package game.site.wep.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import game.site.wep.dto.Page;
import game.site.wep.dto.Trade;

@Repository
public class LibraryrepositoryImpl implements Libraryrepository{

	@Autowired
	private SqlSession sqlSession;
		
	@Autowired
	private Libraryrepository libraryrepository;

	@Override
	public int selectTotalCnt(Page page) {
		
		return sqlSession.selectOne("game.site.wep.libraryMapper.selectTotalCnt",page);
	}
	@Override
	public List<Trade> selectList(Trade trade) {
		
		return sqlSession.selectList("game.site.wep.libraryMapper.selectList",trade);
	}
	
	


}
