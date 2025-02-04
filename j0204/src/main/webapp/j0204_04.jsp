<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>list 출력</title>
	</head>
	<body>
	<h2>데이터 값 출력</h2>
	<div>count 값 : ${param.count }</div>
	<hr>
	 <!-- list의 값들을 한개씩 member에 넣음 (items 값들을 -> var에 하나씩) -->
	<c:forEach items="${list}" var="member" varStatus="vs">  <!-- varStatus : 값 넣어줌 -->
		<div>데이터 ${vs.index+1}: ${member.id},${member.name}</div>
	</c:forEach>
	
	</body>
</html>