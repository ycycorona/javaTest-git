<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userName = request.getParameter("name");
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <title>登录成功</title>
</head>
<body>

<div style="color:green">login success</div>
<div>
    hello <%=userName%>
</div>

</body>
</html>
