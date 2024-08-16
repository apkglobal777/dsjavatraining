<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<html>
<body>
<%--Add the JSP code scriptlet--%>
<%
    //to get the data from session and print the data
    out.print("The session data :" + session.getAttribute("taskNamekey")
            + session.getAttribute("taskDescriptionkey"));

    //Get the database connection url, username, password into String object
    String username = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3311/todoDB";
    // Load the Connector/J driver
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    //to establish the mysql database connection with JSP & Servlet
    try {
        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("Database connected");

        //to insert the todo data into database
        String insertTodo = "insert into todoTB(taskName, taskDescription) values (?, ?)";
        PreparedStatement ps = connection.prepareStatement(insertTodo);
        ps.setString(1, session.getAttribute("taskNamekey").toString());
        ps.setString(2, session.getAttribute("taskDescriptionkey").toString());
        ps.executeUpdate();
        System.out.println("todo inserted");

    }catch (Exception e)
    {
        System.out.println(e);
    }


%>

</body>
</html>
