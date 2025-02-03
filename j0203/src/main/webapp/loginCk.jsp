<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키 저장하기</title>
	</head>
	<body>
	<!-- 아이디를 쿠키에 저장하기(변수명:cook_id, 값:입력한 데이터) -->
	<%
		String id = request.getParameter("cook_id");
		String[] saveId = request.getParameterValues("saveId");
		
		if(id != null){
			Cookie cookie = new Cookie("cook_id",saveId[0]);
			cookie.setMaxAge(60*60*24*360);
			response.addCookie(cookie);
	%>
		<div><%= saveId[0] %> 가 저장 되었습니다.</div>
		<%}else{
			Cookie[] cookies = request.getCookies();
			for(Cookie cookie : cookies){
				if(cookie.getName().equals("cook_id")){
					cookie.setMaxAge(0);
					response.addCookie(cookie);
				}
			}
		%>
		<div>쿠키에 저장되어있는 cook_id가 삭제 되었습니다.</div>
		<%} %>
	<div>정보 : </div>
	<button onclick="javascript:location.href='loginOk.jsp'">이동하기</button>
	
	</body>
</html>