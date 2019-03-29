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
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<link rel="stylesheet" type="text/css" href="../css/Style.css">
<link rel="img" type="image/png" href="/testgame/img">
<title>title</title>
<style type="text/css">

body{
font-family:'MS Gothic', 'Hiragino Kaku Gothic Std', 'Yu Gothic';
}

.headerul{
list-style:none;
float:right;
display:inline-block;
}
.headerli{
display:inline-block;
}
#main{
clear:both;
background-image:url(img/figure_tatakai_kakutou.png);
background-size:contain;
background-repeat:no-repeat;
background-position:60%;
width:100%;
min-height:600px;
height:auto !important;
height:100%;

}

.title{
text-align:center;
width:100%;
height:70%;
margin:0 auto;
/* fontsize:1.2rem; */
color:white;
border-radius:10px;
box-shadow: 0 0 0 4px #fff inset;
background-color:black;
border:5px solid white;
border:5px solid black;
}
.titlename{
margin:2%;
margin-right:1px;
white-space: pre;
overflow:hidden;
text-align:center;
color:white;
font-family:MSgothic;
/* border:3px solid white; */
/* border-radius: 3px; */
}
.titlename:after{
}
.menu{
list-style:none;
text-align:center;
}
.m1{
/* boreder:black solid 2px; */
}

input{
border-radius:50px;
background-color:darkgray;
color:white;

}
input.start{
background-color:black;
padding-left:30px;
padding-right:30px;
padding-top:20px;
padding-bottom:20px;
margin:15px;
margin-top:35px;
text-align:center;
/* border:white:solid 1px; */
}

</style>
</head>
<body>
<div id="header">
 <ul class="headerul">
    <li class="headerli">
      <input type="button" value="キャッシュクレジットの削除（実装されていません）" onclick="submitAction('')" />
    </li>
    <li class=headerli>
         <input type="button" value="問い合わせ" onclick="submitAction('InquiryAction')" />
      </li>
 </ul>
</div>
<div id="main">
   <div class="title">
     <h1 class="titlename">テストGAME</h1>
   </div>
   <ul class="menu">
      <li class=m1>
       <s:form action="TitleAction">
         <input type="submit" class="start" value="スタート" />
         </s:form>
      </li>
      <li class=m1>
         <input type="button"  class="start" value="称号（実装されていません）" onclick="submitAction('')" />
      </li>
      <s:form action="GoTitleAction" theme="simple">
      <li class=m1>
         <input type="submit"  class="start" value="再度タイトル表示" />
      </li>
      </s:form>
   </ul>

</div>

<div id="footer">
</div>
</body>
</html>