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
<link href="http://kuneoresearch.com/wp-content/themes/stinger5verkuneo/font/PixelMplus10-Regular.ttf'">
<title>トライホーンペガサス戦</title>
<style type="text/css">
@font-face {
	font-family: PixelMplus10-Regular;
	src: url('http://kuneoresearch.com/wp-content/themes/stinger5verkuneo/font/PixelMplus10-Regular.ttf') format("truetype");
}
body {
	font-family:'PixelMplus10-Regular','MS Gothic',;
}

#header {
	background: -webkit-linear-gradient(top, gray, black);
	width: 100%;
	height: 50px;
}

#main {
	clear: both;
	width: 100%;
	min-height: 600px;
	height: auto !important;
	height: 100%;
	text-align: center;
	background-color: black;
}

input.rightup {
	border-radius: 50px;
	background-color: black;
	color: white;
}

.status {
	width: 60%;
	height: 150px;
/* 	border: lightgray 2px solid; */
	background-color: black;
	margin:0 auto;
}



.command {
float:left;
	width: 30%;
	height: 150px;
	border: white 2px solid;
	margin: 0 auto;
	margin-left:20%;
	color:white;
	font-size:20px;
}
.commandbox{
width:100%;
height:100%;
border-collapse:collapse;
}
.command2{
width:100%;
/* border:white 1px solid; */
}
.enemyName {
float:left;
	width: 30%;
	height: 30px;
	border: white 2px solid;
	margin: 0 auto;
	color:white;
	font-size:20px;

}
.chara{
color:white;
border:white 2px solid;
border-collapse:collapse;
height:100%;
width:25%;
table-layout:fixed;
float:left;
}

.chara2{
color:white;
border:white 2px solid;
border-collapse:collapse;
height:100%;
width:25%;
table-layout:fixed;
float:right;
}
tr{
/* border:white 1px solid; */
}
td{
/* border:white 1px solid; */
}
/* legend{ */
/* color:white; */
/* float:left; */
/* padding-left:20%; */
/* } */
/* h3{ */
/* color:white; */
/* } */
img{
	height: 200px;
	width: 200px;
	margin: 0 auto;
}
.log{
margin:0 auto;
width:60%;
height:150px;
}

#footer{
clear:both;
}
.logbox{
border:white 2px solid;
margin:0 auto;
width:50%;
}
.sankaku{
text-align:right;
}
.sankaku:hover{
font-size:18px;
}
.submit_btn{
background-color:black;
color:white;
width:100%;
height:35px;
border:black solid 1px;
border-bottom:2px white solid;

}
</style>
</head>
<body>
<script type="text/javascript" src= "./js/battle5.js"></script>

	<div id="header"></div>
	<div id="main">
		<div class="status">
<!-- 		<fieldset> -->
<!-- 		 <legend>名前</legend> -->
<!-- 		 <legend>仲間はいない</legend> -->


<!-- 		 <h3>Lv:〇</h3><br> -->
<!-- 		 <h3>HP:〇</h3><br> -->

<!-- 		</fieldset> -->
			<table class="chara">
				<tr>
					<td>Name:</td>
					<td><s:property value="session.characterName"/></td>
				</tr>
				<tr>
					<td>Lv:</td>
					<td><s:property value="session.characterLv" /></td>
				</tr>
				<tr>
					<td>HP:</td>
					<td><s:property value="session.characterHP" /></td>
				</tr>
			</table>

<!-- 			//偽用 -->
			<table class="chara">
				<tr>
					<td>仲間はいない</td>
					<td>…</td>
				</tr>
				<tr>
					<td>…</td>
					<td>…</td>
				</tr>
				<tr>
					<td>…</td>
					<td>…</td>
				</tr>
			</table>
			<table class="chara2">
				<tr>
					<td>仲間はいない:</td>
					<td>…</td>
				</tr>
				<tr>
					<td>…</td>
					<td>…</td>
				</tr>
				<tr>
					<td>…</td>
					<td>…</td>
				</tr>
			</table>
			<table class="chara2">
				<tr>
					<td>仲間はいない</td>
					<td>…</td>
				</tr>
				<tr>
					<td>…</td>
					<td>…</td>
				</tr>
				<tr>
					<td>…</td>
					<td>…</td>
				</tr>
			</table>


		</div>
		<div class="box">
			<img src="img/business_unicorn_company.png" />
		</div>

		<s:if test="session.battleFlg==0">
		<div class="command">
		<table class="commandbox">
		<s:form id="form" name="form" theme="simple">
		<tr class="command1"><td class="command2"><s:submit value="戦う" onclick="goBattle1Action()" class="submit_btn"/></td></tr>
<s:hidden id="jaku" name="jaku" value=""/>


		<tr class="command1"><td class="command2"><s:submit value="強攻撃" onclick="goBattle2Action()" class="submit_btn"/></td></tr>
<s:hidden id="kyou" name="kyou" value=""/>


		<tr class="command1"><td class="command2"><s:submit value="逃げる" onclick="goBattle3Action()" class="submit_btn"/></td></tr>
<s:hidden id="ecp" name="ecp" value=""/>
		</s:form>


		<tr class="command1"><td class="command2"><s:submit value="ステータス確認" onclick="goBattle4Action()" class="submit_btn"/></td></tr>

		</table>
		</div>
		<div class="enemyName"><s:property value="session.enemyName"/></div>
		</s:if>



		<s:elseif test="session.battleFlg==1">
		<div class="logbox">
		<a href='<s:url action="Battle5Action" />' class="log">

		<s:property value="session.characterName" />は<br>
		<s:property value="session.enemyName" />に<br>
		<s:property value="session.damage" />ダメージを与えた<br>

		<s:property value="session.enemyName" />は<br>
		<s:property value="session.characterName" />に<br>
		<s:property value="session.damage2" />ダメージを与えた<br>
		 <span class="sankaku">                　　　　　　　　　　　▽</span>
		</a>
		</div>
		</s:elseif>

		</div>	<div id="footer"></div>
</body>
</html>