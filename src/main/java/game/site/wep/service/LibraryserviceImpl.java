package game.site.wep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import game.site.wep.dto.Page;
import game.site.wep.dto.Trade;
import game.site.wep.repository.Libraryrepository;

@Service
public class LibraryserviceImpl implements Libraryservice {

	@Autowired
	private Libraryrepository libraryrepository;
		
	@Override
	public List<Trade> selectList(Trade trade) {
	
		
		return libraryrepository.selectList(trade);
	}

}
