<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctxPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>menu.jsp</title>
</head>
<body>
  <p style="text-align:left">
  	<a href="${ctxPath}/">홈으로</a> |
  	<a href="${ctxPath}/tiles/guest/guestList">방명록</a> |
  	<a href="${ctxPath}/tiles/board/boardList">게시판</a> |
  	<a href="${ctxPath}/tiles/pds/pdsList">자료실</a> |
  	<a href="${ctxPath}/tiles/user/userList">유저목록</a> |
  	<a href="${ctxPath}/tiles/user/userLogin">로그인</a> 
  	<a href="${ctxPath}/tiles/user/userLogout">로그아웃</a> 
  </p>
</body>
</html>