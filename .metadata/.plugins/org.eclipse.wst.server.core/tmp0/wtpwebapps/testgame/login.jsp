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

<link rel="stylesheet" type="text/css" href="/testgame/WebContent/css/Style.css">
<link rel="img" type="image/png" href="/testgame/img">
<title>title</title>
<style type="text/css">
h1{
text-align:center;
}
.Login{
width:100%;
text-align:center;
}
.botanbox{
clear:both;
text-align:center;
}
.submitbotton{
text-align:center;
}
.submitlogin{
text-align:center;
background-color:orange;

}
</style>
</head>
<body>
	<div id="header">
		<h1 class="midashi">ログイン画面</h1>
	</div>
	<div id="main">
		<s:form action="LoginAction">

			<table class="Login">
				<tr>
					<th scope="row"><s:label value="ユーザーID" /></th>
					<td><s:textfield name="userId" class="text" value="" /></td>
				</tr>
				<tr>
					<th scope="row"><s:label value="パスワード" /></th>
					<td><s:textfield name="userPassword" class="text" value="" /></td>
				</tr>
			</table>
			<div class="botanbox">
			<div class="submitbotton">
				<s:submit value="ログイン" class="submitlogin" onclick="LoginAction()" />
			</div>
			<div class="submitbotton">
				<s:submit value="新規ユーザー登録" class="submitlogin"
					onclick="UserCreateAction()" />
			</div>
			</div>
		</s:form>
	</div>

	<div id="footer"></div>
</body>
</html>