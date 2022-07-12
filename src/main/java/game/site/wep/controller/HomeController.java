package game.site.wep.controller;



import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import game.site.wep.advice.ErrorCode;
import game.site.wep.service.Loginservice;



@Controller
public class HomeController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private Loginservice loginservice;
	

	//홈으로 이동
	@GetMapping("/")
	public String home() {
		
		
		return "home";
	}

	
	@GetMapping("login")
	public void login(HttpSession session,Model model) {
		
	}
	
	@PostMapping("login")
	public String login(@RequestParam String userid , @RequestParam String passwd
			,RedirectAttributes rattr,HttpSession session) {
		
		ErrorCode errorCode = loginservice.loginCheck(userid,passwd);
		//성공하면 홈으로 아니면 login 으로다시이동
		int code =errorCode.getCode();
		
		rattr.addFlashAttribute("msg",errorCode.getMsg());
		
		if(code==0) {//성공
				session.setAttribute("userid", userid);
				return "redirect:/";
		}
		
		
		return "redirect:login";
	}
	
	//로그아웃
	@GetMapping("logout")
	public String logout(HttpSession session) {
		
		//세션지우기
		session.invalidate();
		
		return "redirect:/";
		
	}
	
	
	
	
	
	
}


