<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="imagetoolbar" content="no">
<meta name="descrption" content="" />
<meta name="keywords" content="" />

<link rel="stylesheet" type="text/css" href="/ecsite/css/Style.css">

<title>UserCreateComplete画面</title>
<style type="text/css">
body {
	font-family: 'MS Gothic', 'Hiragino Kaku Gothic Std', 'Yu Gothic';
}

#header {
	background: -webkit-linear-gradient(top, gray, black);
	width: 100%;
	height: 80px;
	margin: 0 auto;
}

#main {
	clear: both;
	width: 100%;
	min-height: 600px;
	height: auto !important;
	height: 100%;
	background-color: black;
}

}
.midashi {
	height: 100%;
	color: white;
	border-radius: 10px;
}

input.rightup {
	border-radius: 50px;
	background-color: black;
	color: white;
}

.headerul {
	list-style: none;
	float: right;
	display: inline-block;
}

.headerli {
	display: inline-block;
	float: right;
	/* 	margin-top:1px; */
}

h3{
color:white;
text-align:center;
margin-top:0px;
}
.backbotan{
text-align:center;}
</style>

</head>
<body>
	<div id="header">
		<ul class="headerul">
			<s:form action="GoTitleAction" theme="simple">
				<li class=headerli><input type="submit" class="rightup"
					value="タイトルに戻る" /></li>
			</s:form>
		</ul>
	</div>

	<div ID="main">
		<div id="top"></div>
		<div>
			<h3>ユーザーの登録が完了致しました</h3>
			<br>
			<br>
			<div class="backbotan">
				<a href="login.jsp">ログインへ</a>
			</div>
		</div>
	</div>

	<div id="footer">
		<div id="pr"></div>
	</div>

</body>
</html>