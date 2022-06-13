<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctxPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>memberMain.jsp</title>
</head>
<body>
  <p><br></p>
  Tiles 레이아웃이 적용된 화면입니다
  <hr/>
  <p>
  	<a href="${ctxPath}/tiles/login">로그아웃</a>
  </p>
  <p><br></p>
</body>
</html>