<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>test5.jsp</title>
</head>
<body>
  <form method="post" action="/t0609/test5_1">
  	<p>직업 : <input type="text" name="job" /></p>
  	<p>사무실 : <input type="number" name="office" /></p>
  	<p><input type="submit" value="전송5_1" /></p>
  </form>
  	<p>${joboffice}</p><!-- jstl아님, el표기법 -->
</body>
</html>