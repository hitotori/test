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

<title>商品登録画面</title>
<style type="text/css">


/* ul{ */
/* text-align:center; */
/* } */

/* li{ */
/* /* width:28%; */ */
/* display:inline-block; */
/* border:solid 2px gray; */
/* list-style-type:none; */
/* /* margin-left:30px; */ */
/* /* margin-light:30px; */ */
/* margin-top:5px; */
/* color:red; */
/* } */

/* td.t1{ */
/* border:solid 1px gray; */
/* } */

div{
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
        <p>商品登録</p>
     </div>
     <s:form action="ProductEntryConfirmAction">
     <table>
        <tr>
           <td>
           <h2>商品名:</h2>
           <input type="text" name="item_name" value=""/>
           </td>
           <td>
           <h2>値段:</h2>
           <input type="text" name="item_price" value=""/>
           </td>
           <td>
           <h2>出品数:</h2>
           <input type="text" name="item_stock" value=""/>
           </td>
        </tr>
        <s:submit value="送信" />
     </table>
          <h3>記入ミスが無いよう再度お確かめください。</h3>
     </s:form>
 </div>

 <div id="footer">
    <div id="pr">
    <a href='<s:url action="ManagerAction" />'>管理者画面に戻る</a>
    </div>
 </div>

</body>
</html>