<html>
<body>
<h2>Hello World!</h2>

<%--scriplet tags--%>
<%
    out.print("First JSP");
%>
<br>
<%--variable declaration--%>
<%
    int a = 3;
    int b = 5;
    out.print("Sum is: "+ (a+b));
%>

<%--initialize the variables--%>
<%!  int c= 7; %>
<% out.print(c); %>

<%--print the statement--%>
<%= "Value of the variable is:"+c %>

<%--call methods in JSP--%>
<%!
    int square(int n){
        return n*n;
    }
%>
<%= "Square is:" + square(2) %>

<%--JSP expression tags--%>
<%= "welcome to lucknow" %>

<%--handle the html request and get response--%>
<%--<%--%>
<%--    String username=request.getParameter("username");--%>
<%--    out.print("welcome "+username);--%>
<%--%>--%>

<%--handle the request and redirect to web page--%>
<%--<%--%>
<%--    String username=request.getParameter("username");--%>
<%--    response.sendRedirect(username);--%>
<%--%>--%>

<%--handle the session in JSP--%>
<%
    String username=request.getParameter("username");
    session.setAttribute("username",username);
%>

<%-- <a href="user.jsp">GO to user page</a>--%>

<%--forward the page in jsp--%>
<%--<jsp:forward page="user.jsp" />--%>

<%--forward the page in jsp with parameter--%>
<%--<jsp:forward page="user.jsp">--%>
<%--    <jsp:param name="email" value="pawan@gmail.com" />--%>
<%--</jsp:forward>--%>

<%--include the jsp page--%>
<jsp:include page="user.jsp" />

</body>
</html>
