package co.mr.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.mr.web.model.MemberInfo;
import co.mr.web.mybatis.MemberInfoMapper;

@RestController
public class MemberController {
	/*
	 * REST(Representational State Transfer: 자원의 상태 전달) - 네트워크 아키텍처
	 * 
	 * 1. 자원의 식별
	 * https://a.co.kr/user/10
	 * 
	 * Resource : user
	 * 식별자 : 10
	 * 
	 * 2. 메시지 전달 형식 (JSON, TEXT)
	 *    - 데이터 전체를 전달하지 않고, 메시지로 전달 
	 *  
	 * 3. HTTP Method
	 *  - GET:	정보 조회
	 *  - POST: 정보 수정
	 *  - PUT:  정보 생성
	 *  - DELETE: 정보 삭제
	 */
	
	
	private MemberInfoMapper memberMapper;
	
	@Autowired
	public MemberController(MemberInfoMapper memberMapper) {
		this.memberMapper= memberMapper;
	}
	
	private Map<String, MemberInfo> memberMap;
	
//	@PostConstruct // 인스턴스 생성후 초기화
//	public void init() {
//		memberMap = new HashMap<String, MemberInfo>();
//		
//		memberMap.put("1", new MemberInfo("1", "홍길동", "123-1234", "대전서구"));
//		memberMap.put("2", new MemberInfo("2", "강길동", "222-1234", "부산서구"));
//		memberMap.put("3", new MemberInfo("3", "이길동", "333-1234", "서울동구"));
//		memberMap.put("4", new MemberInfo("4", "고길동", "444-1234", "인천서구"));
//	}
	
	// member/id 요청이 들어오면 클라이언트에게 json형태 응답을 한다.
	@GetMapping("/member/{id}")
	public MemberInfo getMemberInfo(@PathVariable("id") String id) {
//		return memberMap.get(id);
		return memberMapper.getMemberInfo(id);
	}
	
	@GetMapping("/member/all") // 회원 모든정보 조회 요청
	public List<MemberInfo> getMemberInfoList(){
//		return new ArrayList<MemberInfo>(memberMap.values());
		return memberMapper.getMemberInfoList();
	}
	
	// 데이터 생성시 put 사용, put은 브라우저로 테스트 불가, REST API Client (postman 사용)
	@PutMapping("/member/{id}")
	public void putMemberInfo(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("tel") String tel, @RequestParam("address") String address) {
//		MemberInfo memberInfo = new MemberInfo(id, name, tel, address);
//		memberMap.put(id, memberInfo);
		
		memberMapper.insertMemberInfo(id, name, tel, address);
	}
	
	// 데이터 수정
	@PostMapping("/member/{id}")
	public void postMemberInfo(@PathVariable("id") String id, @RequestParam("name") String name, @RequestParam("tel") String tel, @RequestParam("address") String address) {
//		MemberInfo memberInfo = memberMap.get(id);
//		memberInfo.setName(name);
//		memberInfo.setTel(tel);
//		memberInfo.setAddress(address);
		
		memberMapper.updateMemberInfo(id, name, tel, address);
	}
	
	// 
	@DeleteMapping("/member/{id}")
	public void deleteMemberInfo(@PathVariable("id") String id) {
//		memberMap.remove(id);
		memberMapper.deleteMemberInfo(id);
	}
	
	
	
	
}
