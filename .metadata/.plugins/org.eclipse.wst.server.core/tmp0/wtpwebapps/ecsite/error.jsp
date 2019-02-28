<!-- 自主追加コンテンツ -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="imagetoolbar" content="no">
<meta name="descrption" content="" />
<meta name="keywords"content="" />
<title>BuyItem画面</title>
<style type="text/css">
body{
margin:0;
padding:0;
line-height:1.6;
latter-spacing:1px;
font-family:Verdana,Helvetica,sans-serif;
font-size:12px;
color:#333;
background:#fff;
}

table{
text-align:center;
margin:0 auto;
}
#top{
width:780px;
margin:30px auto;
border:1px solid #333;
}
#header{
width:100%;
height:80px;
background-color:black;
}
#main{
width:100%;
height:500px;
text-align:center;
}
#footer{
width:100%;
height:80px;
background-color:black;
clear:both;
}

</style>
</head>
<body>
<div id="header">
   <div id="pr"></div>
</div>


<div id="main">
    <div id="top">
        <p>エラーが発生しました</p>
    </div>


    <div>
       <p><a href='<s:url action="UserCreateAction" />'>ひとつ前のページに戻る</a></p>
       <p><a href='<s:url action="LoginAction" />'>Login画面に戻る</a></p>
       <p><a href='<s:url action="GoHomeAction" />'>Home画面に戻る</a></p>
    </div>
</div>


<div id="footer">
    <div id="pr"></div>
</div>


</body>
</html>