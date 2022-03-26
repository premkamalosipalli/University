<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Record</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="confirm.js"></script>
<style type="text/css">
body {
	font-family: sans-serif;
}

#confirmBox {
	display: none;
	background-color: #eee;
	border-radius: 5px;
	border: 1px solid #aaa;
	position: fixed;
	width: 300px;
	left: 50%;
	margin-left: -150px;
	padding: 6px 8px 8px;
	box-sizing: border-box;
	text-align: center;
}

#confirmBox .button {
	background-color: #ccc;
	display: inline-block;
	border-radius: 3px;
	border: 1px solid #aaa;
	padding: 2px;
	text-align: center;
	width: 80px;
	cursor: pointer;
}

#confirmBox .button:hover {
	background-color: #ddd;
}

#confirmBox .message {
	text-align: left;
	margin-bottom: 8px;
}
</style>
</head>
<body style="text-align: center;">
	<h3>Department Table</h3>
	<div align="center">
		<table border="1">
			<thead>
				<tr>
					<th>dept_name</th>
					<th>building</th>
					<th>budget</th>
				</tr>
			</thead>
			<c:forEach items="${result}" var="tableObj">
			<tbody>
				<tr>
					<td><c:out value="${tableObj.dept_name}"></c:out></td>
					<td><c:out value="${tableObj.building}"></c:out></td>
					<td><c:out value="${tableObj.budget}"></c:out></td>
				</tr>
			</tbody>
			</c:forEach>
		</table>
	</div>
	<c:forEach items="${result}" var="tableObj">
	<h4>Click the Delete Button to delete "${tableObj.dept_name}" Department table </h4>
	<form action="departmentDelete" method="post">
	<input type="hidden" name="deptName" value="${tableObj.dept_name}" /><input
			type="submit" value="Delete" />
	</form>
	<div id="confirmBox">
		<div class="message"></div>
		<span class="button yes">Yes</span> <span class="button no">No</span>
	</div>
	<p hidden> You have selected not do delete the Department for the table.</p>
	<p hidden> Click the link below to go back to home page.</p>
	<p hidden> <a href="welcome.html">Home Page</a></p>
	</c:forEach>
</body>
</html>