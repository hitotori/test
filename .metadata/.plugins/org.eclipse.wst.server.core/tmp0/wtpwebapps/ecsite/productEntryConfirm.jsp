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

<title>商品登録確認画面</title>
<style type="text/css">



table{
text-align:center;
margin:0 auto;
width:100%;
/* border: groove 2px black; */
}

#pr{
text-align:center;
/* margin-top:10px; */
text-height:10px;
font-size:25px;

}

#tr2{
border:groove 2px darkgray;
}
.b{
text-align:center;
margin-top:10px;
}

div{
text-align:center;
}

.sub{
padding:10px;
background-color:skyblue;
padding-left:25px;
padding-right:25px;
}

.sub:hover{
background-color:pink;
}
.pr{
min-width:10%;
width:auto !important;
width:10%;
min-height:100px;
height:auto !important;
height:100px;
}
.manager{
min-width:10%;
width:auto !important;
width:10%;
min-height:100px;
height:auto !important;
height:100px;
}

h3{
/* display:inline-block; */
color:blue;
padding-left:3%;
padding-right:3%;
text-align:center;
padding-top:20px;
margin:0;
}
#header{
height:180px;
}
</style>
</head>
<body>
 <div id="header">
    <div id="pr"><img src="syouhin_tana_shinausu.png" class="manager"><img src="syouhin_tana_shinausu.png" class="manager"><img src="syouhin_tana_shinausu.png" class="manager"></div>
 </div>
 <div id="main">
     <div id="top">
         <h1>商品登録最終確認画面</h1>
     </div>
     <h2>以下の内容で登録してもよろしいですか？</h2>

     <s:form action="ProductCompleteAction">
        <div class="b">
           <s:submit value="送信" class="sub"  />
        </div>
     </s:form>
     <s:form action="ProductEntryAction">
        <div class="b">
           <s:submit value="戻る" class="sub"  />
        </div>
     </s:form>
 </div>

 <div id="footer">
    <div id="pr">
            <h3>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a></h3>
    </div>
 </div>

</body>
</html>