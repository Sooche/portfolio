package game.site.wep.service;

import java.util.List;

import game.site.wep.dto.Reply;

public interface Replyservice {

	List<Reply> selectList(int boardnum);

	int insert(Reply reply);

	int delete(int rnum);

	int update(Reply reply);

}
