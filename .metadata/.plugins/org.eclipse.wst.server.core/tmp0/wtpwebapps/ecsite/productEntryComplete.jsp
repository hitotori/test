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

<title>商品登録完了画面</title>
<style type="text/css">

text-align:center;
}


</style>
</head>
<body>
 <div id="header">
    <div id="pr"></div>
 </div>
 <div id="main">
     <div id="top">
        <p>商品登録完了が完了しました。</p>
     </div>

         <a href='manager.jsp'>管理者画面</a><br>
         <a href='<s:url action="LogoutAction" />'>ログアウト</a>
 </div>

 <div id="footer">
    <div id="pr"></div>
 </div>

</body>
</html>