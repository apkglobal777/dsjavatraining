<%--
  Created by IntelliJ IDEA.
  User: pawansharma
  Date: 14/08/24
  Time: 4:26 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Welcome User
<%

    out.print(session.getAttribute("username"));
%>
</body>
</html>
