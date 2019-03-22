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
	background-color: black;
	margin: 0 auto;
	border-radius: 10px;
	width: 60%;
	border: gray solid 2px;
	margin-bottom: 50px;
}

.midashi {
	height: 100%;
	color: white;
	border-radius: 10px;
}

input.rightup {
	border-radius: 50px;
	background-color: darkgray;
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
	margin-top: 12px;
}
</style>
</head>
<body>
	<div id="header">
		<ul>
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
				<tr>
					<td><label>ログインID</label></td>
					<td><input type="text" name="loginUserId" value="" /></td>
				</tr>
				<tr>
					<td><label>ログインPASS</label></td>
					<td><input type="text" name="loginPassword" value="" /></td>
				</tr>
				<tr>
					<td><label>ユーザー名</label></td>
					<td><input type="text" name="userName" value="" /></td>
				</tr>
				<tr>
					<td><label>キャラクターネーム</label></td>
					<td><input type="text" name="characterName" value="" /></td>
				</tr>

				<s:submit value="登録" />
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
			</s:form>
		</table>

	</div>
	<div id="footer"></div>
</body>
</html>