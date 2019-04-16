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

#header{
	background: -webkit-linear-gradient(top, gray, black);
	width:100%;
	height:60px;
	margin:0 auto;
}
#main{
clear:both;
width:100%;
min-height:600px;
height:auto !important;
height:100%;
background-color:black;

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

table{
margin-top:50px;
width:60%;
background-color:black;
margin:0 auto;
padding-top:35px;
}
td{
color:white;
}
.tbl{
border:white 1px solid;
}
.clm{
border:white 1px solid;
text-align:center;
}
.txt{
width:99%;
background-color:black;
color:white;
}
.botan{
margin-right:49%;
}
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
	<div id="main">
		<s:if test="errorMessage !=">
			<s:property value="errorMessage" escape="false" />
		</s:if>
		<table>
			<s:form action="UserCreateConfirmAction">
				<tr class="tbl">
					<td class="clm"><label>ログインID</label></td>
					<td><input type="text" class="txt" name="loginUserId" value="" /></td>
				</tr>
				<tr class="tbl">
					<td class="clm"><label>ログインPASS</label></td>
					<td><input type="text" class="txt" name="loginPassword" value="" /></td>
				</tr>
				<tr class="tbl">
					<td class="clm"><label>ユーザー名</label></td>
					<td><input type="text" class="txt" name="userName" value="" /></td>
				</tr>
				<tr class="tbl">
					<td class="clm"><label>キャラクターネーム</label></td>
					<td><input type="text" class="txt" name="characterName" value="" /></td>
				</tr>

				<s:submit class="botan" value="登録" />
				<tr>
					<td><label> </label></td>
<!-- 					キャラクターLV -->
					<td><input type="hidden" name="characterLv" value="1" /></td>
				</tr>
				<tr>
					<td><label> </label></td>
<!-- 					キャラクターHP -->
					<td><input type="hidden" name="characterHP" value="25" /></td>
				</tr>
				<tr>
					<td><label> </label></td>
<!-- 					キャラクターAttack -->
					<td><input type="hidden" name="characterAttack" value="10" /></td>
				</tr>
				<tr>
					<td><label> </label></td>
<!-- 					キャラクターDefense -->
					<td><input type="hidden" name="characterDefense" value="8" /></td>
				</tr>
				<tr>
					<td><label> </label></td>
<!-- 					キャラクターEXP -->
					<td><input type="hidden" name="characterExp" value="0" /></td>
				</tr>
			</s:form>
		</table>



	</div>
	<div id="footer"></div>
</body>
</html>