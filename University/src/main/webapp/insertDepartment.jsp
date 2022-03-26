<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Department</title>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-2.1.3.min.js"></script>
<script
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/jquery.validate.min.js"></script>
<script
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/additional-methods.min.js"></script>
<script type="text/javascript" src="Validation.js"></script>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body style="text-align: center;">
<div>
	<h2 align="center">Insert Department(column by column)</h2>
  <form action="insertDepartment" method="post" id="form" class="form">

    <label class="label" for="deptName">Department Name</label>
    <input class="input" type="text" name="deptName" id="deptName" placeholder="Enter Your Department Name" data-error="#deptName"/>
    <span id="deptName"></span>
	<br><br>
    <label class="label" for="buildName">Building Name</label>
    <input class="input" type="text" name="buildName" id="buildName" placeholder="Enter Your Building Name" data-error="#buildName"/>
    <span id="buildName"></span>
	<br><br>
    <label class="label" for="budgetValue">Budget</label>
    <input class="input" type="text" name="budgetValue" id="budgetValue" placeholder="000.00" data-error="#budgetValue"/>
    <span id="buildName"></span>
	<br><br>
    <button class="button" type="submit">Insert</button>
  </form>
</div>
</body>
</html>