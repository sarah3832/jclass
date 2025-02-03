<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>jsp 태그</title>
		<style>
			table,th,td{border:1px solid black; border-collapse: collapse;}
			table{width:800px; margin:10px auto; text-align:center;}
			th,td{width:100px; height:40px;}
		</style>
	</head>
	<body>
	<%!
		String[] name = {"홍길동","유관순","이순신","강감찬","김구","홍길자","홍길순","김유신","을지문덕","신사임당"};
	%>
	
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<%for (int i=1;i<11;i++){%>
		<tr>
			<td><%= i %></i></td>
			<td>안녕하세요.<%=i%></i></td>
			<td><%=name[i-1]%></td>
			<td>2025-02-03</td>
			<td><%=100+i %></td>
		</tr>
		<%}%>


	</table>
	
	</body>
</html>