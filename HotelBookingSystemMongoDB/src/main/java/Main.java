import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Configure the maven in your project and add mongoDB dependency
    //create hotel booking java application with mongoDB
    //1. Create the client for establish the connection
    //2. Create Database and Collections (HotelBookingDB boookingCollection)
    //3. Create Booking document(noOfRooms, noOfAdults, checkinDate, hotelName, checkoutDate, roomPreference, meals) and insert document into collection
    //4. Update booking document
    //5. Access all bookings document
    //6. Delete the booking document
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //create the mongoDB client for connection
        var client = MongoClients.create("mongodb://localhost:27017/");

        //create or get the database with name hotelBookingDB
        //it will create the database if not exists else access the database
        var hotelDB = client.getDatabase("hotelBookingDB");

        //create the bookingCollection collection in hotelBookingDB database
        //hotelDB.createCollection("bookingCollection");

        //to insert multiple document
//        ArrayList<Document> bookingList = new ArrayList<>();

        //create document and add hotel booking details
//        var bookingDocument = new Document();
        //add the booking info
//        var random = new Random();
//        bookingDocument.append("bookingID", random.nextInt(999999));
//        bookingDocument.append("hotelName", "Renissance");
//        bookingDocument.append("userName", "Pawan Sharma");
//        bookingDocument.append("userEmail", "pawan@gmail.com");
//        bookingDocument.append("userMobile", "8527657955");
//        bookingDocument.append("checkInDate", "28 August 2024");
//        bookingDocument.append("checkOutDate", "29 August 2024");
//        bookingDocument.append("noOfDays", 1);
//        bookingDocument.append("price", 2500);
//        bookingDocument.append("noOfRooms", 1);
//        bookingDocument.append("roomPreference", "River Face");
//        bookingDocument.append("noOfAdults", 2);
//        bookingDocument.append("meal", false);
//        bookingList.add(bookingDocument);
//
//        var bookingDocument1 = new Document();
//        bookingDocument1.append("bookingID", random.nextInt(999999));
//        bookingDocument1.append("hotelName", "Renissance");
//        bookingDocument1.append("userName", "Suraj Sharma");
//        bookingDocument1.append("userEmail", "surah@gmail.com");
//        bookingDocument1.append("userMobile", "676767767");
//        bookingDocument1.append("checkInDate", "28 August 2024");
//        bookingDocument1.append("checkOutDate", "29 August 2024");
//        bookingDocument1.append("noOfDays", 1);
//        bookingDocument1.append("price", 2500);
//        bookingDocument1.append("noOfRooms", 1);
//        bookingDocument1.append("roomPreference", "River Face");
//        bookingDocument1.append("noOfAdults", 1);
//        bookingDocument1.append("meal", false);
//        bookingList.add(bookingDocument1);
//
//        var bookingDocument2 = new Document();
//        bookingDocument2.append("bookingID", random.nextInt(999999));
//        bookingDocument2.append("hotelName", "Renissance");
//        bookingDocument2.append("userName", "Arvind Sharma");
//        bookingDocument2.append("userEmail", "arvind@gmail.com");
//        bookingDocument2.append("userMobile", "56454545");
//        bookingDocument2.append("checkInDate", "28 August 2024");
//        bookingDocument2.append("checkOutDate", "29 August 2024");
//        bookingDocument2.append("noOfDays", 1);
//        bookingDocument2.append("price", 2500);
//        bookingDocument2.append("noOfRooms", 1);
//        bookingDocument2.append("roomPreference", "River Face");
//        bookingDocument2.append("noOfAdults", 2);
//        bookingDocument2.append("meal", false);
//        bookingList.add(bookingDocument2);
        //to access the bookingCollection
        var bookingCollection = hotelDB.getCollection("bookingCollection");
        //to insert the document into bookingCollection
        //bookingCollection.insertMany(bookingList);

        //to update the single document
//        bookingCollection.updateOne(new Document("userName", "Pawan Sharma"),
//                new Document("$set", new Document("meal", true)));

//        Document document = new Document();
//        document.append("noOfAdults", 1);
//        document.append("roomPreference", "Delux");
//        document.append("meal", true);
//        document.append("price", 25000);
//
//        bookingCollection.updateMany(new Document("userName", "Pawan Sharma"),
//                new Document("$set", document));

        //delete one document
//        bookingCollection.deleteOne(new Document("bookingID", 979334));
        bookingCollection.deleteMany(new Document("userName", "Pawan Sharma"));






    }
}