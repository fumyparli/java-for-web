<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- <%
	request.setAttribute("n",10);
%> --%>

<%-- <c:import url="http://localhost:8080/justweb/jstlValue.jsp" var="urlValue" scope="request"></c:import> --%>
<c:import url="https://www.naver.com/" var="urlValue" scope="request"></c:import>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${urlValue }</h1>
</body>
</html>