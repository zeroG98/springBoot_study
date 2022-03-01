package co.mr.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController // 텍스트를 리턴한다(jsp같은 뷰는 리턴할 수 없다.) 
@Controller // jsp같은 뷰를 리턴할 때 사용

//@RequestMapping("/faq/board") 클래스에 붙이면 메소드에서는 하위 경로만 적으면 된다. 
public class HomeController {
	
	@RequestMapping("/")
	public String testEx() {
		return "index";
	}
	
//	@RequestMapping("/delete")
//	public String test() {
//		return "Hi 스프링";
//	}
//	
//	@RequestMapping("/showJsp")
//	public String showJsp() {
//		
//		return "test";
//	}
}
