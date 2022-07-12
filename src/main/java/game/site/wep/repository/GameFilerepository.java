package game.site.wep.repository;

import java.util.List;


import game.site.wep.dto.GameFile;

public interface GameFilerepository {
	int insert(GameFile gameFile);
	int update(GameFile gameFile);
	int delete(int gfnum);
	GameFile selectOne(int gfnum);
	List<GameFile> selectList(int boardnum);
	int filecount(int boardnum);

}
