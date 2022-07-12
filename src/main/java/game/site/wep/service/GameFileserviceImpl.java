package game.site.wep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import game.site.wep.dto.GameFile;
import game.site.wep.repository.GameFilerepository;

@Service
public class GameFileserviceImpl implements GameFileservice{

		@Autowired
		private GameFilerepository gameFilerepository;
	@Override
	public List<GameFile> selectList(int boardnum) {
		// TODO Auto-generated method stub
		return gameFilerepository.selectList(boardnum);
	}
	@Override
	public int filecount(int boardnum) {
		// TODO Auto-generated method stub
		return gameFilerepository.filecount(boardnum);
	}

}
