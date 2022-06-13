<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctxPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>dddMain.jsp</title>
</head>
<body>
  <p><br></p>
  <p>아이디 : ${vo.mid}</p>
  <p>이름 : ${vo.name}</p>
  <p>나이 : ${vo.age}</p>
  <p><br></p>
</body>
</html>