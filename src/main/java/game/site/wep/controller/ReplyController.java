package game.site.wep.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import game.site.wep.dto.Reply;
import game.site.wep.service.Replyservice;

@RestController
@RequestMapping("reply")
public class ReplyController {
	@Autowired
	private Replyservice replyservice;
	
	@PostMapping("/")
	public String add (@RequestBody Reply reply,HttpServletRequest request) {
		
		replyservice.insert(reply);
		
		return "add success";
	}
	
	//댓글의 리스트
	@GetMapping("list/{boardnum}")
	public List<Reply> list(@PathVariable int boardnum){
		List<Reply> rlist = replyservice.selectList(boardnum);
		
		return rlist;
	}
	

	@DeleteMapping("{rnum}")
	public String remove(@PathVariable int rnum) {
		replyservice.delete(rnum);
		return "remove ok" ;
	}
	
	@PutMapping("/")
	public String modify(@RequestBody Reply reply,HttpServletRequest request ) {
		replyservice.update(reply);
		return "modify ok";
		
	}
	
}
