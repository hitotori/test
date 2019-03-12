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

<title>BuyItem画面</title>
<style type="text/css">
ul{
text-align:center;
}

li{
/* width:28%; */
display:inline-block;
border:solid 2px red;
list-style-type:none;
/* margin-left:30px; */
/* margin-light:30px; */
margin-top:5px;
color:red;
}



td.t1{
border:solid 1px gray;
}
h2{
color:red;
}

</style>
</head>
<body>
 <div id="header">
    <div id="pr"></div>
 </div>
 <div id="main">
     <div id="top">
        <p>BuyItem</p>
     </div>
     <h2>購入したい商品をお選びください。</h2>
     <ul>
       <li>
        <s:form action="BuyItemAction">
<%--         <s:iterator value="%{ItemList}"> --%>
<!--         value , var , status, statusとvarの意味？？？-->
            <table>

               <tr>
                  <td class=t1>
                     <span>商品名</span>
                  </td>
                  <td class=t1>
                    <s:property value="session.buyItem_name" /><br>
                  </td>
               </tr>
               <tr>
                  <td class=t1>
                     <span>値段</span>
                  </td>
                  <td class=t1>
                     <s:property value="session.buyItem_price" />
                     <span>円</span>
                  </td>
               </tr>
               <tr>
                  <td class=t1>
                     <span>購入個数</span>
                  </td>
                  <td class=t1>
                     <select name="count">
                     <option value="1" selected="selected">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                     </select>
                  </td>
               </tr>
               <tr>
                  <td class=t1>
                     <span>支払い方法</span>
                  </td>
                  <td class=t1>
                     <input type="radio" name="pay" value="1" checked="checked">現金支払い
                     <input type="radio" name="pay" value="2">クレジットカード
                  </td>
               </tr>

               <tr>
                  <td>
                   <s:submit value="購入" />
                  </td>
               </tr>
            </table>
<%--          </s:iterator> --%>

        </s:form>

        </li>
       </ul>
           <div>
              <p>前画面に戻るには<a href='<s:url action="GoHomeAction" />'>こちら</a></p>
              <p>マイページは<a href='<s:url action="MyPageAction" />'>こちら</a></p>
              <p>ログアウトは<a href='<s:url action="LogoutAction" />'>こちら</a></p>
           </div>

 </div>

 <div id="footer">
    <div id="pr"></div>
 </div>

</body>
</html>