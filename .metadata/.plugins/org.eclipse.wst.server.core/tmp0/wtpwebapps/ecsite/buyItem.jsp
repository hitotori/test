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
width:70%
}

li{
/* width:28%; */
width:100%
display:inline-block;
border:solid 2px red;
list-style-type:none;
/* margin-left:30px; */
/* margin-light:30px; */
margin-top:5px;
color:red;
}

table{
text-align:center;
margin:0 auto;
width:100%;
/* border: groove 2px black; */
/* table-layout:fixed; */
table-layout:auto;
}
th{
background-color:red;
color:white;
}
td{
back-ground-color:lightpink;
color:black;
}

td.t1{
border:solid 1px darkgray;
margin:0;
/* padding:0; */

}
h2{
color:skyblue;
}
.waku{
border:solid 2px darkgray;
width:70%;
}
.waku2{
border:solid 2px darkgray;
width:25%;
}
/* td.t2{ */
/* border:solid 1px black; */
/* } */

.midashi{
background-color:red;
}

td.t3{
border:solid 1px darkgray;
margin:0;
/* padding:0; */
color:white;

}
#pr{
margin-bottom:0px;
padding:0px;
}
.foot{
margin-bottom:0px;
padding-top:20px;
margin-top:10px;
}
.search{
margin-top:20px;
}
</style>
</head>
<body>
 <div id="header">
    <s:form action="SearchAction">
       <input type="text" class="search" value=""  />
       <input type="submit" name="searching" class="search" value="検索"  />
    </s:form>
 </div>
 <div id="main">
     <div id="top">
        <div class="face">
           <img src="computer_programming_woman.png" class="buy">
        </div>
        <div class="chatting">
           <div class="says">
               <p>BuyItem</p>
           </div>
        </div>
     </div>
     <h2>購入したい商品をお選びください。</h2>




<!--             <input type="checkbox" name="BUY" value="Buy" class="check"/> -->
            <s:form action="BuyItemAction" theme="simple">
            <table class="waku">



               <tr class="midashi">
                  <td class=t3>
                     <span>購入</span>
                  </td>
                  <td class=t3>
                     <span>ID</span>
                  </td>
                  <td class=t3>
                     <span>商品名</span>
                  </td>
                  <td class=t3>
                     <span>値段</span>
                  </td>
                   <td class=t3>
                     <span>購入個数</span>
                  </td>

               </tr>

               <s:iterator value="itemList" status="ex">
<!--                 status="ex" -->
<!--         value , var , status, statusとvarの意味？？？-->

               <tr>
                  <td class=t1>
             <input type="checkbox"  name="index" value='<s:property value="#ex.index" />' />
<%--              value="<s:property value="#ex.index" />" --%>
                  </td>
                  <td class=t1>
                     <s:property value="id" /><br>
                  </td>
                  <td class=t1>
                    <s:property value="itemName" /><br>
                  </td>
                  <td class=t1>
                     <s:property value="itemPrice" />
                     <span>円</span>
                  </td>

                  <td class=t1>
<!--                    Countにも value="#ex.index" />をいれるべき？ -->
                     <select name="count" >
                     <option value="1" selected="selected">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                     </select>
                  </td>


               </tr>

<!--                <tr> -->
<!--                   <td> -->
<%--                    <s:submit value="購入" /> --%>
<!--                   </td> -->
<!--                </tr> -->

         </s:iterator>
                <tr>
                <td>
                </td>
                </tr>

         </table>

<!--          <tr> -->
<!--                <td> -->
                  <s:submit value="購入" />
<!--                </td> -->
<!--          </tr> -->

          </s:form>


 </div>

 <div id="footer">
    <div id="pr">
               <div class="foot">
<%--                <input type="submit" value="戻る" onclick="return confirm('ログイン情報がリセットされます。<br>よろしいですか？');" /> --%>
              <a href='<s:url action="GoHomeAction" />'>前画面に戻る</a>
              <a href='<s:url action="MyPageAction" />'>マイページ</a>
              <a href='<s:url action="LogoutAction" />'>ログアウト</a>
           </div>
    </div>
 </div>

</body>
</html>