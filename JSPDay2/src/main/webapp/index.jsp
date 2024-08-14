<html>
<body>
<h2>Hello World!</h2>
<%--print the statement--%>
<%
    out.print("This is JSP Page");
%>

<%--print the statement without out.print()--%>
<br>
<%= "This is second Page" %>

<%--declare the variable and initialize the value--%>
<%
    String name = "Pawan Sharma";
    out.print("<br>"+"My name is "+ name);

%>

<%--Arithmetic operation in JSP--%>
<%
    int a= 5;
    int b = 6;
    out.print("<br>"+"sum is "+ (a+b));
%>

<%--to define the method in JSP--%>
<%!
    String printMyName(String fname, String lname)
    {
        return lname+fname;
    }
%>
<%--to get the data from html page--%>
<%
    String fnameValue = request.getParameter("fnameID");
    String lnameValue = request.getParameter("lnameID");
    String output = printMyName(fnameValue, lnameValue);
    out.print("method result is"+output);
//    String genderValue = request.getParameter("genderID");

//    if (genderValue.equalsIgnoreCase("male"))
//    {
//        if (Integer.parseInt(ageValue) > 18)
//        {
//            out.print(nameValue + " eligible");
//        }else{
//            out.print(nameValue+ " not eligible");
//        }
//    }else {
//        if (Integer.parseInt(ageValue) > 16)
//        {
//            out.print(nameValue + " eligible");
//        }else {
//            out.print(nameValue + " not eligible");
//
//        }
//    }

    //out.print("The sum is"+ (Integer.parseInt(aValue)+Integer.parseInt(bValue)));

//    if ( (genderValue.equalsIgnoreCase("male") && Integer.parseInt(ageValue) > 18)
//            || (genderValue.equalsIgnoreCase("male") && Integer.parseInt(ageValue) > 16))
//    {
//        out.print(nameValue + " eliglible");
//    }else {
//        out.print(nameValue+ "not eligible may be gender or age issue");
//    }

//    out.print((genderValue.equalsIgnoreCase("male")
//            && Integer.parseInt(ageValue) > 18) ||
//            (genderValue.equalsIgnoreCase("male") && Integer.parseInt(ageValue) > 16)
//            ? "eliglible" : "not eligible may be gender or age issue" );


    //response the specific website
    //response.sendRedirect("http://www.google.com");

    //to check the username and password is correct or not
    String username = request.getParameter("usernameID");
    String password = request.getParameter("passwordID");

    if (username.equals("bbd") && password.equals("123"))
    {
        response.sendRedirect("http://localhost:8080/JSPDay2_war_exploded/user.jsp");
        session.setAttribute("username", username);
    }else {
        response.sendRedirect("http://localhost:8080/JSPDay2_war_exploded/pagenotfound.html");
    }
%>

</body>
</html>
