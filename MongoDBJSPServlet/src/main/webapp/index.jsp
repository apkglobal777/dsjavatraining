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

