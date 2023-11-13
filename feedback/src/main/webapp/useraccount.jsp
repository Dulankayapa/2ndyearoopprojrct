<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>

	<form action="#" method="post">

		
		<c:set value="${name}" />
		<c:set value="${email}" />
		<c:set value="${phone}" />
		<c:set value="${userName}" />
		

		<h1>Register</h1>
		Name:<input type="text" name="Name" value="${name}"readonly><br> Email:<input
			type="text" name="Email" value="${email}" readonly ><br> Phone:<input
			type="text" name="Phone" value="${phone}"  readonly><br> UserName:<input
			type="text" name="UserName" value="${userName}" readonly><br> 

	</form>

</body>
</html>



