<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- <%
	request.setAttribute("n",10);
%> --%>
<%
	List<String> list=new ArrayList<>();
	list.add("hello");
	list.add("world");
	list.add("!!!!!");
	
	request.setAttribute("list",list);
%>
<c:set var="score" scope="request" value="100"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${list }" var="item" begin="1">
		${item }<br/>
	</c:forEach>
</body>
</html>
