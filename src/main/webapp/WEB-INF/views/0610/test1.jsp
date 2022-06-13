<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctxPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>test1.jsp</title>
  <script>
  	location.href="${ctxPath}/t0609/test10";
  </script>
</head>
<body>
  <form method="post" action="/t0609/test8_1">
  	<p>직업 : <input type="text" name="job" /></p>
  	<p>사무실 : <input type="number" name="office" /></p>
  	<p><input type="submit" value="전송8_1" /></p>
  </form>
  <form method="post" action="/t0609/test8_3_11">
  	<p>아이디 : <input type="text" name="id" value="${id}" /></p>
  	<p>비밀번호 : <input type="password" name="password" value="${password}" /></p>
  	<p>이메일 : <input type="text" name="email" value="${email}" /></p>
  	<p><input type="submit" value="전송8_3_11" /></p>
  </form>
</body>
</html>