package co.mr.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import co.mr.web.model.MemberDAO;
import co.mr.web.model.MemberDTO;

//스프링 컨테이너(IoC 컨테이너)에 담기 위한 어노테이션
//@Controller, @RestController, @Repository, @Service, @Component, @Configuration 

//@RestController
@Service 
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberDAO memberDao;
	
	@Override
	public List<MemberDTO> memberList() {
		List<MemberDTO> list = memberDao.memberList();
		
		return list;
	}
	
	@Override
	public void memberInsert(MemberDTO dto) {
		memberDao.memberInsert(dto);
	}

	@Override
	public void memberDelete(int num) {
		memberDao.memberDelete(num);
		
	}

	@Override
	public MemberDTO memberInfo(int num) {
		MemberDTO member = memberDao.memberInfo(num);
		return member;
	}

	@Override
	public void memberUpdate(MemberDTO dto) {
		memberDao.memberUpdate(dto);
		
	}

	
}
