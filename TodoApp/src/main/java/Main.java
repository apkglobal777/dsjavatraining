//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TodoApp using MongoDB
//Create New Task with Date, name , task status, Time

import com.mongodb.DB;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //Create the MongoClient Connection
        //Add the maven in java for MongoDB
        var client = MongoClients.create("mongodb://localhost:27017/");
        //to create or access the database
        var todoDB = client.getDatabase("todoDB");
        //to create the collection
        //todoDB.createCollection("todoList");
        //to access the collection
        var todoCollection = todoDB.getCollection("todoList");
        //to create the document and add data into document
        var todoDocument = new Document();
        todoDocument.append("taskName", "WORK ON MONGODB");
        todoDocument.append("taskDate", "13 Aug 2024");
        todoDocument.append("taskTime", "20 hrs");
        todoDocument.append("taskStatus", false);
        //add the document into collection
        todoCollection.insertOne(todoDocument);

        //to update the document
        //change the date if status is false in all documents
        todoCollection.updateMany(new Document("taskStatus", false),
                new Document("$set", new Document("taskDate", "17 Aug 2024")));

        //delete the document if the status is true
        //todoCollection.deleteOne(new Document("taskStatus", true));

        //to fetch the document from collection
        FindIterable<Document> todoList = todoCollection.find();

        for (Document document: todoList)
        {
            //System.out.println("My document "+ document);
            System.out.println("Task Name "+ document.getString("taskName")
            +"Task Date"+ document.getString("taskDate"));
        }




    }
}