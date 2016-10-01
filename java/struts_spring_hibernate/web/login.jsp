<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/5/17
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <s:form action="doLogin">
        <s:textfield name="loginName" label="用户名"/>
        <s:textfield name="loginPwd" label="密码"/>
        <s:submit value="确认"/>
    </s:form>
</body>
</html>
