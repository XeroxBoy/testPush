<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
   
    <script type="text/javascript" src="js/jquery-latest.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->         <script type="text/javascript" src="js/websocket.js"></script>
	
	
  </head>
  
  <body>
<form action="login" method="post">
    <table>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age" /></td>
        </tr>
        <tr><td>
            <input type="submit" value="提交"/>
        </td></tr>
    </table>
</form>
    
<input type="button"  class="sender"  value="获取服务器时间">
  </body>
</html>
