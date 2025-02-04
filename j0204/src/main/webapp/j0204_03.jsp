<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>해당값 반복</title>
	</head>
	<body>
		<!-- 1,10 -->
		<div>시작값 : <%= request.getParameter("st") %></div>
		<!-- 넘어온 데이터 사용법 : param -->
		<div>시작값 : ${param.st}</div>
		<div>종료값 : ${param.ed}</div>
		<c:forEach begin="${param.st}" end="${param.ed}" step="1" var="i">
			<div>${i}</div>
		</c:forEach>
	
	</body>
</html>