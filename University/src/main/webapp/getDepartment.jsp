<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Department</title>
</head>
<body style="text-align: center">
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
	<div>
	<c:forEach items="${result}" var="tableObj">
		<h2 align="center">Change Budget value in Department to update:</h2>
  <form action="updateDepartment" method="post" id="form" class="form">
    <label class="label" for="deptName">Department Name</label>
    <input class="input" type="text" name="deptName" id="deptName" readonly="readonly" value="<c:out value="${tableObj.dept_name}"/>"/>
    <span id="deptName"></span>
	<br><br>
    <label class="label" for="buildName">Building Name</label>
    <input class="input" type="text" name="buildName" id="buildName" readonly="readonly" value="<c:out value="${tableObj.building}"/>"/>
    <span id="buildName"></span>
	<br><br>
    <label class="label" for="budgetValue">Budget</label>
    <input class="input" type="text" name="budgetValue" id="budgetValue" value="<c:out value="${tableObj.budget}"/>"/>
    <span id="buildName"></span>
	<br><br>
    <button class="button" type="submit">Update</button>
  </form>
  		</c:forEach>
	</div>
</body>
</html>