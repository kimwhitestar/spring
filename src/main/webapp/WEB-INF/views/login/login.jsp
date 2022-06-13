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
  			<label>아이디 : </label><input type="text" name="id" />
  			<label>비밀번호 : </label><input type="password" name="password" />
  			<input type="button" value="로그인" onclick="location.href='${ctxPath}/tiles/memberMain'" />
  		</form>
  	</div>
  <p><br></p>
</body>
</html>