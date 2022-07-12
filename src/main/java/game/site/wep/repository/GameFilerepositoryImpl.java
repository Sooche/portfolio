package game.site.wep.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import game.site.wep.dto.GameFile;

@Repository
public class GameFilerepositoryImpl implements GameFilerepository{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insert(GameFile gameFile) {
		
		return sqlSession.insert("game.site.wep.gameFiledMapper.insert",gameFile);
	}
	@Override
	public int update(GameFile gameFile) {
		// TODO Auto-generated method stub
		return sqlSession.update("game.site.wep.gameFiledMapper.update",gameFile);
	}
	@Override
	public int delete(int gfnum) {
		// TODO Auto-generated method stub
		return sqlSession.delete("game.site.wep.gameFiledMapper.delete",gfnum);
	}
	@Override
	public GameFile selectOne(int gfnum) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("game.site.wep.gameFiledMapper.selectOne",gfnum);
	}
	@Override
	public List<GameFile> selectList(int boardnum) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("game.site.wep.gameFiledMapper.selectList",boardnum);
	}
	@Override
	public int filecount(int boardnum) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("game.site.wep.gameFiledMapper.filecount",boardnum);
	}
	
}
