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
<title>新規ユーザー登録確認画面</title>

<style type="text/css">
#text-center{
display:inline-block;
text-align:center;
}
.box{
border:solid 2px rightgray;
}
td{
text-align:center;
border:solid 1px rightgray !important;
}
tr{
text-align:center;
border:solid 1px rightgray !important;
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
       <p><a href='<s:url action="ManagerCreateAction" />'>ひとつ前のページに戻る</a></p>
       <p><a href='<s:url action="ManagerHomeAction" />'>Login画面に戻る</a></p>
       <p><a href='<s:url action="ManagerAction" />'>管理者画面に戻る</a></p>
    </div>
</div>


<div id="footer">
    <div id="pr"></div>
</div>

</body>
</html>