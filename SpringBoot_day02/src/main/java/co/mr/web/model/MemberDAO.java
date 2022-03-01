package co.mr.web.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MemberDAO {

	List<MemberDTO> memberList();

	void memberInsert(MemberDTO dto);

	void memberDelete(int num);
	
	MemberDTO memberInfo(int num);

	void memberUpdate(MemberDTO dto);

}
