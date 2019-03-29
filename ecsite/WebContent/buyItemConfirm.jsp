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

<link rel="stylesheet" type="text/css" href="/ecsite/css/Style.css">

<title>buyItemConfirm画面</title>
<style type="text/css">
table {
	text-align: center;
	margin: 0 auto;
	width: 60%;
	/* border: groove 2px black; */
	table-layout: fixed;
	/* table-layout:auto; */
}

th {
	background-color: red;
	color: white;
}

td {
	back-ground-color: lightpink;
	color: black;
}

td.t1 {
	border: solid 1px darkgray;
	margin: 0;
	/* padding:0; */
}

h2 {
	color: skyblue;
}

.waku {
	border: solid 2px darkgray;
	width: 70%;
}

.waku2 {
	border: solid 2px darkgray;
	width: 25%;
}
/* td.t2{ */
/* border:solid 1px black; */
/* } */
.midashi {
	background-color: red;
}

td.t3 {
	border: solid 1px pink;
	margin: 0;
	/* padding:0; */
	color: white;
	background-color: violet;
}

#pr {
	margin-bottom: 0px;
	padding: 0px;
}

.foot {
	margin-bottom: 0px;
	padding-top: 20px;
	margin-top: 10px;
}

.tablebuttonleft {
	display: inline-block;
}

input {
	margin-left: 5%;
	margin-right: 5%;
	margin-top: 10px;
}

tbody {
	border-bottom: solid 2px red;
	margin-bottom: 10%;
}

tfoot {
	border: 2px dotted green;
	background-color: white;
}

.drow {
	background-color: violet;
}

.t2 {
	height: 20px;
}
h3{
padding-top:0px;
margin-bottom:20px;
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
		<div id="pr"></div>
	</div>

	<div id="main">
		<div id="top">
			<p>BuyItemConfirm</p>
		</div>
		<div>
			<s:form theme="simple">
				<table>
					<tr>
						<td class=t3>商品名</td>
						<td class=t3>値段</td>
						<td class=t3>購入個数</td>
					</tr>

					<s:iterator value="selectList">
						<tbody>

							<tr>
								<td class=t1><s:property value="itemName" /><br></td>
								<td class=t1><s:property value="itemPrice" /><span>円</span></td>
								<td class=t1><s:property value="count" /><span>個</span></td>
							</tr>
						</tbody>
					</s:iterator>
					<tfoot>
						<tr>
							<td class=t2 colspan="3"></td>
						</tr>
					</tfoot>
				</table>

				<!-- 	<h3>合計金額：</h3> -->

				<table class="waku2">
					<tr>
						<td class=t2><span>支払い方法</span></td>

					</tr>
					<tr>
						<td class=t2><input type="radio" name="pay" value="1"
							checked="checked">現金支払い <input type="radio" name="pay"
							value="2">クレジットカード</td>
					</tr>
				</table>
				<input type="button" value="戻る" onclick="submitAction('HomeAction')" />
				<input type="button" value="完了"
					onclick="submitAction('BuyItemConfirmAction')" />



			</s:form>
			<div>
				<p>
					前画面に戻るには<a href='<s:url action="GoHomeAction" />'>こちら</a>
				</p>
				<p>
					マイページに戻るには<a href='<s:url action="MyPageAction" />'>こちら</a>
				</p>
			</div>
		</div>
	</div>

	<div id="footer">
		<div id="pr"></div>
	</div>

</body>
</html>