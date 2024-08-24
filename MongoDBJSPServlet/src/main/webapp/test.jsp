<%@ page import="com.mongodb.client.MongoClient" %>
<%@ page import="com.mongodb.client.MongoClients" %>
<%@ page import="org.bson.Document" %>
<%@ page import="com.mongodb.client.MongoCollection" %>
<%@ page import="com.mongodb.client.FindIterable" %>
<html>
<head>
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
<h2>Hello World!</h2>

<%--Add the JSP code --%>
<%

    //to get the request from html to String object
    String username =request.getParameter("username");
    String blog = request.getParameter("blog");
    //to validate the form can't be empty
    if (username.isEmpty() || blog.isEmpty())
    {
%>
        <script type="text/javascript">
            alert("form can't be empty");
        </script>
<%
    }else {
        out.print(username + blog);
        //to create the mongoDB client connection
        var client = MongoClients.create("mongodb://localhost:27017/");
        //to create or access the database
        var blogDB = client.getDatabase("blogDB");
        //to create the collection
        //blogDB.createCollection("dailyBlogs");
        //to get the collection from database
        MongoCollection collectionName = blogDB.getCollection("dailyBlogs");
        //create document and add the data into document
        var blogDoc = new Document();
        blogDoc.append("username", username);
        blogDoc.append("blog", blog);
        collectionName.insertOne(blogDoc);

//      to fetch all document from mongodb
        FindIterable<Document> iterDoc = collectionName.find();

            for (Document document: iterDoc)
            {
                //out.print("<br>"+document.getString("username") + document.getString("blog")+ "<br>");

                out.print("<br>"+ document.getString("username")  + " " + document.getString("blog")  +
                        " <a href='#' onclick=\"deleteTodo(" + document.getString("username") + "); return false;\">Delete</a><br>");

            }



    }

%>
</body>
</html>

<%@ page import="com.mongodb.client.MongoClient" %>
<%@ page import="com.mongodb.client.MongoClients" %>
<%@ page import="org.bson.Document" %>
<%@ page import="com.mongodb.client.MongoCollection" %>
<%@ page import="com.mongodb.client.FindIterable" %>
<%@ page import="com.mongodb.client.MongoDatabase" %>
<%@ page import="com.mongodb.client.MongoCursor" %>
<!DOCTYPE html>
<html>
<head>
  <script>
    function deleteTodo(usernameID) {
      if (confirm("Are you sure you want to delete this task?")) {
        var xhr = new XMLHttpRequest();
        xhr.open("POST", "deleteTodo.jsp", true);
        xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        xhr.send("usernameID=" + encodeURIComponent(usernameID));

        xhr.onload = function() {
          if (xhr.status === 200) {
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
<h2>Hello World!</h2>

<%
  // Initialize variables
  String username = request.getParameter("username");
  String blog = request.getParameter("blog");
  boolean hasError = false;
  String errorMessage = "";

  // Validate the form
  if (username == null || username.trim().isEmpty() || blog == null || blog.trim().isEmpty()) {
    hasError = true;
    errorMessage = "Form can't be empty.";
  }

  if (hasError) {
%>
<script type="text/javascript">
  alert("<%= errorMessage %>");
</script>
<%
  } else {
    // Create MongoDB client and connect to the database
    try (MongoClient client = MongoClients.create("mongodb://localhost:27017")) {
      MongoDatabase database = client.getDatabase("blogDB");
      MongoCollection<Document> collection = database.getCollection("dailyBlogs");

      // Create and insert document
//            Document blogDoc = new Document("username", username).append("blog", blog);
//            collection.insertOne(blogDoc);

      // Fetch and display documents
      FindIterable<Document> documents = collection.find();
      MongoCursor<Document> cursor = documents.iterator();

      while (cursor.hasNext()) {
        Document doc = cursor.next();
        String docUsername = doc.getString("username");
        String docBlog = doc.getString("blog");

        out.print("<br>" + docUsername + ": " + docBlog +
                " <a href='#' onclick=\"deleteTodo('" + docUsername + "'); return false;\">Delete</a><br>");
      }
    } catch (Exception e) {
      e.printStackTrace();
      out.print("<p>Error connecting to database: " + e.getMessage() + "</p>");
    }
  }
%>
</body>
</html>