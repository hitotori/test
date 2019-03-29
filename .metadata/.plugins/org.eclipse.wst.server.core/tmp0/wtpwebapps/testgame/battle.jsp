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

<title>battle画面</title>
<style type="text/css">
body {
	font-family: 'MS Gothic', 'Hiragino Kaku Gothic Std', 'Yu Gothic';
}
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

.headerli {
	display: inline-block;
	float: right;
	margin-top: 12px;
	border-radius: 10px;
}

input.rightup {
	border-radius: 50px;
	background-color: black;
	color: white;
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
}
table{
border:white 1px solid;
margin:0 auto;
width:80%;
	table-layout: fixed;
}
.namebox{
border:white 1px solid;
}
img{
width:100%;
height:90%;
}
.botan{
background-color:black;
color:white;
font-family: 'MS Gothic', 'Hiragino Kaku Gothic Std', 'Yu Gothic';
border:roghtgray solid 1px;
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
			<table>
				<tr>
					<td class="namebox">1st:ヌフイム</td>
					<td class="namebox">2nd:パンダ</td>
					<td class="namebox">3rd:森の賢人</td>
					<td class="namebox">4th:ヌフイム改</td>
					<td class="namebox">5th:トライホーン<br>ペガサス</td>
				</tr>
				<tr>
					<td><s:form action="GoBattle1Action" theme="simple">
							<img src="img/toy_slime_suraimu.png" class="image" />
							<input type="submit" value="戦う" class="botan" />
						</s:form>
					</td>
					<td><s:form action="GoBattle2Action" theme="simple">
							<img src="img/61479976_p0_square1200.jpg" class="image" />
							<input type="submit" value="戦う" class="botan" />
						</s:form>
					</td>
					<td><s:form action="GoBattle3Action" theme="simple">
							<img src="img/character_gorilla_hardboiled.png" class="image" />
							<input type="submit" value="戦う" class="botan" />
						</s:form>
					</td>
					<td><s:form action="GoBattle4Action" theme="simple">
							<img src="img/character_cthulhu_shoggoth.png" class="image" />
							<input type="submit" value="戦う" class="botan" />
						</s:form>
					</td>
					<td><s:form action="GoBattle5Action" theme="simple">
							<img src="img/business_unicorn_company.png" class="image" />
							<input type="submit" value="戦う" class="botan" />
						</s:form>
					</td>
				</tr>
			</table>
			<table>
				<tr>
					<td class="namebox">6th:水陸両用<br>マッチョマン</td>
					<td class="namebox">7th:超合金ゴーレム<br>クロビカリ</td>
					<td class="namebox">8th:深淵を狩る者</td>
					<td class="namebox">9th:前勇者ああああ</td>
					<td class="namebox">10th:ＹＨＶＨ</td>
				</tr>
				<tr>
					<td><s:form action="GoBattle6Action" theme="simple">
							<img src="img/business_man_macho.png" class="image" />
							<input type="submit" value="戦う" class="botan"/>
						</s:form>
					</td>
					<td><s:form action="GoBattle7Action" theme="simple">
							<img src="img/kyodai_robot.png" class="image" />
							<input type="submit" value="戦う" class="botan" />
						</s:form>
					</td>
					<td><s:form action="GoBattle8Action" theme="simple">
							<img src="img/shinigami.png" class="image" />
							<input type="submit" value="戦う" class="botan" />
						</s:form>
					</td>
					<td><s:form action="GoBattle9Action" theme="simple">
							<img src="img/yuusya_game.png" class="image" />
							<input type="submit" value="戦う" class="botan" />
						</s:form>
					</td>
					<td><s:form action="GoBattle10Action" theme="simple">
							<img src="img/yhvh.png" class="image" />
							<input type="submit" value="戦う" class="botan" />
						</s:form>
					</td>
				</tr>
			</table>
		</div>
		<div></div>

	</div>

	<div id="footer">
		<div id="pr"></div>
	</div>
</body>
</html>