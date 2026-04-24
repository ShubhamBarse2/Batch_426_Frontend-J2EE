<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Page</title>

<style>
body {
	font-family: Arial, sans-serif;
	background: linear-gradient(to right, #74ebd5, #9face6);
	margin: 0;
	padding: 0;
}

.container {
	width: 350px;
	margin: 80px auto;
	background: #fff;
	padding: 30px;
	border-radius: 12px;
	box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
	text-align: left;
}

h1 {
	text-align: center;
	color: #333;
	margin-bottom: 20px;
}

.profile-item {
	margin: 15px 0;
	font-size: 16px;
}

.label {
	font-weight: bold;
	color: #555;
}

.value {
	color: #222;
	margin-left: 10px;
}

hr {
	border: none;
	height: 2px;
	background: #eee;
	margin-bottom: 20px;
}
</style>

</head>
<body>

	<div class="container">
		<h1>Profile Page</h1>
		<hr>

		<div class="profile-item">
			<span class="label">Name :</span> <span class="value">${name}</span>
		</div>

		<div class="profile-item">
			<span class="label">City :</span> <span class="value">${city}</span>
		</div>

		<div class="profile-item">
			<span class="label">Mobile No :</span> <span class="value">${mobNo}</span>
		</div>

	</div>

</body>
</html>