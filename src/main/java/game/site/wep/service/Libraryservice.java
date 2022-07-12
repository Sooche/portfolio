package game.site.wep.service;

import java.util.List;

import org.springframework.stereotype.Service;

import game.site.wep.dto.Page;
import game.site.wep.dto.Trade;


public interface Libraryservice {

	List<Trade> selectList(Trade trade);
	
	
	
}
