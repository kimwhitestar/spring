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
  <hr/>
  <p>
  	<c:if test="${0 == sLevel}"><c:set var="strLevel" value="관리자"/></c:if>
  	<c:if test="${1 == sLevel}"><c:set var="strLevel" value="특별회원"/></c:if>
  	<c:if test="${2 == sLevel}"><c:set var="strLevel" value="우수회원"/></c:if>
  	<c:if test="${3 == sLevel}"><c:set var="strLevel" value="정회원"/></c:if>
  	<c:if test="${4 == sLevel}"><c:set var="strLevel" value="준회원"/></c:if>
  	${sName}님 로그인중입니다. (레벨 : ${strLevel})<br>
  	<pre>
		- 관리자(0)는 모든 서비스와 '관리자 메뉴' 사용
		- 우수회원(2)/특별회원(1)은 '방명록,게시판,자료실,유저목록' 사용
		- 정회원(3)은 '방명록,게시판,유저목록' 사용
		- 준회원(4)은 '방명록' 사용
		- 비회원(99)는 모든서비스 사용 금지(memberMain 접속불가) 
  	</pre>
  </p>
  	<a href="${ctxPath}/user/userLogin">로그아웃</a>
  </p>
  <p><br></p>
</body>
</html>