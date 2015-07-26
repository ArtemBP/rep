<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="mainstyle.css">
<title>Rikitikitavi</title>
<script src="http://code.jquery.com/jquery-2.1.4.js"></script>

<script src="main.js"></script>
</head>
<script>
console.log("Hello!");
var v="i am variable";
console.log(v);
function hello(text) {
	console.log("i am function "+text);
}
var myObject = {
		field: "sd", 
		field2: 2,
		field3: function(){
			return "YES";
		}
};
var myArray = [2,4,"d"];
$.onLoad=function() {
	onClick(function(){$('a').css("color", "green");})
};

</script>
<body>
	<div class="header">
		<ul class="menu">
			<li><a href="main.jsp">Main</a></li>
			<li><a href="Archive">Archive</a></li>
			<li><a href="login.html">Log in</a></li>
		</ul>
	</div>
	<div id="divUser">
		<h1>
			Welcome
			<c:out value="${user}" />
		</h1>
	</div>
	<div class="headernews">Todays news:</div>
	<div class="form">
		<form action="Archive" method="post">
			<c:forEach var="news" items="${newslist}">
				<div id="news">
					<div class="newstitle">
						<c:out value="${news.title}" />
						<label for="checkbox"> 
						<input type="checkbox" name="news_ids" id="checkbox_id" value="${news.id}">Add</label>
					</div>
					<div class="newsbody">
						<c:out value="${news.body}" />
					</div>
				</div>
			</c:forEach>
			<input type="submit" value="submit" name="button">
		</form>
	</div>
</body>
</html>