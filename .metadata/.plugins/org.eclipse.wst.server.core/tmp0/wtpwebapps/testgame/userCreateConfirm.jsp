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

<title>UserCreateConfirm画面</title>
<style type="text/css">
#header {
	background-color: black;
	margin: 0 auto;
	border-radius: 10px;
	border: gray solid 1px;
	width: 100%;
	height: 60px;
}

.headerul {
	float: right;
	list-style: none;
	margin-right: 5%;
}

#main {
	color: white;
	clear: both;
	width: 100%;
	min-height: 600px;
	height: auto !important;
	height: 100%;
	background-color: black;
}

h3 {
	text-align: center;
}

table {
	margin: 0 auto; border : white 1px solid;
	border-radius: 10px;
	border: white 1px solid;
}

.tbl {
	/* border:white 1px solid; */
	/* border-radius:5px; */
	text-align: center;
}

.botan {
	text-align: center;
	padding-left: 35%;
}
.backbotan{
text-align:center;
}
.back{
text-align:center;
}
</style>

<script type="text/javascript">
	function submitAction(url) {
		$('form').attr('action', url);
		$('form').submit();
	}
</script>

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
		<div id="top"></div>
		<div>
			<h3>登録する内容は以下で宜しいですか。</h3>
			<table>
				<s:form action="UserCreateCompleteAction" theme="simple">
					<tr id="box">
						<td class="tbl"><label>ログインID</label></td>
						<td class="tbl">「<s:property value="loginUserId"
								escape="false" />」
						</td>
					</tr>

					<tr id="box">
						<td class="tbl"><label>ログインPASS</label></td>
						<td class="tbl">「<s:property value="loginPassword"
								escape="false" />」
						</td>
					</tr>

					<tr id="box">
						<td class="tbl"><label>ユーザー名</label></td>
						<td class="tbl">「<s:property value="userName" escape="false" />」
						</td>
					</tr>
					<tr>
						<td class="tbl"><label>キャラクターネーム</label></td>
						<td class="tbl">「<s:property value="characterName"
								escape="false" />」
						</td>
					</tr>
					<tr>
						<td class="botan"><s:submit value="完了" /></td>
					</tr>
				</s:form>
			</table>

			<br> <br><div class="backbotan"> <a href='<s:url action="UserCreateAction" />' class="back">ユーザー登録画面に戻る</a></div>

		</div>
	</div>

	<div id="footer">
		<div id="pr"></div>
	</div>
</body>
</html>