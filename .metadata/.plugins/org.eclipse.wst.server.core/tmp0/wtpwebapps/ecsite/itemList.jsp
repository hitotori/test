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

<title>出品一覧画面</title>
<style type="text/css">

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
margin-top:50px;
}

div{
text-align:center;
}

.sub{
padding:10px;
background-color:skyblue;
}

.sub:hover{
background-color:pink;
}
.manager{
width:230px;
height:230px;
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
         <h1>出品一覧</h1>
     </div>
     <div>
         <s:if test="pList == null">
         <h2>出品情報はありません。</h2>
         </s:if>
         <s:else>
            <h3>出品している商品は以下になります。</h3>
<%--             <s:form action="ItemListConfirmAction"> --%>
         <table border="1">
            <tr>
               <th>ID</th>
               <th>商品名</th>
               <th>値段</th>
               <th>出品個数</th>
               <th>登録日</th>
               <th>更新日</th>
            </tr>
            <s:iterator value="pList">
               <tr>
                  <td><s:property value="id" /></td>
                  <td><s:property value="itemName" /></td>
                  <td><s:property value="itemPrice" /><span>円</span></td>
                  <td><s:property value="itemStock" /><span>個</span></td>
                  <td><s:property value="insert_date" /></td>
                  <td><s:property value="update_date" /></td>
               </tr>
            </s:iterator>
         </table>
<%--                <s:submit value="削除" class="sub" /> --%>
<%--             </s:form> --%>
         </s:else>
         <s:if test="message !=null">
            <h3><s:property value="message" /></h3>
         </s:if>
         <div id="text-right">
            <p>管理者画面へ戻る場合は<a href='manager.jsp'>こちら</a></p>
            <p>ログアウトする場合は<a href='<s:url action="LogoutAction" />'>こちら</a></p>
         </div>
      </div>
 </div>

 <div id="footer">
    <div id="pr"></div>
 </div>



</body>
</html>