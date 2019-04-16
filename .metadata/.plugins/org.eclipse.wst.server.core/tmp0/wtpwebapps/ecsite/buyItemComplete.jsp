<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="Content-Style-Type" content="text/css">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="imagetoolbar" content="no">
<meta name="descrption" content="" />
<meta name="keywords"content="" />

<link rel="stylesheet" type="text/css" href="/ecsite/css/Style.css">

<title>BuyitemComplete画面</title>
<style type="text/css">

</style>

</head>
<body>
   <div id="header">
     <div id="pr"></div>
   </div>

   <div id="main">
      <div id="top">
         <p>BuyItemComplete</p>
      </div>
      <div>
         <p>購入手続きが完了しました。</p>
            <div>
               <a href='<s:url action="MyPageAction" />'>マイページ</a>
               <span>からの購入履歴の確認が可能です。</span>
               <p>引き続きお買い物をされる場合は<a href='<s:url action="HomeAction" />'>こちら</a>から</p>
               <p>Homeに戻る場合は<a href='<s:url action="GoHomeAction" />'>こちら</a>から</p>
            </div>
      </div>
   </div>

   <div id="footer">
      <div id="pr"></div>
   </div>

</body>
</html>