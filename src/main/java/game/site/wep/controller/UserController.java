package game.site.wep.controller;




import java.lang.reflect.Member;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import game.site.wep.advice.ErrorCode;
import game.site.wep.dto.User;

import game.site.wep.service.Userservice;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private Userservice userservice;
	
	
	
	// 가입 폼으로이동
	@GetMapping("join")
	public void join() {
		
	}
	
	//가입버튼을 클릭시
	@PostMapping("join")
	public String join(@ModelAttribute User user, Model model,
		RedirectAttributes rattr,HttpSession session) throws Exception {
		
		ErrorCode errorcode = userservice.insert(user, session) ;
		rattr.addFlashAttribute("msg", errorcode.getMsg());
		
		
		return "redirect:/";//홈으로 이동
	}
	
	//이메일 인증 처리 메소드
	@GetMapping("emailConfirm")
	public String emailConfirm(@RequestParam String authCode, @RequestParam String email,
			HttpSession session,
			RedirectAttributes rattr) {
		//세션의 authCode와 파라메터의 authCode가 일치여부 확인		
		String authCode_s =(String) session.getAttribute("authCode");
		
		if(authCode.equals(authCode_s)) {
			//db의 emailauth를 1로 변경
			userservice.update_emaiauth(email);
			
			rattr.addFlashAttribute("msg", ErrorCode.SUCCESS_EMAILAUTH.getMsg());
		}else {
			rattr.addFlashAttribute("msg", ErrorCode.ERROR_EMAILAUTH.getMsg());
		}
		
		
		return "redirect:/";
		
	}
	@GetMapping("jusoPopup")
	public void jusoPopup() {
		
	}
	@PostMapping("jusoPopup")
	public void jusoPopup(@RequestParam Map<String,String> jusomap,Model model) {
		model.addAttribute("jusomap",jusomap);
	}

	
	
	
		@GetMapping("info")
		public String info(HttpSession session, Model model) {
			String userid = (String) session.getAttribute("userid");
			//한건조회
			User user = userservice.selectOne(userid);
			
			//forward방식 : 주소변경안됨, member + info.jsp  =>response
			model.addAttribute("user", user);
			
			return "user/info";
			
			
		}
	
	
}
