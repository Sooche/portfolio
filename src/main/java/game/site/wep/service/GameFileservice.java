package game.site.wep.service;

import java.util.List;

import game.site.wep.dto.GameFile;

public interface GameFileservice {
	//gamefile db에 접근
	List<GameFile> selectList(int boardnum);

	int filecount(int boardnum);
}
