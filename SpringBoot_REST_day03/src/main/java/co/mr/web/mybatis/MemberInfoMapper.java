package co.mr.web.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import co.mr.web.model.MemberInfo;

@Mapper // 매퍼로 인식시켜줌
public interface MemberInfoMapper {

	@Select("select * from MemberInfo where id=#{id}")
	MemberInfo getMemberInfo(@Param("id") String id);
	
	@Select("select * from MemberInfo")
	List<MemberInfo> getMemberInfoList();
	
	@Insert("insert into MemberInfo values(#{id}, #{name}, #{tel}, #{address})")
	int insertMemberInfo(@Param("id") String id, @Param("name") String name, @Param("tel") String tel, @Param("address") String address);
	
	@Update("update MemberInfo set name=#{name}, tel=#{tel}, address=#{address} where id=#{id}")
	int updateMemberInfo(@Param("id") String id, @Param("name") String name, @Param("tel") String tel, @Param("address") String address);
	
	@Delete("delete from MemberInfo where id=#{id}")
	int deleteMemberInfo(@Param("id") String id);
	
	
}
