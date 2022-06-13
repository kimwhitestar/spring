<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctxPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>validatorForm.jsp</title>
  <jsp:include page="/WEB-INF/views/include/bs4.jsp"></jsp:include>
  <script>
	'use strict';
/*   	let imsiMid = '${param.errMid}';
  	if (imsiMid == 'no') {
  		alert('아이디를 입력하세요');
		document.getElementById("mid").focus();  		
  	}
 */  	
  </script>
</head>
<body>
  <p><br></p>
  	<form name="myForm" method="post">
  		<h2>User 체크</h2>
  		<table class="table table-bordered">
			<tr>
				<th>아이디</th>
				<td><input type="text" name="mid" id="mid" class="form-control" autofocus /></td>
			</tr>  		
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="pwd" id="pwd" class="form-control" /></td>
			</tr>
			<tr>
				<th>나이</th>
				<td><input type="number" name="age" id="age" value="20" class="form-control" /></td>
			</tr>  		
			<tr>
				<td colspan="2" class="text-center">
					<input type="button" value="등록하기" class="btn btn-secondary" />&nbsp;
					<input type="reset" value="다시입력" class="btn btn-secondary" />&nbsp;
					<input type="button" value="돌아가기" onclick="history.back()" class="btn btn-secondary" />
				</td>
			</tr>  		
  		</table>
  	</form>
  <p><br></p>
</body>
</html>