<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>모든쿠키 확인</title>
	</head>
	<body>
	<h2>모든 쿠키정보 확인</h2>
	<%
	String cook_id = request.getParameter("cook_id");
	Cookie[] cookies = request.getCookies();
	
	if(cookies != null){
		for(int i=0;i<cookies.length;i++){
			out.println("변수명 : "+cookies[i].getName()+", 변수값 : "+cookies[i].getValue()+"<br/>");
		}
	}
	%>
	<button onclick="javascript:location.href='j0203_11'">이동하기</button>
	
	</body>
</html>