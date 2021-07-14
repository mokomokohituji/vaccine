<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ワクチンリザルト</title>
</head>
<body>
	<%
		//出力されるワクチンの連鎖	
		String vaccine = (String) request.getAttribute("vaccine");		
		String success = (String) request.getAttribute("success");
	
	%>
	<form action="Main" method="post">
		<p><%=vaccine%></p>
		<p><%= success %></p>
		<input type="submit" value="もう一度チャレンジする">
	</form>
	<form action="Main"><input type="submit" value="戻る" /></form>
	
</body>
</html>