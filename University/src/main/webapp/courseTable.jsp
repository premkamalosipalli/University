<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Table</title>
</head>
<body style="text-align: center">
	<h3>Course Table</h3>
	<div align="center">
		<table border="1">
			<thead>
				<tr>
					<th>course_id</th>
					<th>title</th>
					<th>dept_name</th>
					<th>credits</th>
				</tr>
			</thead>
			<c:forEach items="${result}" var="tableObj">
			<tbody>
				<tr>
					<td><c:out value="${tableObj.course_id}"></c:out></td>
					<td><c:out value="${tableObj.title}"></c:out></td>
					<td><c:out value="${tableObj.dept_name}"></c:out></td>
					<td><c:out value="${tableObj.credits}"></c:out></td>
				</tr>
			</tbody>
			</c:forEach>
		</table>
	</div>
</body>
</html>