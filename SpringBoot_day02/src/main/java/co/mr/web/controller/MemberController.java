package co.mr.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.mr.web.model.MemberDTO;
import co.mr.web.service.MemberService;

@Controller
@RequestMapping("/admin/member")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@RequestMapping("/memberList.do")
	public String memberList(Model model) {
		List<MemberDTO> list = service.memberList();
		model.addAttribute("memberList", list);
		
//		return "admin/member/memberList"; //ResourceResolver
		return "admin.member.memberList"; //TilesResolver
	}
	
	@RequestMapping("/memberInsert.do")
	public String memberInsert(MemberDTO dto) {
		service.memberInsert(dto);
		
		return "redirect:memberList.do";
	}
	
	@RequestMapping("/memberJoin.do")
	public String memberJoin() {
//		return "admin/member/join";
		return "admin.member.join";
	}
	
	@RequestMapping("/memberDelete.do")
	public String memberDelete(int num) {
		service.memberDelete(num);
		
		return "redirect:memberList.do";
	}
	
	@RequestMapping("/memberInfo.do")
	public String memberInfo(int num, Model model) {
		MemberDTO dto = service.memberInfo(num);
		model.addAttribute("dto", dto);
		
		return "admin.member.memberInfo";
	}
	
	@RequestMapping("/memberUpdate.do")
	public String memberUpdate(MemberDTO dto) {
		service.memberUpdate(dto);
		
		return "redirect:memberList.do";
	}
}
