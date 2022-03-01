<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div style="width:400px; padding:30px; border:1px solid #ddd; border-radius:5px; margin: 50px auto">
<!-- <form action="/WEB_day06/memberInsert.do" method="post"> -->
<form action="${ctx}/admin/member/memberInsert.do" method="post">
<table class="table table-borderless">
<thead>
  <tr>
  	<th colspan="2" class="text-center"><b>회원등록</b></th>
  </tr>
  <tr>
    <td>아이디</td>
    <td><input class="form-control" type="text" name="id"></td>
  </tr>
</thead>
<tbody>
  <tr>
    <td>비밀번호</td>
    <td><input class="form-control" type="password" name="pw"></td>
  </tr>
  <tr>
    <td>이름</td>
    <td><input class="form-control" type="text" name="name"></td>
  </tr>
  <tr>
    <td>나이</td>
    <td><input class="form-control" type="text" name="age"></td>
  </tr>
  <tr>
    <td>이메일</td>
    <td><input class="form-control" type="text" name="email"></td>
  </tr>
  <tr>
    <td>전화번호</td>
    <td><input class="form-control" type="text" name="tel"></td>
  </tr>
  <tr>
    <td colspan="2" class="text-center">
    	<input type="submit" value="등록" class="btn btn-primary mr-2"/>
    	<input type="reset" value="취소" class="btn btn-info"/>
    </td>
  </tr>
</tbody>
</table>
</form>
</div>

