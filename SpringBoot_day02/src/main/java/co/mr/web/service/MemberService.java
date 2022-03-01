package co.mr.web.service;

import java.util.List;

import co.mr.web.model.MemberDTO;

public interface MemberService {

	List<MemberDTO> memberList();

	void memberInsert(MemberDTO dto);

	void memberDelete(int num);

	MemberDTO memberInfo(int num);

	void memberUpdate(MemberDTO dto);



}
