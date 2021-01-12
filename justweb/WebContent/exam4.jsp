<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
JSP주석입니다
여러줄 가능합니다.
--%>
<!-- HTML주석입니다. -->
<%
	for(int i=1;i<=5;i++){
		//자바 주석입니다.
		/*이것도 자바 주석입니다. */		
%>


<h<%=i %>>Hello!!!</h<%=i %>>

<%
	}	
%>
</body>
</html>