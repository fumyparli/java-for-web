<!-- http://tomcat.apache.org/download-taglibs.cgi 여기서 위에 파일 세개 받아서 WEB_INF에 넣어야 jstl사용가  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="value1" scope="request" value="Lee"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	sex: ${value1 } <br/>
	<c:remove var="value1" scope="request"/>
	sex: ${value1 } <br/>
</body>
</html>