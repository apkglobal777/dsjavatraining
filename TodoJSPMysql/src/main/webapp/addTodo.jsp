<%--<%@ page import="java.sql.*" %>--%>
<%--<html>--%>
<%--<body>--%>
<%--<%--%>
<%--    String username = "root";--%>
<%--    String password = "";--%>
<%--    String url = "jdbc:mysql://localhost:3312/todoDatabase";--%>

<%--    ResultSet resultSet = null;--%>

<%--    // Retrieve the todo data from the session--%>
<%--    String taskName = session.getAttribute("taskNamekey") != null ? session.getAttribute("taskNamekey").toString() : "";--%>
<%--    String taskDescription = session.getAttribute("taskDescriptionkey") != null ? session.getAttribute("taskDescriptionkey").toString() : "";--%>
<%--    try {--%>
<%--        // Load the MySQL JDBC driver (not strictly necessary in JDBC 4.0 and above)--%>
<%--        Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC 4.0 onwards, you don't need this line--%>

<%--        // Establish the MySQL database connection--%>
<%--        Connection connection = DriverManager.getConnection(url, username, password);--%>
<%--        System.out.println("Database connected");--%>

<%--        String addTodo = "insert into addTodo(taskName,taskDescription) values(?,?)";--%>
<%--        PreparedStatement preparedStatement = connection.prepareStatement(addTodo);--%>
<%--        preparedStatement.setString(1, taskName);--%>
<%--        preparedStatement.setString(2, taskDescription);--%>
<%--        preparedStatement.executeUpdate();--%>

<%--        // Query to select all todos--%>
<%--        String query = "SELECT * FROM addTodo";--%>
<%--        PreparedStatement ps = connection.prepareStatement(query);--%>
<%--        resultSet = ps.executeQuery();--%>
<%--        // Iterate over the results and print them--%>
<%--        while (resultSet.next()) {--%>
<%--            int taskId = resultSet.getInt("taskID");--%>

<%--            String taskNameResult = resultSet.getString("taskName");--%>
<%--            String taskDescriptionResult = resultSet.getString("taskDescription");--%>
<%--            out.print(taskId + " " + taskNameResult + " " + taskDescriptionResult +--%>
<%--                    " <a href='#' onclick=\"deleteTodo(" + taskId + "); return false;\">Delete</a><br>");--%>

<%--        }--%>

<%--    } catch (Exception e) {--%>
<%--        e.printStackTrace();--%>
<%--    } finally {--%>
<%--        if (resultSet != null) {--%>
<%--            try {--%>
<%--                resultSet.close();--%>
<%--            } catch (SQLException e) {--%>
<%--                e.printStackTrace();--%>
<%--            }--%>
<%--        }--%>
<%--    }--%>
<%--%>--%>


<%--<script>--%>
<%--    function deleteTodo(taskId) {--%>
<%--        <%--%>
<%--        deleteTodoDatabase(taskId);--%>
<%--        %>--%>
<%--    }--%>
<%--</script>--%>

<%--<%!--%>
<%--    void deleteTodoDatabase(int taskID)--%>
<%--    {--%>
<%--        String username = "root";--%>
<%--        String password = "";--%>
<%--        String url = "jdbc:mysql://localhost:3312/todoDatabase";--%>
<%--        Connection connection = null;--%>
<%--        try {--%>
<%--            connection = DriverManager.getConnection(url, username, password);--%>
<%--            System.out.println("Database connected");--%>
<%--            String delete = "delete from addTodo where taskID = ?";--%>
<%--            PreparedStatement ps = connection.prepareStatement(delete);--%>
<%--            ps.setInt(1, taskID);--%>
<%--            ps.executeUpdate();--%>
<%--        } catch (SQLException e) {--%>
<%--            throw new RuntimeException(e);--%>
<%--        }--%>
<%--    }--%>
<%--%>--%>


<%--</body>--%>
<%--</html>--%>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>TODO List</title>
    <script>
        function deleteTodo(taskId) {
            if (confirm("Are you sure you want to delete this task?")) {
                var xhr = new XMLHttpRequest();
                xhr.open("POST", "deleteTodo.jsp", true);
                xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                xhr.send("taskID=" + taskId);

                xhr.onload = function() {
                    if (xhr.status == 200) {
                        // Reload the page or update the UI
                        location.reload();
                    } else {
                        alert("Error deleting task");
                    }
                };
            }
        }
    </script>
</head>
<body>
<%
    String username = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3312/todoDatabase";
    ResultSet resultSet = null;

    // Retrieve the todo data from the session
    String taskName = session.getAttribute("taskNamekey") != null ? session.getAttribute("taskNamekey").toString() : "";
    String taskDescription = session.getAttribute("taskDescriptionkey") != null ? session.getAttribute("taskDescriptionkey").toString() : "";

    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    PreparedStatement ps = null;

    try {
        // Establish the MySQL database connection
        connection = DriverManager.getConnection(url, username, password);
        System.out.println("Database connected");

        //to insert the data into database
        String addTodo = "INSERT INTO addTodo (taskName, taskDescription) VALUES (?, ?)";
        preparedStatement = connection.prepareStatement(addTodo);
        preparedStatement.setString(1, taskName);
        preparedStatement.setString(2, taskDescription);
        preparedStatement.executeUpdate();

        // Query to select all todos
        String query = "SELECT * FROM addTodo";
        ps = connection.prepareStatement(query);
        resultSet = ps.executeQuery();

        // Iterate over the results and print them
        while (resultSet.next()) {
            int taskId = resultSet.getInt("taskID");
            String taskNameResult = resultSet.getString("taskName");
            String taskDescriptionResult = resultSet.getString("taskDescription");
            out.print(taskId + " " + taskNameResult + " " + taskDescriptionResult +
                    " <a href='#' onclick=\"deleteTodo(" + taskId + "); return false;\">Delete</a><br>");
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {

    }
%>
</body>
</html>
