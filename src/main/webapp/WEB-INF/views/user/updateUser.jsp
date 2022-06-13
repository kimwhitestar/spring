<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctxPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>updateUser.jsp</title>
  <jsp:include page="/WEB-INF/views/include/bs4.jsp"></jsp:include>
  <script>
  'use strict';
  function fCheck() {
	  myForm.submit();
  }
  </script>
</head>
<body>
  <p><br></p>
    <form name="myForm" method="post" action="${ctxPath}/user/updateUser?idx=${vo.idx}">
  	<h2>User수정창</h2>
  	<table class="table table-bordered">
  		<tr>
  			<th>아이디 </th>
  			<td><input type="text" name="mid" id="mid" value="${vo.mid}" class="form-control" autofocus /></td>
  		</tr>
  		<tr>
  			<th>성명</th>
  			<td><input type="text" name="name" id="name" value="${vo.name}" class="form-control"/></td>
  		</tr>
  		<tr>
  			<th>나이</th>
  			<td><input type="number" name="age" id="age" value="${vo.age}" class="form-control"/></td>
  		</tr>
  		<tr>
  			<th>주소</th>
  			<td><input type="text" name="address" id="address" value="${vo.address}" class="form-control"/></td>
  		</tr>
  		<tr>
  			<td colspan="2">
				<input type="button" value="User수정" onclick="fCheck()" class="btn btn-secondary"/>&nbsp;
				<input type="reset" value="다시작성" class="btn btn-secondary"/>&nbsp;
				<input type="button" value="돌아가기" onclick="location.href='${ctxPath}/user/userList'" class="btn btn-secondary"/>
  			</td>
  		</tr>
  	</table>
  </form>
  <p><br></p>
</body>
</html>