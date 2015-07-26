<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="mainstyle.css">
<title>Insert title here</title>
</head>
<body>
	<div class="header">
		<ul class="menu">
			<li><a href="main.jsp">Main</a></li>
			<li><a href="Archive">Archive</a></li>
			<li><a href="login.html">Log in</a></li>
		</ul>
	</div>
	<div class="headernews">yours saved news:</div>
	<c:forEach var="news" items="${selected}" >
		<div id="news">
			<div class="newstitle">
				<c:out value="${news.title}" />
			</div>
			<div class="newsbody">
				<c:out value="${news.body}" />
			</div>
		</div>
	</c:forEach>
</body>
</html>