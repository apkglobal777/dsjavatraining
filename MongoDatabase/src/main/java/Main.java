import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Mongo Database is NoSql means Object based Database, faster than SQL, easy to use
    //1. create the mongo database connection using client
    //2. create mongo db database
    //3. Access the database
    //4. delete the database
    //5. create collections
    //6. Access the collection
    //7. Delete the collection
    //8. Insert the document into collection
    //9. Access the document from collection
    //10. Update the document in collection
    //11. delete the document in collection

    public static void main(String[] args) {
        //create mongo db client for establish the connection
        var client = MongoClients.create("mongodb://localhost:27017/");

        //to create the new database with name expenseDB
        //it will create the new database if database not available with same name else access the database
        var database = client.getDatabase("expenseDB");
        System.out.println("Database is created "+ database.getName());

        //create new collection in mongo db
//        database.createCollection("friends");
//        System.out.println("Collection is created");

        //fetch all the collection from database
        for (String name : database.listCollectionNames())
        {
            System.out.println(name);
        }
//delete the collection from database
//var deleteCollection = database.getCollection("users");
       // deleteCollection.drop();
//insert the document in table
        var insertfaculty = database.getCollection("faculty");


        //insert many document using single method
//        ArrayList<Document> arrayList = new ArrayList<>();
//        var facultydocument = new Document();
//        facultydocument.append("_id",2);
//        facultydocument.append("name","Pawan");
//        facultydocument.append("email","a@gmail.com");
//        facultydocument.append("age",34);
//        arrayList.add(facultydocument);
//
//        var facultydocument1 = new Document();
//        facultydocument1.append("_id",3);
//        facultydocument1.append("name","Rudra");
//        facultydocument1.append("email","a@gmail.com");
//        facultydocument1.append("age",20);
//        arrayList.add(facultydocument1);
//
//        var facultydocument2 = new Document();
//        facultydocument2.append("_id",4);
//        facultydocument2.append("name","Abhay");
//        facultydocument2.append("email","a@gmail.com");
//        facultydocument2.append("age",20);
//        arrayList.add(facultydocument2);
//
//        var facultydocument3 = new Document();
//        facultydocument3.append("_id",5);
//        facultydocument3.append("name","Sakshi");
//        facultydocument3.append("email","a@gmail.com");
//        facultydocument3.append("age",21);
//        arrayList.add(facultydocument3);
//
//        var facultydocument4 = new Document();
//        facultydocument4.append("_id",6);
//        facultydocument4.append("name","Rohit");
//        facultydocument4.append("email","a@gmail.com");
//        facultydocument4.append("age",21);
//        arrayList.add(facultydocument4);
//
//        insertfaculty.insertMany(arrayList);

        //update the data using key in collection
//        insertfaculty.updateMany(new Document("email", "a@gmail.com"),
//                new Document("$set", new Document("name", "Aditi")));

        //delete the document using key in collection




    }
}