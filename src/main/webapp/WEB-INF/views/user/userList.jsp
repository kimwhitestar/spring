<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctxPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>title</title>
  <jsp:include page="/WEB-INF/views/include/bs4.jsp"></jsp:include>
  <script>
  'use strict';
  function delCheck(idx) {
	  location.href='${ctxPath}/user/deleteUser?idx=${vo.idx}'
  }
  </script>
</head>
<body>
  <p><br></p>
  	<h2>유저목록</h2>
  	<div>
  		<input type="button" value="User등록" onclick="location.href='${ctxPath}/user/insertUser'"/>
  	</div>
  	<table class="table table-hover">
  		<tr>
  			<th>번호</th>
  			<th>아이디</th>
  			<th>성명</th>
  			<th>나이</th>
  			<th>주소</th>
  			<th>비고</th>
  		</tr>
  		<c:forEach var="vo" items="${vos}">
	  		<tr>
	  			<td>${vo.idx}</td>
	  			<td>${vo.mid}</td>
	  			<td>${vo.name}</td>
	  			<td>${vo.age}</td>
	  			<td>${vo.address}</td>
	  			<td>
	  				<input type="button" value="수정" class="btn btn-primary" onclick="location.href='${ctxPath}/user/updateUser'" />
	  				<input type="button" value="삭제" class="btn btn-danger" onclick="javascript:delCheck(${vo.idx})" />
	  			</td>
	  		</tr>
  		</c:forEach>
  	</table>
  <p><br></p>
</body>
</html>