<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인 확인</title>
	</head>
	<body>
	<h2>로그인 확인</h2>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		session.setAttribute("session_id",id);
		if(id.equals("aaa") && pw.equals("1111")){
			response.sendRedirect("j0204_01.jsp");  // 바로 보내줌
		}else{
			response.sendRedirect("login.jsp");  // aaa,1111 아니면 로그인페이지로 이동
		}
	%>
	

	</body>
</html>