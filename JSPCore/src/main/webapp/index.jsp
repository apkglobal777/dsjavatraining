<html>
<body>
<h2>Hello World!</h2>

<%--Add JSP code inside the HTML Code--%>
<%--Print any expression or statement--%>
<%
    out.print("My Name is Pawan Sharma");
%>
<br>

<%--Print any expression or statement without out.print() method--%>
<%= "My Email is : Pawan@gmail.com"%>

<%--Work on the variables and datatypes in JSP with declaration && initialization--%>

<%
//    declare the variable in JSP
    String collegeName = "BBD";
    out.print("<br>"+"My college name is "+ collegeName);
%>

<%--Add two number in JSP--%>
<%
    int a = 7;
    int b = 9;
    out.print(collegeName);
    out.print("<br>"+ "Sum is :"+ (a+b));
%>

<%--Get the request from HTML Page--%>


<%--To redirect the specific url page--%>
<%
    String keyword = request.getParameter("keyword");
    switch (keyword)
    {
        case "google":
            response.sendRedirect("https://google.com/");
            break;
        case "youtube":
            response.sendRedirect("https://youtube.com/");
            break;
        case "facebook":
            response.sendRedirect("https://facebook.com/");
            break;
        default:
            response.sendRedirect("https://bbdu.ac.in/");
    }
%>


</body>
</html>
