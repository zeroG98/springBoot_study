<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    
<script type="text/javascript">
	function deleteFunc(num){
		location.href="${ctx}/admin/member/memberDelete.do?num="+num;
	}
</script>

<table class='table col-md-9'>
	<thead class="thead-light">
	  <tr> 
	    <th>번호</th>    
	    <th>아이디</th> 
	    <th>비밀번호</th>
	    <th>이름</th>   
	    <th>나이</th>  
	    <th>이메일</th> 
	    <th>전화번호</th>
	    <th>삭제</th>
	  </tr>         
	</thead>
	<tbody>
	<c:forEach var="dto" items="${memberList}">
	  <tr>           
	    <td>${dto.num}</td>        
	    <td><a href="${ctx}/admin/member/memberInfo.do?num=${dto.num}">${dto.id}</a></td>
	    <td>${dto.pw}</td>        
	    <td>${dto.name}</td>      
	    <td>${dto.age}</td>       
	    <td>${dto.email}</td>     
	    <td>${dto.tel}</td>
	    <td><input type="button" class="btn btn-danger" value="삭제" onclick="deleteFunc(${dto.num})"></td>
	  </tr> 
	</c:forEach>  
		<tr>
			<td colspan="8" class="text-center">
				<input type="button" value="회원등록" class="btn btn-primary" onclick="location.href='${ctx}/admin/member/memberJoin.do'"/>
			</td>
		</tr>           
	</tbody>
</table>


