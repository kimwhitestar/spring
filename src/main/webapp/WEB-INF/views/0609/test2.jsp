<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>test2.jsp</title>
</head>
<body>
  <h2>이곳은 /WEB-INF/views/0609/test2.jsp 입니다</h2>
  <p>접 속 2</p>
  <p>전송되어온 성명 : ${name}</p>
  <p>전송되어온 나이 : ${age}</p>
  <form method="post" action="/t0609/tt2">
  	<p>직업 : <input type="text" name="job" /></p>
  	<p>사무실 : <input type="number" name="office" /></p>
  	<p><input type="submit" value="전송1" /></p>
  	<p>받은 파라미터 : ${joboffice}</p>
  </form>
  <form method="post" action="/t0609/test2-5">
  	<p>직업 : <input type="text" name="job" /></p>
  	<p>사무실 : <input type="number" name="office" /></p>
  	<p><input type="submit" value="전송2-5" /></p>
  </form>
  
</body>
</html>