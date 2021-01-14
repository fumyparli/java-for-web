<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	pageContext.setAttribute("p1","page scope value");
	request.setAttribute("r1","request scope value");
	session.setAttribute("s1","session scope value");
	application.setAttribute("a1","application scope value");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <h1>pageContext.getAttribute("p1"): </h1> <%=pageContext.getAttribute("p1") %> --%>
<h1>pageContext.getAttribute("p1"): ${pageScope.p1 }</h1><br>
<!-- 변수 이름이 안겹칠때는 ${pageScope.p1} -> ${p1}도 가능 겹치면 작은 scope부터 찾는다. 명시해주 것이 좋긴함 -->
<h1>request.getAttribute("r1"): ${requestScope.r1 }</h1><br>
<h1>session.getAttribute("s1"): ${sessionScope.s1 }</h1><br>
<h1>application.getAttribute("a1"): ${applicationScope.a1 }</h1><br>
</body>
</html>