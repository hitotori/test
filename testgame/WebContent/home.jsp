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
<title>UserHome</title>
<style type="text/css">
body {
	font-family: 'MS Gothic', 'Hiragino Kaku Gothic Std', 'Yu Gothic';
}

#header {
	background: -webkit-linear-gradient(top, gray, black);
	width: 100%;
	height: 50px;
}

.headerul {
	list-style: none;
	float: right;
	display: inline-block;
}

.headerli {
	display: inline-block;
	float: right;
	margin-top: 12px;
}

#main {
	clear: both;
	width: 100%;
	min-height: 600px;
	height: auto !important;
	height: 100%;
	text-align: center;
	background-image: url(img/bg_natural_sougen.jpg);
	background-size: cover;
	background-repeat: no-repeat;
}

#mainheader {
	width: 100%;
	min-height: 380px;
	height: auto !important;
	height: 100%;
	text-align: center;
	display: block;
	/* background-position: center; */
}
/* #mainbotan{ */
/* width:100%; */
/* 	background-image: url(img/bg_natural_sougen11.jpg); */
/* 	background-size: cover; */
/* 	background-repeat:repeat; */
/* } */
input {
	border-radius: 50px;
	background-color: darkgray;
	color: white;
}

input.rightup {
	border-radius: 50px;
	background-color: black;
	color: white;
}

#mainbotan {
	display: inline-block;
}

#mainleft {
	display: inline-block;
}

#maincenter {
	display: inline-block;
}

#mainright {
	display: inline-block;
}

.botan1 {
	border-radius: 50px;
	padding: 50px;
	background: -webkit-linear-gradient(top, blue, skyblue);
}

.botan2 {
	border-radius: 50px;
	padding: 50px;
	background: -webkit-linear-gradient(top, green, #96ff7f);
}

.centerbotan {
	border-radius: 80px;
	padding: 80px;
	background: -webkit-linear-gradient(top, red, pink);
}

img {

}
</style>
</head>
<body>
	<div id="header">
		<ul>
			<s:form action="LogoutAction" theme="simple">
				<li class=headerli><input type="submit" class="rightup"
					value="ログアウト" /></li>
			</s:form>
		</ul>
	</div>
	<div id="main">
		<div id="mainheader">
			<img src="img/figure_rpg_characters.png" />
		</div>
		<div id="mainbotan">
			<div id="mainleft">
				<s:form action="GoRestAction" theme="simple">
					<input type="submit" class="botan1" value="休む" />
				</s:form>
			</div>


			<div id="maincenter">
				<s:form action="GoBattleAction" theme="simple">
					<input type="submit" class="centerbotan" value="戦う" />
				</s:form>
			</div>


			<div id="mainright">
				<s:form action="GoShopAction" theme="simple">
					<input type="submit" class="botan2" value="ショップ" />
				</s:form>
			</div>

		</div>
	</div>
	<div id="footer"></div>
</body>
</html>