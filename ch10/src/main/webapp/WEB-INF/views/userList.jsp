<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>userList</title>
	</head>
	<body>
		<h3>userList</h3>
		<table border="1">
			<c:forEach var="user" items="${userList}">
				<tr>
					<td>${user.seq }</td>
					<td><a href="/ch10/userView?seq=${user.seq}">${user.uid }</a></td>
					<td>${user.name }</td>
					<td>${user.hp }</td>
					<td>${user.addr }</td>
					<td>${user.pos }</td>
					<td>${user.dep }</td>
					<td>${user.rdate }</td>
				</tr>
			</c:forEach>
		</table>
		
		
		
	
	</body>
</html>