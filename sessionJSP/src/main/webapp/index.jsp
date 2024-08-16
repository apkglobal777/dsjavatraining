<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="javax.swing.*" %>
<html>
<body>

<%--handle the login --%>
<%

//    String username1 = request.getParameter("usernameID");
//    String password1 = request.getParameter("passwordID");
    String url = "jdbc:mysql://localhost:3311/testing";
    String user="root";
    String password="";
    // Load the Connector/J driver
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    try {
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Database connected");
        String insert="insert into student(name) values(?)";
        PreparedStatement ps= null;
        try {
            ps = con.prepareStatement(insert);
            ps.setString(1, "Pawan Sharma");
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

    //to check the user is already login or not
//    if (Boolean.FALSE.equals(session.getAttribute("loggedin")))
//    {
//        //to validate the user
//        if (username1.equals("bbd") && password.equals("123"))
//        {
//            //add the username into the session
//            session.setAttribute("usernamekey", username1);
//            session.setAttribute("isloginkey", true);
////        redirect to profile page
//            response.sendRedirect("http://localhost:8080/sessionJSP_war_exploded/profile.jsp");
//
//        }else{
//            out.print("Invalid credentials");
//        }
//    }else{
//        session.setAttribute("usernamekey", username1);
//        response.sendRedirect("http://localhost:8080/sessionJSP_war_exploded/profile.jsp");
//    }


%>
</body>
</html>
