package game.site.wep.controller;

import javax.servlet.http.HttpSession;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysql.cj.Session;

import game.site.wep.dto.Page;
import game.site.wep.dto.Trade;
import game.site.wep.repository.Libraryrepository;
import game.site.wep.service.Libraryservice;

@Controller
@RequestMapping("user")
public class LibraryController {
	
	@Autowired
	private Libraryrepository libraryrepository;
	@Autowired
	private Libraryservice libraryservice;
	
	@GetMapping("/")
	public void libraryhome(Page page,Model model,HttpSession sesstion
			,@RequestParam String userid,Trade trade) {
		
		
		
		//구매 목록 조회
		model.addAttribute("library",libraryservice.selectList(trade));
		
	
		
	 	
	}
	@GetMapping("library")
	public void library(@ModelAttribute("page")Page page,Model model
			,HttpSession sesstion,Trade trade) {
		
		
		
		
		model.addAttribute("library",libraryservice.selectList(trade));
		
	}
	
	
	
}
