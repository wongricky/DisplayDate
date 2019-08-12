<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/time.js"></script>
	<meta charset="UTF-8">
	<title>Time</title>
</head>
<body>
<br/><br/>
	<h1 class="time"><c:out value="${time}"/></h1>
</body>
</html>