<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display the Database</title>
<style>
div.scrollmenu {
	background-color: #333;
	overflow: auto;
	white-space: nowrap;
	padding-left: 0%;
}

div.scrollmenu a {
	display: inline-block;
	color: white;
	text-align: center;
	padding: 14px;
	text-decoration: none;
}

div.scrollmenu a:hover {
	background-color: #777;
}

div.description ul {
  text-align: center;
  list-style-position: inside;
}

div.description li {
  text-align: center;
  list-style-position: inside;
}

div.description {
	text-align: center;
}
</style>
</head>
<body>
	<h1 style="text-align: center">Welcome to the University Database</h1>
	<div class="scrollmenu">
		<a href="#" class="active">Home</a> <a href="display.jsp">Display</a>
		<a href="insertDepartment.jsp">Insert</a> <a href="update.jsp">Modify</a>
		<a href="delete.jsp">Delete</a>
	</div>
	
	<form action="tableSelect" method="post">
		<h2 class="formh2" align="center">
			<input type="hidden" name="register" value='${register.firstName}'><br>
			Select the Table from Options:<br> <select
				class="formselect" name="table" size="1">
				<option value="default"  selected="selected">Select Table</option>
				<option value="instructor">Instructor</option>
				<option value="department">Department</option>
				<option value="course">Courses </option>
			</select><br> <input class="forminput" type="submit" value="submit">
		</h2>
	</form>
</body>
</html>