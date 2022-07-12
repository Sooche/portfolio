package game.site.wep.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import game.site.wep.dto.User;

@Repository
public class UserRepositoryImpl implements Userrepository{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public User selectOne(String email) {
		
		return sqlSession.selectOne("game.site.wep.userMapper.selectOne",email);
	}
	
	public User selectid(String userid) {
		
		return sqlSession.selectOne("game.site.wep.userMapper.selectOne_id",userid);
	}

	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		return sqlSession.insert("game.site.wep.userMapper.insert",user);
	}

	@Override
	public int update_emailauth(String email) {
		// TODO Auto-generated method stub
		return sqlSession.update("game.site.wep.userMapper.update_emailauth",email);
	}

	@Override
	public User selctOne(String userid) {
		
		return sqlSession.selectOne("game.site.wep.userMapper.selectOne_id",userid);
	}



}
