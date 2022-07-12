package game.site.wep.repository;

import java.util.List;

import game.site.wep.dto.Reply;

public interface Replyrepository {

	int updateRestep(Reply reply);

	int insert(Reply reply);

	int delete(int rnum);

	int update(Reply reply);

	List<Reply> selectList(int boardnum);

}
