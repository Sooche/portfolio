package game.site.wep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import game.site.wep.dto.Reply;
import game.site.wep.repository.Replyrepository;

@Service
public class ReplyserviceImpl implements Replyservice {

	@Autowired
	private Replyrepository replyrepository;
	
	@Override
	public List<Reply> selectList(int boardnum) {
		
		return replyrepository.selectList(boardnum);
	}

	@Override
	public int insert(Reply reply) {
		//1)글레벨 +1 글순서 +1
		reply.setRelevel(reply.getRelevel()+1);
		reply.setRestep(reply.getRestep()+1);
		//2)글순서가 현재보다 크거나 작은데이터는 +1로 수정
		replyrepository.updateRestep(reply);
		//3)저장
		
		return replyrepository.insert(reply);
	}

	@Override
	public int delete(int rnum) {
		// TODO Auto-generated method stub
		return replyrepository.delete(rnum);
	}

	@Override
	public int update(Reply reply) {
		
		return replyrepository.update(reply);
	}

}
