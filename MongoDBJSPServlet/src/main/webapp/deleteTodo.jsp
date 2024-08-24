
<%--
  Created by IntelliJ IDEA.
  User: pawansharma
  Date: 16/08/24
  Time: 7:47 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page import="com.mongodb.client.MongoClients" %>
<%@ page import="com.mongodb.client.MongoClient" %>
<%@ page import="org.bson.Document" %>
<%
    String usernameIDParam = request.getParameter("usernameID");

    if (usernameIDParam != null) {
        String usernameID = usernameIDParam.toString();
            MongoClient client = MongoClients.create("mongodb://localhost:27017/");
            var database = client.getDatabase("blogDB");
            var collectionName = database.getCollection("dailyBlogs");
            collectionName.deleteOne(new Document("username", usernameID));

    }
%>

</body>
</html>
