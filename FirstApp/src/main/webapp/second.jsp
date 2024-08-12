<%--
  Created by IntelliJ IDEA.
  User: pawansharma
  Date: 12/08/24
  Time: 8:45 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<%

    String name=(String)session.getAttribute("user");
    out.print("Second Page Hello "+name);

%>
</body>
</html>
