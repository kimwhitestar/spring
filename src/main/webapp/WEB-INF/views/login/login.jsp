<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctxPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>login.jsp</title>
</head>
<body>
  <p><br></p>
  	<div>
  		<h2>로그인 화면</h2>
  		<form>
  			<table class="table table-bordered">
  				<tr>
  					<th>아이디</th>
  					<td><input type="text" id="id" name="id" class="form-control" autofocus/></td>
  				</tr>
  				<tr>
  					<th>등급</th>
  					<td>
  						<!-- 
  							관리자(0)는 모든 서비스와 '관리자 메뉴' 사용
  							우수회원(2)/특별회원(1)은 '방명록,게시판,자료실,유저목록' 사용
  							정회원(3)은 '방명록,게시판,유저목록' 사용
  							준회원(4)은 '방명록' 사용
  							비회원(99)는 모든서비스 사용 금지(memberMain 접속불가) 
  						-->
  						<select name="level" class="form-control">
  							<option value="0">관리자</option>
  							<option value="1">특별회원</option>
  							<option value="2">우수회원</option>
  							<option value="3">정회원</option>
  							<option value="4">준회원</option>
  						</select>
  					</td>
  				</tr>
  				<tr>
  					<th>비밀번호</th>
  					<td><input type="text" id="password" name="password" class="form-control" /></td>
  				</tr>
  				<tr>
  					<td colspan="2" class="text-center">
	  					<input type="button" value="로그인" class="btn btn-secondary" onclick="location.href='${ctxPath}/'" />
	  					<input type="reset" value="다시입력" class="btn btn-secondary"/>
	  					<input type="button" value="메인으로" class="btn btn-secondary" onclick="location.href='${ctxPath}/'" />
  					</td>
  				</tr>
  			</table>
  		</form>
  	</div>
  <p><br></p>
</body>
</html>