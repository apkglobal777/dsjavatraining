<html>
<body>
<%--Add JSP code--%>
<%
    //Get the data from Html page
    String taskName = request.getParameter("taskName");
    String taskDescription = request.getParameter("taskDescription");
    out.print(taskName + " "+ taskDescription);

    //Add the html form data into session
    session.setAttribute("taskNamekey", taskName);
    session.setAttribute("taskDescriptionkey", taskDescription);

    //Redirect to Addtodo page
    response.sendRedirect("http://localhost:8080/TodoJSPMysql_war_exploded/addTodo.jsp");
%>
</body>
</html>
