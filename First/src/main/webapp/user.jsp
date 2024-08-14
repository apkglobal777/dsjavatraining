<%--
  Created by IntelliJ IDEA.
  User: pawansharma
  Date: 13/08/24
  Time: 1:17 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    String name=(String)session.getAttribute("username");
    out.print("Hello "+name);

%>
<%= request.getParameter("email") %>
</body>
</html>
