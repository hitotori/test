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
<title>管理者画面</title>
<style type="text/css">
body{
margin:0;
padding:0;
line-height:1.6;
latter-spacing:1px;
font-family:Verdana,Helvetica,sans-serif;
font-size:12px;
color:#333;
}

.mainleft{
float:left;
width:48%;
height:400px;
border:groove 3px gray;
}
.mainright{
float:right;
width:48%;
height:400px;
border:groove 3px gray;
}

table{
text-align:center;
margin:0 auto;
width:100%;
/* border: groove 2px black; */
}
#top{
width:90%;
margin:30px auto;
border:1px ridge #333;
}
#header{
width:100%;
/* height:200px; */
/* background-color:black;s
}
#pr{
text-align:center;
/* margin-top:10px; */
text-height:10px;
font-size:25px;

}
#main{
width:100%;
text-align:center;
}
#footer{
width:100%;
height:80px;
background-color:black;
clear:both;
}

#tr2{
border:groove 2px darkgray;
}
.b{
text-align:center;
margin-top:50px;
}

div{
text-align:center;
}

/* submitのボタンのおおきさとカラー */
.sub{
padding:10px;
background-color:skyblue;
}
/* submitのボタンに触れた時の動作 */
.sub:hover{
background-color:pink;
}
/* 画像について（可変性） */
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
color:white;
padding-left:3%;
padding-right:3%;
text-align:center;
padding-top:30px;
}
</style>
</head>
<body>
 <div id="header">
    <div id="pr"><img src="kaisya_ayatsuru_joushi.png" class="manager"><img src="money_fuyouhin_man_uru.png" class="manager"><img src="kaisya_ayatsuru_joushi.png" class="manager"></div>
 </div>
 <div id="main">
     <div id="top">
         <h1>管理者画面</h1>
     </div>
     <div class=mainleft>
     <table>
          <tr id=tr1>
             <td>
                 <h2>商品</h2>
             </td>
          </tr>

          <tr id=tr2>
             <s:form action="ProductEntryAction">
             <div class=b>
                 <s:submit value="商品登録" class="sub" />
             </div>
             </s:form>
          </tr>

          <tr id=tr2>
             <s:form action="ItemListAction">
             <div class=b>
                 <s:submit value="一覧表示" class="sub" />
             </div>
             </s:form>
          </tr>
     </table>
     </div>
     <div class=mainright>
     <table>
        <tr>
           <td>
              <h2>ユーザー</h2>
           </td>
        </tr>
        <tr>
             <s:form action="ManagerCreateAction">
             <div class=b>
                 <s:submit value="新規登録" class="sub" />
             </div>
             </s:form>
           <s:form action="UserListAction">
             <div class=b>
                 <s:submit value="一覧表示" class="sub" />
             </div>
           </s:form>
        </tr>
     </table>
     </div>

 </div>

 <div id="footer">
    <div id="pr">
            <h3>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a></h3>
    </div>
 </div>

</body>
</html>