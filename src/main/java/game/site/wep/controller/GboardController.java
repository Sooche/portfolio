package game.site.wep.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import game.site.wep.advice.ErrorCode;
import game.site.wep.dto.Gameboard;
import game.site.wep.dto.Page;
import game.site.wep.dto.Trade;
import game.site.wep.dto.User;
import game.site.wep.repository.Gameboardrepository;
import game.site.wep.service.FileService;
import game.site.wep.service.GameFileservice;
import game.site.wep.service.Gameboardservice;
import game.site.wep.service.Replyservice;
import game.site.wep.service.Userservice;

@Controller
@RequestMapping("gboard")
//@SessionAttributes("page") //1) 세션에 담을 변수명 : Page page; (초기 null)
public class GboardController {

	@Autowired
	private Gameboardservice gameboardservice;
	@Autowired
	private GameFileservice gameFileservice;
	@Autowired
	private FileService fileService;
	@Autowired
	private Gameboardrepository gameboardrepository;
	@Autowired
	private Replyservice replyservice;
	
	@Autowired
	private Userservice userservice; 
	
	//
	@GetMapping("/")
	public String listhome(Page page,Model model) {//2)page 객체 생성
		
		model.addAttribute("page",page); //3) 세션에 할당
		
		return "redirect:list";
	}
	
	@GetMapping("list")
	public void list(@ModelAttribute("page")Page page,Model model ) {
		
		model.addAttribute("gamelist",gameboardservice.selectList(page));
	}
	
	
	
	
	
	
	//게시 화면으로 이동
	@GetMapping("add")
	public void add() {
		//추가 페이지로이동
		
	}
	
	@PostMapping("add")
	public String add(Gameboard gameboard,HttpServletRequest request, RedirectAttributes rattr) throws Exception {
		
		ErrorCode errorCode= gameboardservice.insert(gameboard);
		//리스트 이동
		rattr.addFlashAttribute("msg",errorCode.getMsg());
		
		return"redirect:/gboard/list";
	}
	
	//상세페이지 이동
	@GetMapping("detail")
	public void detail(@RequestParam int boardnum,Model model,User user,Trade trade,HttpSession sesstion
			) {
		
		String userid = (String) sesstion.getAttribute("userid");
		//게시물 조회
		model.addAttribute("gameboard",gameboardservice.selectOne(boardnum));
		//파일 조회
		
		model.addAttribute("gamefile",gameFileservice.selectList(boardnum));
		model.addAttribute("filecount",gameFileservice.filecount(boardnum));
		
		//거래내역 불러오기
		trade.setBoardnum(boardnum);
		trade.setUserid(userid);
		model.addAttribute("tradelog",gameboardservice.tradelog(trade));
		//댓글 불러오기
		 model.addAttribute("reply",replyservice.selectList(boardnum));
	
	}
	@PostMapping("detail")
	public String detail(Gameboard gameboard,Trade trade,Model model,HttpSession sesstion
			,String userid,int boardnum, RedirectAttributes rattr)  {
		
		//아이디 불러오기
		
		sesstion.getAttribute("userid");
		
		//구매
		model.addAttribute("mygame",gameboardservice.gamebuy(trade));
		//총판매수 합산
		model.addAttribute("sellcnt",gameboardservice.sellcnt(boardnum));
		
		
		
		return "redirect:/gboard/list";
	}
	
	//파일다운로드
	@GetMapping("filedownload")
	public void filedownload(@RequestParam String setupfile,HttpServletResponse res) throws Exception{
		
		fileService.fileDownload(setupfile, res);
		
	}
	
	

	
	
}
