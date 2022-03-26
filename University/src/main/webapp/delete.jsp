<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<body>
	<form action="departmentDelete" method="post">
		Enter the Department Name:<input type="text" name="deptName" /> <input
			type="submit" value="Delete" />
	</form>
	<div id="confirmBox">
		<div class="message"></div>
		<span class="button yes">Yes</span> <span class="button no">No</span>
	</div>
</body>
</html>