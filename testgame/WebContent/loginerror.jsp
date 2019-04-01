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

<link rel="stylesheet" type="text/css" href="/testgame/css/Style.css">
<link rel="img" type="image/png" href="/testgame/img">
<title>LoginError</title>
<style type="text/css">
#header {
	background-color: black;
	margin: 0 auto;
	border-radius: 10px;
	border: gray solid 1px;
	width: 100%;
	height: 60px;
}

.rightup {
	float: right;
	border-radius: 50px;
	background-color: black;
	color: white;
	margin-top:15px;
}

#main {
	color: white;
	clear: both;
	width: 100%;
	min-height: 600px;
	height: auto !important;
	height: 100%;
	background-color: black;
	text-align:center;
	margin:0 auto;
	margin-top:-5px;
}
h2{
margin-top:-10px;
}
</style>
</head>
<body>
	<div id="header">
		<s:form action="GoTitleAction" theme="simple">
			<input type="submit" class="rightup" value="タイトルに戻る" />
		</s:form>
	</div>
	<div id="main">
	<br><br>
		<h2>
			<strong>ログインに失敗しました。</strong>
		</h2>
		<br> ユーザ情報尾をお確かめの上再度ログインしてください。<br> <a href="login.jsp">ログイン画面に戻る</a><br>
	</div>

	<div id="footer"></div>
</body>
</html>