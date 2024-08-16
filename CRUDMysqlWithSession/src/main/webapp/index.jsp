<html>
<body>
<%--Add the JSP code scriptlet--%>
<%
    //  To get the data from index.html page using request
    String taskName = request.getParameter("taskName");
    String taskDescription = request.getParameter("taskDescription");

    //  to print the value get from html page
    out.print("Task Name is "+taskName+ " and task description is "+ taskDescription);

    //  to add the data into session
    session.setAttribute("taskNamekey", taskName);
    session.setAttribute("taskDescriptionkey", taskDescription);

    //  to navigate the task jsp page
    response.sendRedirect("http://localhost:8080/CRUDMysqlWithSession_war_exploded/task.jsp");
%>
</body>
</html>
