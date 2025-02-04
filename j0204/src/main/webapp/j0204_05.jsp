<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  <!-- 날짜 포맷 -->    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<jsp:useBean id="now" class="java.util.Date" />
	<div>날짜 : ${now}</div>
	<div>날짜 : <fmt:formatDate value="${now }" pattern="yyyy-MM-dd"/></div>
	<div>년도 : <fmt:formatDate value="${now }" pattern="yyyy"/></div>
	<div>월 : <fmt:formatDate value="${now }" pattern="MM"/></div>
	<div>일 : <fmt:formatDate value="${now }" pattern="dd"/></div>
	<div>시 : <fmt:formatDate value="${now }" pattern="hh"/></div>
	<div>분 : <fmt:formatDate value="${now }" pattern="mm"/></div>
	<div>초 : <fmt:formatDate value="${now }" pattern="ss"/></div>
	<hr>
	<c:set var="name" value="홍 길 동" />
	<div>이름 : ${name}</div>
	<c:if test="${ fn:contains(name,'동') }">  <!-- fn:contains(변수명,'포함글자') -->
		<div>이름에 '동'이라는 글자가 포함되어 있습니다.</div>
	</c:if>
	<div>공백제거 이름 : ${fn:replace(name,' ','')}</div>  <!-- fn:replace(변수명,' ','') : 공백제거 -->
	
	</body>
</html>