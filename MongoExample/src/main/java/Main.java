import com.mongodb.Mongo;

import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCommandException;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        MongoDatabase database;
        //establish the connection of mongodb with java and get the collections
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017/");
        database = mongoClient.getDatabase("bbdit");
        System.out.println("database name -> " + database.getName());
        for (String name: database.listCollectionNames()) {
            System.out.println(name);
        }

        //create the collection using mongodb with java
        try {
            database.createCollection("faculty");
            System.out.println("Collection created successfully");
        } catch (MongoCommandException e) {
            database.getCollection("faculty").drop();
        }

        //to insert many documents into collections
//        var docs = new ArrayList< Document >();
          MongoCollection<Document> collection = database.getCollection("studentdb");
//        var d1 = new Document("_id", 1);
//        d1.append("_firstName", "Pawan");
//        d1.append("_lastName", "sharma");
//        docs.add(d1);
//
//        var d2 = new Document("_id", 2);
//        d2.append("_firstName", "ivan");
//        d2.append("_lastName", "sharma");
//        docs.add(d2);
//
//        var d3 = new Document("_id", 3);
//        d3.append("_firstName", "Anshu");
//        d3.append("_lastName", "sharma");
//        docs.add(d3);
//
//        var d4 = new Document("_id", 4);
//        d4.append("_firstName", "Amir");
//        d4.append("_lastName", "Khan");
//        docs.add(d4);
//
//        collection.insertMany(docs);

        //to insert single document into collections
//        var singleDocument = new Document("_id", 5);
//        singleDocument.append("_firstName", "Sakshi");
//        singleDocument.append("_lastName", "Sharma");
//        collection.insertOne(singleDocument);

        //to update the single document into collections
//        collection.updateOne(new Document("_firstName", "Sakshi"),
//                new Document("$set", new Document("_lastName", "Abhay")));

//        try (MongoCursor< Document > cur = collection.find().iterator()) {
//            while (cur.hasNext()) {
//                var doc = cur.next();
//                var users = new ArrayList < > (doc.values());
//                System.out.printf("%s: %n", users.get(1));
//            }
//        }

        //delete the one data
        // Deleting the documents
        collection.deleteOne(Filters.eq("_id", 1));
        System.out.println("Document deleted successfully...");

    }
}