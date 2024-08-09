//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//CRUD operation in Mongo Database with Java

//Add MongoDB driver in java using maven

//Create client for MongoDatabase connection
//Create Database from client
//Create collection from database
//Create document and add in collection
//update document from collection
//delete document in collection
//access document from collection
//drop collection

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

//Database Name: hotelDB, Collection Name: bookingCollection,
//Document key name: bookingID, userName, userEmail, userMobile, checkInDate, checkOutDate
//noOfAdults, noOfChildren, noOfRoom, price, roomType, hotelName, meal, bookingStatus,
//paymentStatus, paymentType, paymentId
public class Main {
    public static void main(String[] args) {

        //to create the client for mongo database connection
        var client = MongoClients.create("mongodb://localhost:27017/");

        //to create or access the database from client
        var hotelDB = client.getDatabase("hotelDB");

        //to create the bookingCollection collection in hotelDB database
        //to check the collection is exists or not

        //to access the collection from database
        var bookingCollection = hotelDB.getCollection("bookingCollection");
        if (bookingCollection.getNamespace().getCollectionName() == "bookingCollection")
        {
            System.out.println("Collection already exists");
        }else {
            hotelDB.createCollection("bookingCollection");
        }

        //for creating random bookingID
        var random = new Random();


        //create document for hotel booking in collection
//        var bookingDocument = new Document();
//        //for creating random bookingID
//        var random = new Random();
//
//        //add data into document in key value pair
//        bookingDocument.append("userName", "Pawan Sharma");
//        bookingDocument.append("userEmail", "pawan@gmail.com");
//        bookingDocument.append("userMobile", "8527657955");
//        bookingDocument.append("hotelName","apna asman");
//        bookingDocument.append("checkInDate", "28 August 2024");
//        bookingDocument.append("checkOutDate", "29 August 2024");
//        bookingDocument.append("meal", false);
//        bookingDocument.append("roomType", "Delux");
//        bookingDocument.append("noOfRoom", 1);
//        bookingDocument.append("noOfAdults", 2);
//        bookingDocument.append("noOfChildren", 0);
//        bookingDocument.append("gst", 18);
//        bookingDocument.append("price", 2500);
//        bookingDocument.append("bookingStatus", true);
//        bookingDocument.append("paymentType", "cash");
//        bookingDocument.append("paymentID", random.nextInt(9999));
//        bookingDocument.append("paymentStatus", false);
//        bookingDocument.append("bookingID", random.nextInt(999999));
//        bookingDocument.append("discount", 20);

        //to add the document into collection
//        bookingCollection.insertOne(bookingDocument);

        //to insert the booking for multiple users
//        ArrayList<Document> bookingList = new ArrayList<>();
//        //create document for hotel booking in collection
//        var bookingDocument = new Document();
//        //add data into document in key value pair
//        bookingDocument.append("userName", "Pawan Sharma");
//        bookingDocument.append("userEmail", "pawan@gmail.com");
//        bookingDocument.append("userMobile", "8527657955");
//        bookingDocument.append("hotelName","apna asman");
//        bookingDocument.append("checkInDate", "28 August 2024");
//        bookingDocument.append("checkOutDate", "29 August 2024");
//        bookingDocument.append("meal", false);
//        bookingDocument.append("roomType", "Delux");
//        bookingDocument.append("noOfRoom", 1);
//        bookingDocument.append("noOfAdults", 2);
//        bookingDocument.append("noOfChildren", 0);
//        bookingDocument.append("gst", 18);
//        bookingDocument.append("price", 2500);
//        bookingDocument.append("bookingStatus", true);
//        bookingDocument.append("paymentType", "cash");
//        bookingDocument.append("paymentID", random.nextInt(9999));
//        bookingDocument.append("paymentStatus", false);
//        bookingDocument.append("bookingID", random.nextInt(999999));
//        bookingDocument.append("discount", 20);
//        bookingList.add(bookingDocument);
//
//        //create document for hotel booking in collection
//        var bookingDocument1 = new Document();
//        //add data into document in key value pair
//        bookingDocument1.append("userName", "Ashutosh Sharma");
//        bookingDocument1.append("userEmail", "ashutosh@gmail.com");
//        bookingDocument1.append("userMobile", "8527657955");
//        bookingDocument1.append("hotelName","apna asman");
//        bookingDocument1.append("checkInDate", "28 August 2024");
//        bookingDocument1.append("checkOutDate", "29 August 2024");
//        bookingDocument1.append("meal", false);
//        bookingDocument1.append("roomType", "Delux");
//        bookingDocument1.append("noOfRoom", 1);
//        bookingDocument1.append("noOfAdults", 2);
//        bookingDocument1.append("noOfChildren", 0);
//        bookingDocument1.append("gst", 18);
//        bookingDocument1.append("price", 2500);
//        bookingDocument1.append("bookingStatus", true);
//        bookingDocument1.append("paymentType", "cash");
//        bookingDocument1.append("paymentID", random.nextInt(9999));
//        bookingDocument1.append("paymentStatus", false);
//        bookingDocument1.append("bookingID", random.nextInt(999999));
//        bookingDocument1.append("discount", 20);
//        bookingList.add(bookingDocument1);
//
//
//        //create document for hotel booking in collection
//        var bookingDocument2 = new Document();
//        //add data into document in key value pair
//        bookingDocument2.append("userName", "Shakib");
//        bookingDocument2.append("userEmail", "shakib@gmail.com");
//        bookingDocument2.append("userMobile", "8527657955");
//        bookingDocument2.append("hotelName","apna asman");
//        bookingDocument2.append("checkInDate", "28 August 2024");
//        bookingDocument2.append("checkOutDate", "29 August 2024");
//        bookingDocument2.append("meal", false);
//        bookingDocument2.append("roomType", "Delux");
//        bookingDocument2.append("noOfRoom", 1);
//        bookingDocument2.append("noOfAdults", 1);
//        bookingDocument2.append("noOfChildren", 0);
//        bookingDocument2.append("gst", 18);
//        bookingDocument2.append("price", 2500);
//        bookingDocument2.append("bookingStatus", true);
//        bookingDocument2.append("paymentType", "cash");
//        bookingDocument2.append("paymentID", random.nextInt(9999));
//        bookingDocument2.append("paymentStatus", false);
//        bookingDocument2.append("bookingID", random.nextInt(999999));
//        bookingDocument2.append("discount", 20);
//        bookingList.add(bookingDocument2);
//
//
//        //create document for hotel booking in collection
//        var bookingDocument3 = new Document();
//        //add data into document in key value pair
//        bookingDocument3.append("userName", "Nitish");
//        bookingDocument3.append("userEmail", "nitish@gmail.com");
//        bookingDocument3.append("userMobile", "8527657955");
//        bookingDocument3.append("hotelName","apna asman");
//        bookingDocument3.append("checkInDate", "28 August 2024");
//        bookingDocument3.append("checkOutDate", "29 August 2024");
//        bookingDocument3.append("meal", false);
//        bookingDocument3.append("roomType", "Delux");
//        bookingDocument3.append("noOfRoom", 1);
//        bookingDocument3.append("noOfAdults", 5);
//        bookingDocument3.append("noOfChildren", 0);
//        bookingDocument3.append("gst", 18);
//        bookingDocument3.append("price", 5500);
//        bookingDocument3.append("bookingStatus", true);
//        bookingDocument3.append("paymentType", "cash");
//        bookingDocument3.append("paymentID", random.nextInt(9999));
//        bookingDocument3.append("paymentStatus", false);
//        bookingDocument3.append("bookingID", random.nextInt(999999));
//        bookingDocument3.append("discount", 20);
//        bookingList.add(bookingDocument3);
//
//
//        //to insert multiple document into collection
//        bookingCollection.insertMany(bookingList);


        //update the document from collection
//        var updateBooking = new Document();
//        updateBooking.append("meal", false);
//        updateBooking.append("noOfAdults", 3);
//        updateBooking.append("price", 4000);
//
//        bookingCollection.updateOne(new Document("userName", "Shakib"),
//                new Document("$set", updateBooking));

        //update many document from collection
//        var updateDocument = new Document();
//        updateDocument.append("meal", true);
//        updateDocument.append("paymentStatus", true);
//        updateDocument.append("noOfAdults", 5);
//        updateDocument.append("roomType", "Luxury");
//        bookingCollection.updateMany(new Document("userName", "Pawan Sharma"),
//                new Document("$set", updateDocument));

        //delete one document from collection
        //bookingCollection.deleteOne(new Document("userName", "Shakib"));

        //delete the multiple document from collection
       //bookingCollection.deleteMany(new Document("userName", "Pawan Sharma"));

        //Creating a collection object
        //Retrieving the documents with where condition
//        BasicDBObject whereQuery = new BasicDBObject();
//        whereQuery.put("bookingID", 288677);
//        FindIterable<Document> cursor = bookingCollection.find(whereQuery);
//        String username = (String) cursor.iterator().next().get("userName");
//        String email = (String) cursor.iterator().next().get("userEmail");
//        System.out.println( username + email);

        FindIterable<Document> result = bookingCollection.find();
        //System.out.println(result.iterator().next());

        for (Document document: result)
        {
            System.out.println(document);
            System.out.println(document.get("userName"));
            System.out.println(document.get("userEmail"));
            System.out.println(document.get("userMobile"));
            System.out.println(document.get("hotelName"));
            System.out.println(document.get("checkInDate"));
            System.out.println(document.get("checkOutDate"));
            System.out.println(document.get("meal"));
            System.out.println(document.get("roomType"));
            System.out.println(document.get("noOfRoom"));

        }

    }
}