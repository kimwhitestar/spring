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
  
  </script>
</head>
<body>
  <p><br></p>
  	<h2>User 전송된 값</h2>
  	<p>아이디 : ${vo.mid}</p>
  	<p>비밀번호 : ${vo.pwd}</p>
  	<p>나이 : ${vo.age}</p>
  	<hr/>
  	<p><a href="validatorForm" class="btn btn-success">돌아가기</a></p>
  <p><br></p>
</body>
</html>