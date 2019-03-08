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

<link rel="stylesheet" type="text/css" href="/ecsite/css/Style.css">

<title>UserCreateConfirm画面</title>
<style type="text/css">

a{
font-size:15px;
}

</style>

<script type="text/javascript">
   function submitAction(url){
	   $('form').attr('action',url);
	   $('form').submit();
   }
</script>

</head>
<body>
   <div id="header">
      <div id="pr"></div>
   </div>
   <div id="main">
      <div id="top">
         <p>UserCreateConfirm</p>
      </div>
      <div>
         <h3>登録する内容は以下で宜しいですか。</h3>
         <table>
            <s:form action="UserCreateCompleteAction">
               <tr id="box">
                  <td>
                     <label>ログインID</label>
                  </td>
                  <td>
                   <s:property value="loginUserId" escape="false" />
                  </td>
               </tr>

               <tr id="box">
                  <td>
                     <label>ログインPASS</label>
                  </td>
                  <td>
                   <s:property value="loginPassword" escape="false" />
                  </td>
               </tr>

               <tr id="box">
                  <td>
                     <label>ユーザー名</label>
                  </td>
                  <td>
                     <s:property value="userName" escape="false" />
                  </td>
               </tr>
               <tr>
                  <td>
                     <s:submit value="完了" />
                  </td>
               </tr>
            </s:form>
         </table>

         <a href='<s:url action="UserCreateAction" />'>ユーザー登録画面に戻る</a>

      </div>
   </div>

   <div id="footer">
      <div id="pr"></div>
   </div>
</body>
</html>