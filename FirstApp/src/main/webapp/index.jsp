<%-- <html>--%>
<%--<body>--%>
<%--<h2>Hello World!</h2>--%>
<%--</body>--%>
<%--</html>--%>


<%--<html>--%>
<%--<body>--%>
<%--&lt;%&ndash;scriptlet tag in jsp&ndash;%&gt;--%>
<%--<%--%>
<%--    String name=request.getParameter("username");--%>
<%--    out.print("welcome "+name);--%>
<%--%>--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>


<%--
expression tags in jsp--%>

<%--<html>--%>
<%--<body>--%>
<%--<%= "welcome to jsp" %>--%>
<%--</body>--%>
<%--</html>--%>

<%--<html>--%>
<%--<body>--%>
<%--Current Time: <%= java.util.Calendar.getInstance().getTime() %>--%>
<%--</body>--%>
<%--</html>--%>

<%--get the value from html--%>
<%--<html>--%>
<%--<body>--%>
<%--<%= "Welcome "+request.getParameter("username") %>--%>
<%--</body>--%>
<%--</html>--%>

<%--Declaration Tags in jsp--%>
<%--<html>--%>
<%--<body>--%>
<%--<%! String value= "Welcome JSP"; %>--%>
<%--<%= "Value of the variable is:"+value %>--%>
<%--</body>--%>
<%--</html>--%>

<%--JSP response--%>
<%--<%--%>
<%--    response.sendRedirect("http://www.google.com");--%>
<%--%>--%>

<%--Work on the JSP session--%>
<html>
<body>
<%

    String myname=request.getParameter("username");
    out.print("Welcome "+myname);

    session.setAttribute("user",myname);
//    <a href="second.jsp">second jsp page</a>


%>

<jsp:forward page="second.jsp" />
</body>
</html>