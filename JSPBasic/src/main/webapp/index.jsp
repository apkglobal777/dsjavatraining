<html>
<body>

<%--scriptlet jsp code in html--%>
<%
//   To print the name
   out.print("Hey im Pawan Sharma");
%>
<br>
<%--JSP expression--%>
<%= "My Email P@gmail.com"%>
<br>
<%--Working on the datatypes in JSP--%>
<%
   String name = "Sachin Singh";
   out.print("My friend name is " + name);
%>

<%= "without out function"+name%>

<%
   int a = 5;
   int b = 6;
   out.print("the sum is :"+ (a+b));

%>

<%--function in jsp--%>
<%--call methods in JSP--%>
<%!
   int square(int n){
      return n*n;
   }
%>
<%= "Square is:" + square(2) %>

<%
   int n = 10;
   for (int i=1; i<=10; i++)
   {
      out.print(n + " x +" + i + " = " + (n*i)+"<br>");
   }
%>

<%
   String fname = request.getParameter("fname");
   String lname = request.getParameter("lname");
   out.print("my username is"+ fname + lname);
   response.sendRedirect("http://google.com");
%>



</body>
</html>
