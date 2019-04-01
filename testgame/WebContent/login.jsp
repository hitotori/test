<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="imagetoolbar" content="no">
<meta name="descrption" content="" />
<meta name="keywords" content="" />
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<link rel="stylesheet" type="text/css"
	href="/testgame/WebContent/css/Style.css">
<link rel="img" type="image/png" href="/testgame/img">
<title>Login</title>
<style type="text/css">
body {
	font-family: 'MS Gothic', 'Hiragino Kaku Gothic Std', 'Yu Gothic';
	background-color:black;
}

#header {
	background-color: black;
	margin: 0 auto;
	border-radius: 10px;
	width: 60%;
	border: gray solid 3px;
	margin-bottom: 50px;
}

.midashi {
	height: 100%;
	color: white;
	border-radius: 10px;
}

#main {
	text-align: center;
	width: 100%;
	min-height: 600px;
	height: auto !important;
	height: 100%;
}

h1 {
	text-align: center;
}

.Login {
	width: 50%;
	height: auto;
	text-align: center;
	border: gray solid 3px;
	background-color: black;
	margin: 0 auto;
	table-layout: fixed;
}

td {
	padding-right: 20%;
}

.txt {
	padding-left: 20%;
	color: white;
}

.text {
	width: 100%;
	height: 100%;
	background-color: black;
	box-shadow: none;
	color: white;
	border: white solid 1px;
}

.botanbox {
	text-align: center;
	margin-top: 40px;
}

.submitbotton {
	text-align: center;
	margin:0 auto;
}

.submitlogin1 {
	text-align: center;
	background-color: black;
	color:white;
}

.submitlogin2 {
	text-align: center;
	background-color: black;
	color:white;
}
</style>
</head>
<body>
	<div id="header">
		<h1 class="midashi">ログイン画面</h1>
	</div>
	<div id="main">
		<s:form action="LoginAction" theme="simple">

			<table class="Login">
				<tr>
					<th scope="row"><s:label class="txt" value="ユーザーID" /></th>
					<td><s:textfield name="loginUserId" class="text" value="" /></td>
				</tr>
				<tr>
					<th scope="row"><s:label class="txt" value="パスワード" /></th>
					<td><s:password name="loginPassword" class="text" value="" /></td>
				</tr>
			</table>
			<div class="botanbox">
				<div class="submitbotton">
					<s:submit value="ログイン" class="submitlogin1" />
				</div>
			</div>
		</s:form>
		<s:form action="UserCreateAction" theme="simple">
		<div class="submitbotton">
			<s:submit value="新規ユーザー登録" class="submitlogin2" />
		</div>
		</s:form>
	</div>

	<div id="footer"></div>
</body>
</html>