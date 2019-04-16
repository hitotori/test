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
<title>新規ユーザー登録入力画面</title>

<style type="text/css">
#text-center{
display:inline-block;
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
         <p>UserCreate</p>
      </div>
      <div>
         <s:if test="errorMessage !=">
           <s:property value="errorMessage" escape="false" />
         </s:if>
         <table>
            <s:form action="ManagerCreateConfirmAction">
               <tr>
                  <td>
                     <label>ログインID</label>
                  </td>
                  <td>
                     <input type="text" name="loginUserId" value="" />
                  </td>
               </tr>
               <tr>
                  <td>
                     <label>ログインPASS</label>
                  </td>
                  <td>
                     <input type="text" name="loginPassword" value="" />
                  </td>
               </tr>
               <tr>
                  <td>
                     <label>ユーザー名</label>
                  </td>
                  <td>
                     <input type="text" name="userName" value="" />
                  </td>
               </tr>
               <tr>
                  <td>
                   <label>管理者権限を持たせる</label>
                  </td>
                  <td>
                    <input type="checkbox" name="authority"value="〇" />
                  </td>
               </tr>

               <s:submit value="登録" />
            </s:form>
         </table>
         <div>
            <span>前画面に戻るには</span><a href='<s:url action="ManagerAction" />'>こちら</a>
         </div>
      </div>
   </div>
   <div id="footer">
      <div id="pr"></div>
   </div>
</body>
</html>