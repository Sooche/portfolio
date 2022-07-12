package game.site.wep.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import game.site.wep.dto.Reply;

@Repository
public class ReplyrepositoryImpl implements Replyrepository{
	@Autowired
	private SqlSession sqlSession;
		
	
	@Override
	public int insert(Reply reply) {
		
		return sqlSession.insert("game.site.wep.replyMapper.insert",reply);
	}

	@Override
	public int updateRestep(Reply reply) {
		
		return sqlSession.update("game.site.wep.replyMapper.updateRestep",reply);
	}

	@Override
	public int delete(int rnum) {
		// TODO Auto-generated method stub
		return sqlSession.delete("game.site.wep.replyMapper.delete",rnum);
	}

	@Override
	public int update(Reply reply) {
		// TODO Auto-generated method stub
		return sqlSession.update("game.site.wep.replyMapper.update",reply);
	}

	@Override
	public List<Reply> selectList(int boardnum) {
		
		return sqlSession.selectList("game.site.wep.replyMapper.selectList",boardnum);
	}

}
