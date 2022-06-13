<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>test8.jsp</title>
</head>
<body>
  <form method="post" action="/t0609/test8_1">
  	<p>직업 : <input type="text" name="job" /></p>
  	<p>사무실 : <input type="number" name="office" /></p>
  	<p><input type="submit" value="전송8_1" /></p>
  </form>
  <form method="post" action="/t0609/test8_2">
  	<p>직업 : <input type="text" name="job" /></p>
  	<p>사무실 : <input type="number" name="office" /></p>
  	<p><input type="submit" value="전송8_2" /></p>
  </form>
  <form method="post" action="/t0609/test8_3">
  	<p>아이디 : <input type="text" name="id" value="${vo.id}" /></p>
  	<p>비밀번호 : <input type="password" name="password" value="${vo.password}" /></p>
  	<p>이메일 : <input type="text" name="email" value="${vo.email}" /></p>
  	<p><input type="submit" value="전송8_3" /></p>
  </form>
  <form method="post" action="/t0609/test8_3_1">
  	<p>아이디 : <input type="text" name="id" value="${vo.id}" /></p>
  	<p>비밀번호 : <input type="password" name="password" value="${vo.password}" /></p>
  	<p>이메일 : <input type="text" name="email" value="${vo.email}" /></p>
  	<p><input type="submit" value="전송8_3_1" /></p>
  </form>
  <form method="post" action="/t0609/test8_3_2">
  	<p>아이디 : <input type="text" name="id" value="${vo.id}" /></p>
  	<p>비밀번호 : <input type="password" name="password" value="${vo.password}" /></p>
  	<p>이메일 : <input type="text" name="email" value="${vo.email}" /></p>
  	<p><input type="submit" value="전송8_3_2" /></p>
  </form>
  <form method="post" action="/t0609/test8_3_5">
  	<p>아이디 : <input type="text" name="id" value="${id}" /></p>
  	<p>비밀번호 : <input type="password" name="password" value="${password}" /></p>
  	<p>이메일 : <input type="text" name="email" value="${email}" /></p>
  	<p><input type="submit" value="전송8_3_5" /></p>
  </form>
  <form method="post" action="/t0609/test8_3_10">
  	<p>아이디 : <input type="text" name="id" value="${vo.id}" /></p>
  	<p>비밀번호 : <input type="password" name="password" value="${vo.password}" /></p>
  	<p>이메일 : <input type="text" name="email" value="${vo.email}" /></p>
  	<p><input type="submit" value="전송8_3_10" /></p>
  </form>
  <form method="post" action="/t0609/test8_3_11">
  	<p>아이디 : <input type="text" name="id" value="${id}" /></p>
  	<p>비밀번호 : <input type="password" name="password" value="${password}" /></p>
  	<p>이메일 : <input type="text" name="email" value="${email}" /></p>
  	<p><input type="submit" value="전송8_3_11" /></p>
  </form>
</body>
</html>