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

<link rel="stylesheet" type="text/css" href="/ecsite/css/Style.css">

<title>LoginError画面</title>
<style type="text/css">

</style>
</head>
<body>
<div id="header">
   <div id="pr"></div>
</div>


<div id="main">
    <div id="top">
        <p>ユーザー名かパスワードが間違っています。</p>
    </div>


    <div>
       <p><a href='<s:url action="HomeAction" />'>Login画面に戻る</a></p>
       <p><a href='<s:url action="GoHomeAction" />'>Home画面に戻る</a></p>
    </div>
</div>


<div id="footer">
    <div id="pr"></div>
</div>


</body>
</html>