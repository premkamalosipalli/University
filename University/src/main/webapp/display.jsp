<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display the Database</title>
</head>
<body>
	<form action="tableSelect" method="post">
		<h2 class="formh2" align="center">
			<input type="hidden" name="register" value='${register.firstName}'><br>
			Select the Table:<br> <select
				class="formselect" name="table" size="1">
				<option value="default"  selected="selected">Select Database</option>
				<option value="instructor">Instructor</option>
				<option value="department">Department</option>
				<option value="course">Courses </option>
			</select><br> <input class="forminput" type="submit" value="submit">
		</h2>
	</form>
</body>
</html>